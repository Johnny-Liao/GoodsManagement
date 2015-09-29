package org.goodsManagement.controller;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.service.impl.GoodsServiceImpl;
import org.goodsManagement.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2015/9/26.
 */
@Action("Warehouse")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "Warehouse", location = "/Warehouse.jsp"),
        })
public class WarehouseAction extends ActionSupport {

    public GoodsServiceImpl getGoodsService() {
        return goodsService;
    }

    public void setGoodsService(GoodsServiceImpl goodsService) {
        this.goodsService = goodsService;
    }

    @Autowired
    private GoodsServiceImpl goodsService;
    private List<Warehouse> list;

    public List<Warehouse> getList() {
        return list;
    }

    public void setList(List<Warehouse> list) {
        this.list = list;
    }

    public String warehouse() {
        list = goodsService.getWarehouseInventory1();
        // just for debug
        for (Warehouse wh : list) {
            System.out.println(wh);
        }

        return "Warehouse";

    }
}

