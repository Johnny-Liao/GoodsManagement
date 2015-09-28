package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.po.GetGoodsDto;
import org.goodsManagement.service.impl.DeliveryDetailServiceImpl;
import org.goodsManagement.vo.DeliveryDetailVO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Created by never on 2015/9/28.
 */
@Action("DeliveryDetail")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {

                @Result(name = "getAll", location = "/deliveryDetail.jsp"),
//                @Result(name = "showGood", location = "/goodsManager.jsp"),
//                @Result(name = "showAll", location = "/showGoodsInformation.jsp"),
//                @Result(name = "addGood", location = "/addGood.jsp")
        })
public class DeliveryDetailAction {

    @Autowired
    private DeliveryDetailServiceImpl deliveryDetailService;

    public String getAll() {
        List<DeliveryDetailVO> dtos = deliveryDetailService.getAllEntities();
//        System.out.println(Arrays.deepToString(dtos.toArray()));
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("dtos", dtos);
        return "getAll";
    }
}
