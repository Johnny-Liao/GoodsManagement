package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lifei on 2015/9/22.
 */
//@ParentPackage("struts-default")
//@Namespace("/")
//@Action(value = "inRepository",
//        results = {@Result(name = "success", location = "/success.jsp"),
//                @Result(name = "error", location = "/success.jsp")})
public class InRepositoryAction extends ActionSupport {
    private String filename;
    private List<InRepositoryDto> list;

    public List<InRepositoryDto> getList() {
        return list;
    }

    public void setList(List<InRepositoryDto> list) {
        this.list = list;
    }

    @Autowired
    private InRepositoryServiceImpl inRepositoryServiceImpl;

    /**
     * 用来读取文件并写入数据库
     */
    public String add() {
        System.out.println(filename);
        inRepositoryServiceImpl.addinRepositoryD(filename);
        return SUCCESS;
    }

    public String getAll() {
        System.out.println(filename);
        list = inRepositoryServiceImpl.selectallmes();
        return SUCCESS;
    }

    public String selectbysearch() {
        Inrepositorysql sql = new Inrepositorysql();
        list = inRepositoryServiceImpl.selectbysearch(sql);
        return SUCCESS;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
