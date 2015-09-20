package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.GetGoodsDao;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by admin on 2015/9/20.
 */
public class GetGoodsImpl implements BaseServiceI<GetGoodsDto>{
	
	@Autowired
	@Qualifier("getGoodsDao")
	private GetGoodsDao getGoodsDao;
    public void addEntity(GetGoodsDto detGoodsDto) {
        getGoodsDao.insert(detGoodsDto);
    }

    public void modifyEntity(GetGoodsDto detGoodsDto) {
    	getGoodsDao.updateByPrimaryKey(detGoodsDto);
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

    public void deleteEntity(int id) {
    	getGoodsDao.deleteByPrimaryKey(id);
    }

	@Override
	public void deleteEntity(GetGoodsDto getGoodsDto) {
		getGoodsDao.deleteByPrimaryKey(getGoodsDto.getId());
	}
}
