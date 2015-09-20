package org.goodsManagement.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by never on 2015/9/20.
 */
public abstract class BasedaoA<T> {

    @Autowired
    protected SqlSessionTemplate sessionTemplate;

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    public abstract int deleteByPrimaryKey(Integer id);

    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    public abstract int insert(T record);

    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    public abstract int insertSelective(T record);

    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    public abstract T selectByPrimaryKey(Integer id);

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    public abstract int updateByPrimaryKeySelective(T record);

    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    public abstract int updateByPrimaryKey(T record);

}
