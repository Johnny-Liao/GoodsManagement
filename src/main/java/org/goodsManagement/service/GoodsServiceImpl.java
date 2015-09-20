package org.goodsManagement.service;

import org.goodsManagement.dao.impl.GoodsDao;
import org.goodsManagement.po.GoodsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by lifei on 2015/9/20.
 */
public class GoodsServiceImpl<T> implements BaseServiceI<GoodsDto> {
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
     * @param name
     *              需要查询的货品名称
     * @return goods
     *              同意货品名称的集合
     */
    public List<GoodsDto> getEntitiesByname(String name) {
        return goodsDao.selectByName(name);
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
