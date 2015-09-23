package org.goodsManagement.service.impl;

import java.util.List;

import org.goodsManagement.dao.impl.InRepositoryDao;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;

public class InRepositoryImpl implements BaseServiceI<InRepositoryDto> {

    @Autowired
    private InRepositoryDao inRepositoryDao;

    public void addEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDao.insert(inRepositoryDto);
    }

    public void modifyEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDao.updateByPrimaryKey(inRepositoryDto);
    }

    public InRepositoryDto loadEntity(int id) {
        return null;
    }

    public InRepositoryDto getEntity(int id) {
        return inRepositoryDao.selectByPrimaryKey(id);
    }

    public List<InRepositoryDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDao.deleteByPrimaryKey(inRepositoryDto.getId());
    }

}
