package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.OutRepositoryDto;
import org.goodsManagement.vo.OutGoodsWithSameId;
import org.goodsManagement.vo.OutRepositoryVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */

@Component
public class OutRepositoryDaoImpl extends BasedaoA<OutRepositoryDto> {
    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public OutRepositoryDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.OutRepositoryDtoMapper.selectByPrimaryKey", id);
    }

    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.OutRepositoryDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(OutRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.OutRepositoryDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(OutRepositoryDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.OutRepositoryDtoMapper.insertSelective", record);
    }

    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(OutRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.OutRepositoryDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(OutRepositoryDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.OutRepositoryDtoMapper.updateByPrimaryKey", record);
    }

    /**
     * 显示所有的出库信息
     * @return List of OutRepository
     */
    public List<OutRepositoryVO> selectAll() {
        return sessionTemplate.selectList("org.goodsManagement.mapper.OutRepositoryDtoMapper.selectAll");
    }

    /**
     * 通过id获取货物信息
     * @param outId
     * @return
     */
    public OutRepositoryVO selectOutReposById(String outId) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.OutRepositoryDtoMapper.selectOutReposById", outId);
    }

    /**
     * 通过id来获取不同的货物信息
     * @param id
     * @return
     */
    public List<OutGoodsWithSameId> getDifferentGoodsById(String id) {
        return sessionTemplate.selectList("org.goodsManagement.mapper.OutRepositoryDtoMapper.selectDifferentGoods", id);
    }
}
