package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.OutRepositoryDaoImpl;
import org.goodsManagement.po.OutRepositoryDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.vo.OutGoodsWithSameId;
import org.goodsManagement.vo.OutRepositoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * OutRepositoryService
 * Created by Johnny on 2015/9/26.
 */
@Service
public class OutRepositoryServiceImpl implements BaseServiceI<OutRepositoryDto> {
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

    /**
     * 显示所有出库信息
     * @return
     */
    public List<OutRepositoryVO> getAllOutRepositoryVO() {
        return outRepositoryDaoImpl.selectAll();
    }

    /**
     * 通过出库物品id来查询相应的物品记录
     * @param outId
     * @return
     */
    public OutRepositoryVO getOutReposById(String outId) {
        return outRepositoryDaoImpl.selectOutReposById(outId);
    }

    /**
     * 通过id来获取不同的货物信息
     * @param id
     * @return
     */
    public List<OutGoodsWithSameId> getDifferentGoodsById(String id) {
        return outRepositoryDaoImpl.getDifferentGoodsById(id);
    }
}
