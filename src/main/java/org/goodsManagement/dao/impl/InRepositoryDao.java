package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.po.InRepositoryDto;
import org.springframework.stereotype.Component;

/**
 * Created by lifei on 2015/9/20.
 */
@Component
public class InRepositoryDao<T> extends BasedaoA<InRepositoryDto> {
    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public InRepositoryDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.InRepositoryDtoMapper.selectByPrimaryKey", id);
    }

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.InRepositoryDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(InRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.InRepositoryDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(InRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.InRepositoryDtoMapper.insertSelective", record);
    }

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(InRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.InRepositoryDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(InRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.InRepositoryDtoMapper.updateByPrimaryKey", record);
    }
}
