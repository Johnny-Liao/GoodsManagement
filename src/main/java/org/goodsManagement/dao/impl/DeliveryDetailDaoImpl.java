package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.vo.DeliveryDetailVO;
import org.goodsManagement.vo.GetGoodsVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by johnny on 2015/9/23.
 */
@Component
public class DeliveryDetailDaoImpl extends BasedaoA<GetGoodsDto> {
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
        return sessionTemplate.selectOne("org.goodsManagement.mapper.GetGoodsDtoMapper.getGoodsById", id);
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


    /**
     * 通过id获取页面显示信息
     *
     * @param id 传入的id
     * @return VO用于显示
     */
    public GetGoodsVO getGoodsById(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.GetGoodsDtoMapper.getGoodsById", id);
    }

    public List<GetGoodsVO> allGetGoodsInfo() {
        return sessionTemplate.selectList("org.goodsManagement.mapper.GetGoodsDtoMapper.allGetGoodsInfo");
    }

    public List<DeliveryDetailVO> getAll() {
        return sessionTemplate.selectList("org.goodsManagement.mapper.GetGoodsDtoMapper.selectAll");
    }
}
