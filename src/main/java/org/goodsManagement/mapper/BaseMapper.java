package org.goodsManagement.mapper;

/**
 * Created by never on 2015/9/20.
 */
public interface BaseMapper<T> {
    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(Integer id);

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(T record);
}
