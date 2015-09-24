package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.List;

/**
 * Created by lifei on 2015/9/22.
 */
//@ParentPackage("struts-default")
//@Namespace("/")
@Scope("prototype")
/*@Action(value = "inRepository",
        results = {@Result(name = "success", location = "/sussess.jsp"),
                @Result(name = "error", location = "/sussess.jsp")})*/
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
