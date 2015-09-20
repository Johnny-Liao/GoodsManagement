package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.OutRepositoryDao;
import org.goodsManagement.po.OutRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2015/9/20.
 */
public class OutRepositoryServiceImpl implements BaseServiceI<OutRepositoryDto>{
    @Autowired
    private OutRepositoryDao outRepositoryDao;

    public void addEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDao.insert(outRepositoryDto);
    }

    public void modifyEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDao.updateByPrimaryKeySelective(outRepositoryDto);
    }

    public OutRepositoryDto loadEntity(int id) {
        return null;
    }

    public OutRepositoryDto getEntity(int id) {
        return outRepositoryDao.selectByPrimaryKey(id);
    }

    public List<OutRepositoryDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDao.deleteByPrimaryKey(outRepositoryDto.getId());
    }
}
