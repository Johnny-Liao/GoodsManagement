package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.GetGoodsDao;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2015/9/20.
 */
public class GetGoodsServiceImpl implements BaseServiceI<GetGoodsDto> {
    @Autowired
    private GetGoodsDao getGoodsDao;

    public void addEntity(GetGoodsDto getGoodsDto) {
        getGoodsDao.insert(getGoodsDto);
    }

    public void modifyEntity(GetGoodsDto getGoodsDto) {
        getGoodsDao.updateByPrimaryKey(getGoodsDto);
    }

    public GetGoodsDto loadEntity(int id) {
        return null;
    }

    public GetGoodsDto getEntity(int id) {
        return getGoodsDao.selectByPrimaryKey(id);
    }

    public List<GetGoodsDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(GetGoodsDto getGoodsDto) {
        getGoodsDao.deleteByPrimaryKey(getGoodsDto.getId());
    }
}
