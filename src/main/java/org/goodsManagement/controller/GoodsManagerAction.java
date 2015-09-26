package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.goodsManagement.po.GoodsDto;
import org.goodsManagement.service.impl.GoodsServiceImpl;
import org.goodsManagement.vo.GoodsVo;
import org.goodsManagement.vo.Warehouse;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2015/9/25.
 */

@Action("GoodsManager")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {

                @Result(name = "success", location = "/goodsManager.jsp"),
                @Result(name = "showGood", location = "/goodsManager.jsp"),
                @Result(name = "showAll", location = "/showGoodsInformation.jsp"),
                @Result(name = "addGood", location = "/addGood.jsp")
        })
public class GoodsManagerAction extends ActionSupport implements ServletRequestAware {
    public GoodsManagerAction() {
        System.out.println("action被实例化");
    }

    @Autowired
    private GoodsServiceImpl goodsServiceImpl;
    private String goodName;
    private List<GoodsDto> listGood;
    private List<GoodsVo> list = new ArrayList<GoodsVo>();
    private List<Warehouse> listNumber;
    private HttpServletRequest request;
    private GoodsVo goodsVo;

    public GoodsVo getGoodsVo() {
        return goodsVo;
    }

    public void setGoodsVo(GoodsVo goodsVo) {
        this.goodsVo = goodsVo;
    }

    public List<GoodsDto> getListGood() {
        return listGood;
    }

    public void setListGood(List<GoodsDto> listGood) {
        this.listGood = listGood;
    }

    public List<Warehouse> getListNumber() {
        return listNumber;
    }

    public void setListNumber(List<Warehouse> listNumber) {
        this.listNumber = listNumber;
    }

    public List<GoodsVo> getList() {
        return list;
    }

    public void setList(List<GoodsVo> list) {
        this.list = list;
    }

    public GoodsServiceImpl getGoodsServiceImpl() {
        return goodsServiceImpl;
    }

    public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
        this.goodsServiceImpl = goodsServiceImpl;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    //显示所有物品信息
    public String getAll() {
        list = goodsServiceImpl.getEntitieskind();
        System.out.println("物品的种类大小：" + list.size());
        return SUCCESS;
    }

    //根据物品名称查询
    public String selectByName() {
        System.out.println("物品名称：" + goodName);
        listGood = goodsServiceImpl.getEntitiesByname(goodName);
        GoodsVo goodsVo = new GoodsVo();
        goodsVo.setGoodname(listGood.get(0).getGoodname());
        goodsVo.setGoodunit(listGood.get(0).getGoodunit());
        list.add(goodsVo);
        return "showGood";
    }

    //显示所有物品详细信息
    public String showAll() throws Exception {
        listNumber = goodsServiceImpl.getWarehouseInventory(goodName);
        listGood = goodsServiceImpl.getEntitiesByname(goodName);
        return "showAll";
    }

    //根据物品名称删除物品
    public String deleteGoods() throws Exception {
        System.out.println("删除的物品名称：" + goodName);
        listGood = goodsServiceImpl.getEntitiesByname(goodName);
        goodsServiceImpl.deleteEntity(listGood.get(0).getId());
        getAll();
        return "showGood";
    }

    //增加物品
    public String addGood() {
        System.out.println("增加物品信息:" + goodsVo);
        GoodsDto goodsDto = new GoodsDto();
        goodsDto.setGoodname(goodsVo.getGoodname());
        goodsDto.setGoodunit(goodsVo.getGoodunit());
        goodsDto.setGoodnumbers(goodsVo.getGoodnumbers());
        goodsDto.setGoodtype(goodsVo.getGoodtype());
        System.out.println("增加物品信息:" + goodsDto);
        goodsServiceImpl.addEntity(goodsDto);
        return "addGood";
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
