package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.DeptDto;
import org.springframework.stereotype.Component;

/**
 * Created by never on 2015/9/20.
 */
@Component
public class DeptdaoImpl<T> extends BasedaoA<DeptDto> {

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
//        sessionTemplate.
        return sessionTemplate.delete("org.goodsManagement.mapper.DeptDtoMapper.deleteByPrimaryKey", id);
    }

    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(DeptDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.DeptDtoMapper.insert", record);
    }

    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(DeptDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.DeptDtoMapper.insertSelective", record);
    }

    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public DeptDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.DeptDtoMapper.selectByPrimaryKey", id);
    }

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(DeptDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.DeptDtoMapper.updateByPrimaryKeySelective", record);
    }

    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(DeptDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.DeptDtoMapper.updateByPrimaryKey", record);
    }
}
