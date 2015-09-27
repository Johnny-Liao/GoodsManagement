package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.service.impl.OutRepositoryServiceImpl;
import org.goodsManagement.service.impl.PoiUtils.OutRepositoryUtils;
import org.goodsManagement.vo.OutGoodsWithSameId;
import org.goodsManagement.vo.OutRepositoryVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.List;

/**
 * Created by johnny on 15-9-26.
 */
@Action("OutRepository")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "getAll", location = "/OutRepositoryManager.jsp"),
                @Result(name = "showMessage", location = "/OutRepositoryMessage.jsp"),
                @Result(name = "error", location = "/error.jsp"),
        })
public class OutRepositoryAction extends ActionSupport {
    @Autowired
    private OutRepositoryServiceImpl outRepositoryService;
    private List<OutRepositoryVO> list;
    private OutRepositoryVO outRepositoryVO;
    private String outrepositoryid;
    private OutRepositoryVO vo;
    private List<OutGoodsWithSameId> outGoodsWithSameIdList;
    private File file;
    @Autowired
    private OutRepositoryUtils outRepositoryUtils;

    /**
     * 显示所有的出库信息
     * @return
     */
    public String getAll() {
        list = outRepositoryService.getAllOutRepositoryVO();
        // just for debug
        for (OutRepositoryVO vo : list) {
            System.out.println(vo);
        }
        return "getAll";
    }

    /**
     * 根据outrepositoryid显示相应的出库详细信息
     * @return
     */
    public String selectOutRepositoryById() {
        vo = outRepositoryService.getOutReposById(outrepositoryid);
        outGoodsWithSameIdList = outRepositoryService.getDifferentGoodsById(outrepositoryid);
        return "showMessage";
    }

    /**
     * 通过excel添加出库信息
     * @return
     */
    public String addOutRepository() {
        System.out.println("开始进行出库");
        String filename = file.getPath();
        System.out.println(filename);
        String inid = outRepositoryUtils.addoutgoodsPoiUtils(filename);
        System.out.println("添加出库成功"+inid);
        this.setOutrepositoryid(inid);
        return this.selectOutRepositoryById();

    }

    public OutRepositoryServiceImpl getOutRepositoryService() {
        return outRepositoryService;
    }

    public void setOutRepositoryService(OutRepositoryServiceImpl outRepositoryService) {
        this.outRepositoryService = outRepositoryService;
    }

    public List<OutRepositoryVO> getList() {
        return list;
    }

    public void setList(List<OutRepositoryVO> list) {
        this.list = list;
    }

    public OutRepositoryVO getOutRepositoryVO() {
        return outRepositoryVO;
    }

    public void setOutRepositoryVO(OutRepositoryVO outRepositoryVO) {
        this.outRepositoryVO = outRepositoryVO;
    }

    public String getOutrepositoryid() {
        return outrepositoryid;
    }

    public void setOutrepositoryid(String outrepositoryid) {
        this.outrepositoryid = outrepositoryid;
    }

    public OutRepositoryVO getVo() {
        return vo;
    }

    public void setVo(OutRepositoryVO vo) {
        this.vo = vo;
    }


    public List<OutGoodsWithSameId> getOutGoodsWithSameIdList() {
        return outGoodsWithSameIdList;
    }

    public void setOutGoodsWithSameIdList(List<OutGoodsWithSameId> outGoodsWithSameIdList) {
        this.outGoodsWithSameIdList = outGoodsWithSameIdList;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public OutRepositoryUtils getOutRepositoryUtils() {
        return outRepositoryUtils;
    }

    public void setOutRepositoryUtils(OutRepositoryUtils outRepositoryUtils) {
        this.outRepositoryUtils = outRepositoryUtils;
    }
}
