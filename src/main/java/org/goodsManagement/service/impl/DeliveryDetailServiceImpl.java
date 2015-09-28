package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.DeliveryDetailDaoImpl;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.vo.DeliveryDetailVO;
import org.goodsManagement.vo.GetGoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by johnny on 2015/9/23.
 */
@Service
public class DeliveryDetailServiceImpl implements BaseServiceI<GetGoodsDto> {

    @Autowired
    @Qualifier("deliveryDetailDaoImpl")
    private DeliveryDetailDaoImpl deliveryDetailDaoImpl;

    public void addEntity(GetGoodsDto getGoodsDto) {
        deliveryDetailDaoImpl.insert(getGoodsDto);
    }

    public void modifyEntity(GetGoodsDto getGoodsDto) {
        deliveryDetailDaoImpl.updateByPrimaryKey(getGoodsDto);
    }

    public GetGoodsDto loadEntity(int id) {
        return null;
    }

    public GetGoodsDto getEntity(int id) {
        return deliveryDetailDaoImpl.selectByPrimaryKey(id);
    }

    public List<DeliveryDetailVO> getAllEntities() {
        return deliveryDetailDaoImpl.getAll();
    }

    public void deleteEntity(GetGoodsDto getGoodsDto) {
        deliveryDetailDaoImpl.deleteByPrimaryKey(getGoodsDto.getId());
    }

    /**
     * 通过id来获取显示信息
     *
     * @param id id
     * @return vo
     */
    public GetGoodsVO getGoodsById(int id) {
        return deliveryDetailDaoImpl.getGoodsById(id);
    }

}
