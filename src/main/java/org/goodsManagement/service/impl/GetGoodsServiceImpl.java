package org.goodsManagement.service.impl;

import org.goodsManagement.dao.impl.GetGoodsDaoImpl;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.BaseServiceI;
import org.goodsManagement.vo.GetGoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by johnny on 2015/9/23.
 */
@Service
public class GetGoodsServiceImpl implements BaseServiceI<GetGoodsDto> {
    @Autowired
    @Qualifier("getGoodsDaoImpl")
    private GetGoodsDaoImpl getGoodsDaoImpl;

    public void addEntity(GetGoodsDto getGoodsDto) {
        getGoodsDaoImpl.insert(getGoodsDto);
    }

    public void modifyEntity(GetGoodsDto getGoodsDto) {
        getGoodsDaoImpl.updateByPrimaryKey(getGoodsDto);
    }

    public GetGoodsDto loadEntity(int id) {
        return null;
    }

    public GetGoodsDto getEntity(int id) {
        return getGoodsDaoImpl.selectByPrimaryKey(id);
    }

    public List<GetGoodsDto> getAllEntities() {
        return null;
    }

    public void deleteEntity(GetGoodsDto getGoodsDto) {
        getGoodsDaoImpl.deleteByPrimaryKey(getGoodsDto.getId());
    }

    /**
     * 通过id来获取显示信息
     * @param id id
     * @return vo
     */
    public GetGoodsVO getGoodsById(int id) {
        return getGoodsDaoImpl.getGoodsById(id);
    }

}
