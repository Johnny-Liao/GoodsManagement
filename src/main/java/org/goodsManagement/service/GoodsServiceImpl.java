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

    public GoodsDto loadEntity(int id) {
        return null;
    }
    /**
     * 获得实体类
     *
     * @param id 实体对象的id
     * @return
     */
    public GoodsDto getEntity(int id) {
        return goodsDao.selectByPrimaryKey(id);
    }

    public List<GoodsDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(GoodsDto goodsDto) {

    }
}
