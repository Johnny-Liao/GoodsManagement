package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.GoodsDao;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */
@Service
public class GoodsServiceImpl implements BaseServiceI<GoodsDto> {
    @Autowired
    @Qualifier("goodsDao")
    private GoodsDao goodsDao;

    /**
     * 添加实体
     *
     * @param goodsDto 实体对象
     */
    public void addEntity(GoodsDto goodsDto) {
        goodsDao.insert(goodsDto);
    }

    /**
     * 修改实体
     *
     * @param goodsDto 实体对象(不需指定所有的键)
     */
    public void modifyEntity(GoodsDto goodsDto) {
        goodsDao.updateByPrimaryKey(goodsDto);
    }

    /**
     * 通过ID获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    public GoodsDto getEntity(int id) {
        return goodsDao.selectByPrimaryKey(id);
    }

    /**
     * 通过货品名称来查询
     *
     * @param name 需要查询的货品名称
     * @return goods
     * 同意货品名称的集合
     */
    public List<GoodsDto> getEntitiesByname(String name) {
        return goodsDao.selectByName(name);
    }

    /**
     * 查看商品种类
     *
     * @return goods
     * 已经分类的Goods集合
     */
    public List<GoodsVo> getEntitieskind() {
        return goodsDao.getEntitieskind();
    }

    /**
     * 删除指定ID的商品
     */
    public void deleteEntity(int id) {
        goodsDao.deleteByPrimaryKey(id);
    }

    public List<GoodsDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(GoodsDto goodsDto) {
    }

    public GoodsDto loadEntity(int id) {
        return null;
    }
}
