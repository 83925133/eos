package com.whale.eos.repository.menu;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.whale.eos.entity.menu.EosRight;
import com.whale.eos.entity.menu.EosRightExample;

public interface EosRightDAO {
    /**
     * 条件统计
     * 参数:查询条件,null为整张表
     * 返回:查询个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int countByExample(EosRightExample example);

    /**
     * 批量条件删除
     * 参数:删除条件,null为整张表
     * 返回:删除个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int deleteByExample(EosRightExample example);

    /**
     * 批量条件查询
     * 参数:查询条件,null查整张表
     * 返回:对象集合
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    List<EosRight> selectByExample(EosRightExample example);

    /**
     * 批量条件修改，空值条件不修改
     * 参数:1.要修改成的值，2.要修改条件
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int updateByExampleSelective(@Param("record") EosRight record, @Param("example") EosRightExample example);

    /**
     * 批量条件修改，空值条件会修改成null
     * 参数:1.要修改成的值，2.要修改条件
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int updateByExample(@Param("record") EosRight record, @Param("example") EosRightExample example);

    /**
     * 物理分页条件查询
     * 参数:1.查询条件 2.分页条件 new RowBounds(2,3) 
            从第2条开始显示，显示3条(从0开始编号)
     * 返回:成功修改个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    List<EosRight> selectByExampleAndPage(EosRightExample example, RowBounds rowBound);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int insert(EosRight record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2015-06-11 03:58:40
     */
    int insertSelective(EosRight record);
}