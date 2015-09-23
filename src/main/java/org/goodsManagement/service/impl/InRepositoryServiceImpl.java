package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.InRepositoryDaoImpl;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.service.impl.PoiUtils.InRepositoryUtils;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InRepositoryServiceImpl implements BaseServiceI<InRepositoryDto> {

    @Autowired
    @Qualifier("inRepositoryDaoImpl")
    private InRepositoryDaoImpl inRepositoryDaoImpl;

    @Autowired
    @Qualifier("inRepositoryUtils")
    private InRepositoryUtils inRepositoryUtils;

    public void addEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.insert(inRepositoryDto);
    }

    public void modifyEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.updateByPrimaryKey(inRepositoryDto);
    }

    public InRepositoryDto loadEntity(int id) {
        return null;
    }

    public InRepositoryDto getEntity(int id) {
        return inRepositoryDaoImpl.selectByPrimaryKey(id);
    }

    public List<InRepositoryDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(InRepositoryDto inRepositoryDto) {
        inRepositoryDaoImpl.deleteByPrimaryKey(inRepositoryDto.getId());
    }

    /**
     * 产品入库
     */
    public void addinRepositoryD(String filename) {
        inRepositoryUtils.addPoiUtils(filename);
    }

    /**
     * 按照入库单号查询所有入库的货物，入库数量，以及详细的入库单信息，在另一个jsp页面显示时调用
     */
    public List<InRepositoryDto> selectallmes() {
        return inRepositoryDaoImpl.selectall();
    }

    /**
     * 条件查询
     */
    public List<InRepositoryDto> selectbysearch(Inrepositorysql sql) {
        return inRepositoryDaoImpl.selectsearch(sql);
    }

}
