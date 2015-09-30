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
                @Result(name = "error", location = "/goodsManager.jsp"),
//                @Result(name = "showAll", location = "/showGoodsInformation.jsp"),
//                @Result(name = "addGood", location = "/addGood.jsp")
        })
public class DeliveryDetailAction {

    @Autowired
    private DeliveryDetailServiceImpl deliveryDetailService;

    /**
     * 分页中每页5条记录
     */
    private static final int NUM_PER_PAGE = 3;

    /**
     * 按每页显示5条记录
     *
     * @return
     */
    public String getAll() {
        HttpServletRequest request = ServletActionContext.getRequest();
        int page = 1;
        String tmp = request.getParameter("page");
        if (tmp == null || "".equals(tmp))
            page = 1;
        else page = Integer.parseInt(tmp);
//        System.out.println(page);
        int counts = deliveryDetailService.getCounts();
        System.out.println(counts);
        int total_page =counts % NUM_PER_PAGE == 0 ? (counts / NUM_PER_PAGE) : (counts / NUM_PER_PAGE + 1);
//        if (total_page == 0)
//            total_page = 1;
        if (total_page < page || page <= 0)
            page = 1;
        List<DeliveryDetailVO> dtos = deliveryDetailService.getEntitiesByPage(page, NUM_PER_PAGE);

        request.setAttribute("dtos", dtos);
        request.setAttribute("total_page", total_page);
        request.setAttribute("page", page);
        return "getAll";
    }


}
