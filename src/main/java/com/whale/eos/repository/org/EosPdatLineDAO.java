package com.whale.eos.repository.org;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.whale.eos.demo.entity.org.EosPdatLineInfo;
import com.whale.eos.entity.org.EosPdatLine;

public interface EosPdatLineDAO {
    /**
     * 条件统计
     * 参数:查询条件,null为整张表
     * 返回:查询个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int countByExample(EosPdatLineInfo example);

    /**
     * 批量条件删除
     * 参数:删除条件,null为整张表
     * 返回:删除个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int deleteByExample(EosPdatLineInfo example);

    /**
     * 批量条件查询
     * 参数:查询条件,null查整张表
     * 返回:对象集合
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    List<EosPdatLine> selectByExample(EosPdatLineInfo example);

    /**
     * 批量条件修改，空值条件不修改
     * 参数:1.要修改成的值，2.要修改条件
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int updateByExampleSelective(@Param("record") EosPdatLine record, @Param("example") EosPdatLineInfo example);

    /**
     * 批量条件修改，空值条件会修改成null
     * 参数:1.要修改成的值，2.要修改条件
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int updateByExample(@Param("record") EosPdatLine record, @Param("example") EosPdatLineInfo example);

    /**
     * 物理分页条件查询
     * 参数:1.查询条件 2.分页条件 new RowBounds(2,3) 
            从第2条开始显示，显示3条(从0开始编号)
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    List<EosPdatLine> selectByExampleAndPage(EosPdatLineInfo example, RowBounds rowBound);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int insert(EosPdatLine record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2015-06-21 10:44:01
     */
    int insertSelective(EosPdatLine record);
}