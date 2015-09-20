package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.StaffDto;

/**
 * Created by lifei on 2015/9/20.
 */
public class StaffDao extends BasedaoA<StaffDto> {
    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public StaffDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.StaffDtoMapper.selectByPrimaryKey", id);
    }

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.StaffDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(StaffDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.StaffDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(StaffDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.StaffDtoMapper.insertSelective", record);
    }

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(StaffDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.StaffDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(StaffDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.StaffDtoMapper.updateByPrimaryKey", record);
    }
}
