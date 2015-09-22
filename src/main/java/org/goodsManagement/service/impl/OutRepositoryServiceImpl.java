package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.OutRepositoryDaoImpl;
import org.goodsManagement.po.OutRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * Created by admin on 2015/9/20.
 */
public class OutRepositoryServiceImpl implements BaseServiceI<OutRepositoryDto>{
    @Autowired
    @Qualifier("outRepositoryDaoImpl")
    private OutRepositoryDaoImpl outRepositoryDaoImpl;

    public void addEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDaoImpl.insert(outRepositoryDto);
    }

    public void modifyEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDaoImpl.updateByPrimaryKeySelective(outRepositoryDto);
    }

    public OutRepositoryDto loadEntity(int id) {
        return null;
    }

    public OutRepositoryDto getEntity(int id) {
        return outRepositoryDaoImpl.selectByPrimaryKey(id);
    }

    public List<OutRepositoryDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(OutRepositoryDto outRepositoryDto) {
        outRepositoryDaoImpl.deleteByPrimaryKey(outRepositoryDto.getId());
    }
}
