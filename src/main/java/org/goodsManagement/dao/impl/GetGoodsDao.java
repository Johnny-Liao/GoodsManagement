package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.po.GoodsDto;
import org.springframework.stereotype.Component;

/**
 * Created by lifei on 2015/9/20.
 */
@Component
public class GetGoodsDao extends BasedaoA<GetGoodsDto> {
    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.GetGoodsDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(GetGoodsDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.GetGoodsDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(GetGoodsDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.GetGoodsDtoMapper.insertSelective", record);
    }
    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public GetGoodsDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.GetGoodsDtoMapper.selectByPrimaryKey", id);
    }
    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(GetGoodsDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.GetGoodsDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GetGoodsDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.GetGoodsDtoMapper.updateByPrimaryKey", record);
    }
}
