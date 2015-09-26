package org.goodsManagement.dao.impl;

import org.goodsManagement.dao.BasedaoA;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.vo.GoodsVo;
import org.goodsManagement.vo.Warehouse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Jimmyhjy on 2015/9/26.
 */
@Component
public class GoodsDaoImpl extends BasedaoA<GoodsDto> {
    /**
     * 通过主键删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sessionTemplate.delete("org.goodsManagement.mapper.GoodsDtoMapper.deleteByPrimaryKey", id);
    }
    /**
     * 插入记录，必须指定所有的字段
     *
     * @param record
     * @return
     */
    @Override
    public int insert(GoodsDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.GoodsDtoMapper.insert", record);
    }
    /**
     * 插入记录，必须指定非空的字段，但是其他字段可选
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(GoodsDto record) {
        return sessionTemplate.insert("org.goodsManagement.mapper.GoodsDtoMapper.insertSelective", record);
    }
    /**
     * 通过主键获取实体
     *
     * @param id
     * @return
     */
    @Override
    public GoodsDto selectByPrimaryKey(Integer id) {
        return sessionTemplate.selectOne("org.goodsManagement.mapper.GoodsDtoMapper.selectByPrimaryKey", id);
    }
    /**
     * 更新实体类，不需要指定所有的键
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(GoodsDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.GoodsDtoMapper.updateByPrimaryKeySelective", record);
    }
    /**
     * 通过主键来更新实体类
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(GoodsDto record) {
        return sessionTemplate.update("org.goodsManagement.mapper.GoodsDtoMapper.updateByPrimaryKey", record);
    }
    /**
     * 通过货品名称来查询
     *
     * @param name
     *              需要查询的货品名称
     * @return goods
     *              同意货品名称的集合
     */
    public  List<GoodsDto> selectByName(String name) {
        return sessionTemplate.selectList("org.goodsManagement.mapper.GoodsDtoMapper.selectByName", name);
    }
    /**
     * 通过货品名称来查询
     *
     * @return goods
     *              已经分类的Goods集合
     */
    public List<GoodsVo> getEntitieskind() {
        List<GoodsVo> goods =  sessionTemplate.selectList("org.goodsManagement.mapper.GoodsDtoMapper.selectGroupByName");
        return goods;
    }

    /**
     * 获取库房盘存信息
     * @return 所有库房盘存信息
     */
    public List<Warehouse> getWarehouseInventory(String name) {
        return sessionTemplate.selectList("org.goodsManagement.mapper.GoodsDtoMapper.WarehouseInventory",name);
    }

}
