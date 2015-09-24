package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.List;

/**
 * Created by never on 2015/9/24.
 */

@Action("InRepository")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "success", location = "/success.jsp"),
                @Result(name = "error", location = "/error.jsp"),
                @Result(name = "main", location = "/achiver.jsp")
        })
public class InRepositoryAction extends ActionSupport {
    public InRepositoryAction(){
        System.out.println("action被实例化");
    }
//    private String filename;
//    private List<InRepositoryDto> list;
//
//    public List<InRepositoryDto> getList() {
//        return list;
//    }
//
//    public void setList(List<InRepositoryDto> list) {
//        this.list = list;
//    }
//
//    @Autowired
//    private InRepositoryServiceImpl inRepositoryServiceImpl;

    public String test() {
        return SUCCESS;
    }

    /**
     * 用来读取文件并写入数据库
     */
    /*public String add() {
        System.out.println(filename);
        inRepositoryServiceImpl.addinRepositoryD(filename);

        System.out.println("进入到了action");
        return SUCCESS;
    }*/

    public String getAll() {
//        System.out.println(filename);
//        list = inRepositoryServiceImpl.selectallmes();
        System.out.println("拿到所有信息的方法");
        return "getAll";
    }
//
//    public String selectbysearch() {
//        Inrepositorysql sql = new Inrepositorysql();
//        list = inRepositoryServiceImpl.selectbysearch(sql);
//        return SUCCESS;
//    }
//
//    public String getFilename() {
//        return filename;
//    }
//
//    public void setFilename(String filename) {
//        this.filename = filename;
//    }
}
