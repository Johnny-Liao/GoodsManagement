package org.goodsManagement.service.impl;

import java.util.List;

import org.goodsManagement.dao.impl.InRepositoryDao;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;

public class InRepositoryImpl implements BaseServiceI<InRepositoryDto>{
	
	@Autowired
	private InRepositoryDao inRepositoryDao;
	@Override
	public void addEntity(InRepositoryDto inRepositoryDto) {
		inRepositoryDao.insert(inRepositoryDto);
	}
	
	@Override
	public void modifyEntity(InRepositoryDto inRepositoryDto){
		inRepositoryDao.updateByPrimaryKey(inRepositoryDto);
	}

	@Override
	public InRepositoryDto loadEntity(int id) {
		return null;
	}

	@Override
	public InRepositoryDto getEntity(int id) {
		return inRepositoryDao.selectByPrimaryKey(id);
	}

	@Override
	public List<InRepositoryDto> getAllEntities() {
		return null;
	}

	@Override
	public void deleteEntity(InRepositoryDto inRepositoryDto) {
		inRepositoryDao.deleteByPrimaryKey(inRepositoryDto.getId());
	}
	
}
