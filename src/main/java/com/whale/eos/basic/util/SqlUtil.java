package com.whale.eos.basic.util;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DataSourceUtils;

import com.whale.eos.basic.util.spring.SpringContextHolder;

public class SqlUtil {

    private static final Logger logger = LoggerFactory.getLogger(SqlUtil.class);

//    public static final String LIKE_SINGLE = "_";// 单字符匹配
//    public static final String LIKE_MULTI = "%";// 多字符匹配
//    public static final String LIKE_DOUBLE = LIKE_SINGLE + LIKE_SINGLE; // 双字符匹配


    public static JdbcTemplate getJdbcTemplate() {
        return (JdbcTemplate) SpringContextHolder.getBean("jdbcTemplate");
    }

    /**
     * 执行SQL语句
     *
     * @param sql
     * @throws Exception
     */
    public static long queryForLong(String sql) throws Exception {
        JdbcTemplate template = getJdbcTemplate();
        if (template == null) {
            throw new IllegalStateException("jdbcTemplate未注入,请在applicationContext.xml中定义JdbcTemplate");
        }
        return template.queryForObject(sql, Long.class);
    }

    /**
     * 执行SQL语句
     *
     * @param sql
     * @throws Exception
     */
    public static void executeSql(String sql) throws Exception {
        JdbcTemplate template = getJdbcTemplate();
        if (template == null) {
            throw new IllegalStateException("jdbcTemplate未注入,请在applicationContext.xml中定义JdbcTemplate");
        }
        template.execute(sql);
    }

    /**
     * 执行SQL语句
     *
     * @param sql param 参数
     * @throws Exception
     */
    public static void update(String sql, Object... param) throws Exception {
        //jdbcTemplate.update("update t_customer_info set name = ? where customer_pk = ?", new Object[] {name, pk});
        //jdbcTemplate.update("insert t_customer_info values (?, ?, ?, ?)", new Object[] {user.getId(), user.getName(), user.getSex(), user.getAge()});
        JdbcTemplate template = getJdbcTemplate();
        if (template == null) {
            throw new IllegalStateException("jdbcTemplate未注入,请在applicationContext.xml中定义JdbcTemplate");
        }
        template.update(sql, param);
    }

    /**
     * SQL语句查询记录数
     *
     * @param sql         查询SQL语句
     * @param arrayLength 每条记录中字段个数
     * @return
     * @throws Exception
     */
    public static List<Object[]> queryList(String sql, final int arrayLength) throws Exception {
        JdbcTemplate template = getJdbcTemplate();
        if (template == null) {
            return null;
        }
        return template.query(sql, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Object[] array = new Object[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = rs.getObject(i + 1);
                }
                return array;
            }
        });
    }
    /**
     * SQL语句查询记录数
     *
     * @param sql         查询SQL语句
     * @param arrayLength 每条记录中字段个数
     * @return
     * @throws Exception
     */
	public static List<Object[]> queryList(String sql, Object[] args, final int arrayLength) throws Exception {
        JdbcTemplate template = getJdbcTemplate();
        if (template == null) {
            return null;
        }
        return template.query(sql, args, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Object[] array = new Object[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = rs.getObject(i + 1);
                }
                return array;
            }
        });
    }

    /**
     * 调数据库存储过程,无返回参数
     */
    public static void callDBProc(String procName, Object[] args) {
        try {
            doSpringCallProcedure(procName, args);
        } catch (Exception e) {
            logger.error("call proc " + procName + " fail!", e);
        }
    }

    /**
     * 调数据库存储过程,返回参数
     */
    public static List<Object[]> callDBProcWithResult(String procName, Object[] args, int columnLength) {
        try {
            return doSpringCallProcedureWithResult(procName, args, columnLength);
        } catch (Exception e) {
            logger.error("call proc " + procName + " fail!", e);
        }
        return null;
    }

    /**
     * 调数据库存储过程,无返回参数。如果错误抛出异常
     */
    public static void callDBProcWithException(String procName, Object[] args) throws Exception {
        try {
            doSpringCallProcedureWithException(procName, args);
        } catch (Exception e) {
            logger.error("call proc " + procName + " fail!", e);
            throw e;
        }
    }

    public static void doSpringCallProcedure(final String name, Object[] args) {
        Connection conn = null;
        try {
            conn = getConnection();
            doCallProcedure(conn, name, args, true, 0);
        } catch (Exception e) {
            logger.error("call plsql failurel", e);
        } finally {
            closeConnection(conn);
        }
    }

    public static List<Object[]> doSpringCallProcedureWithResult(final String name, Object[] args, int columnLength) {
        Connection conn = null;
        try {
            conn = getConnection();
            return doCallProcedure(conn, name, args, true, columnLength);
        } catch (Exception e) {
            logger.error("call plsql failurel", e);
        } finally {
            closeConnection(conn);
        }
        return null;
    }

    public static void doSpringCallProcedureWithException(final String name, Object[] args) throws Exception {
        Connection conn = null;
        try {
            conn = getConnection();
            doCallProcedure(conn, name, args, true, 0);
        } catch (Exception e) {
            logger.error("call plsql failurel", e);
            throw e;
        } finally {
            closeConnection(conn);
        }
    }

    /**
     * 获取数据库连接
     *
     * @return connection
     */
    public static Connection getConnection() {
        Connection con = null;
        try {
        	//con = getJdbcTemplate().getDataSource().getConnection();
            con = DataSourceUtils.getConnection(getJdbcTemplate().getDataSource());
            //不提供自动commit功能，必须手动提交，以保证事务完整性
            con.setAutoCommit(false);
        } catch (SQLException e) {
            logger.error("get Connection fail", e);
        }
        return con;
    }

    public static List<Object[]> doCallProcedure(Connection conn, final String name, Object[] args, boolean logging, int columnLength)
            throws Exception {
        String sql = toExecSql(name, args);
        try {
            CallableStatement stmt = conn.prepareCall(sql);
            if (logging) {
                logger.debug(sql + " arg = " + ObjectUtils.toString(args));
            }
            try {
                int length = args.length;
                for (int i = 0; i < length; i++) {
                    Object arg = args[i];
                    stmt.setObject(i + 1, arg);
                }
                boolean hadResults = stmt.execute();
                if (hadResults) {
                    return resultToList(stmt, columnLength);
                }
            } finally {
                closeStatement(stmt);
            }
        } catch (SQLException e) {
            throw e;
        }
        return null;
    }

    public static List<Object[]> resultToList(CallableStatement stmt, int columnLength) throws SQLException {
        ResultSet resultSet = stmt.getResultSet();
        List<Object[]> list = new ArrayList<Object[]>();
        while (resultSet != null && resultSet.next()) {
            Object[] objects = new Object[columnLength];
            for (int index = 1; index <= columnLength; index++) {
                objects[index - 1] = resultSet.getObject(index);
            }
            list.add(objects);
        }
        closeResultSet(resultSet);
        return list;
    }

    private static void closeResultSet(ResultSet resultSet) {
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    private static String toExecSql(String name, Object[] args) {
        String sql = "{ call " + name + "( ";
        if (args != null && args.length > 0) {
            sql += "?";
            int length = args.length;
            for (int i = 1; i < length; i++)
                sql += ", ?";
        }
        sql += " ) }";
        return sql;
    }

    public static final void closeConnection(Connection conn) {
        if (null != conn) {
            try {
//                conn.close();
                DataSourceUtils.releaseConnection(conn, getJdbcTemplate().getDataSource());
            } catch (Exception e) {
            }
        }
    }

    public static final void closeStatement(Statement stmt) {
        if (null != stmt) {
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }
    }

}
