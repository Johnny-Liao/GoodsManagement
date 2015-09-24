package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.vo.InrepositoryGood;
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
                @Result(name = "success", location = "/InrepositoryManager.jsp"),
                @Result(name = "error", location = "/error.jsp"),
                @Result(name = "showmessage", location = "/InrepositoryMessage.jsp"),
                @Result(name = "main", location = "/achiver.jsp")
        })
public class InRepositoryAction extends ActionSupport {
    public InRepositoryAction(){
        System.out.println("action被实例化");
    }
    private String filename;
    private String inrepositoryid;
    private String intime;
    private String suppliers;
    private List<InrepositoryGood> listGoods;


    private List<InRepositoryDto> list;

    public List<InRepositoryDto> getList() {
        return list;
    }

    public void setList(List<InRepositoryDto> list) {
        this.list = list;
    }
//
    @Autowired
    private InRepositoryServiceImpl inRepositoryServiceImpl;

    public String test() {
        list = inRepositoryServiceImpl.selectallmes();
        System.out.println(list.size());
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
        list = inRepositoryServiceImpl.selectallmes();
        System.out.println("拿到所有信息的方法");
        return "getAll";
    }
    /**
     * 条件查询
     */
    public String selectbysearch() {
        System.out.println(intime);
        System.out.println(suppliers);
        System.out.println(inrepositoryid);
        Inrepositorysql sql = new Inrepositorysql();
        if(intime!=null){
            sql.setIntime(intime);
        }
        if(suppliers!=null){
            sql.setIntime(suppliers);
        }
        if(inrepositoryid!=null){
            sql.setInrepositoryid(inrepositoryid);
        }
        list = inRepositoryServiceImpl.selectbysearch(sql);
        System.out.println(list.size());
        return SUCCESS;
    }

    /**
     *    查询对应的入库信息
     * @return
     */
    public String selectInrepositoryGoods(){
        System.out.println(inrepositoryid);
        listGoods = inRepositoryServiceImpl.selectallingood(inrepositoryid);
        System.out.println(listGoods.size());
        return "showmessage";
    }





    public List<InrepositoryGood> getListGoods() {
        return listGoods;
    }

    public void setListGoods(List<InrepositoryGood> listGoods) {
        this.listGoods = listGoods;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getInrepositoryid() {
        return inrepositoryid;
    }

    public void setInrepositoryid(String inrepositoryid) {
        this.inrepositoryid = inrepositoryid;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
    }

    public InRepositoryServiceImpl getInRepositoryServiceImpl() {
        return inRepositoryServiceImpl;
    }

    public void setInRepositoryServiceImpl(InRepositoryServiceImpl inRepositoryServiceImpl) {
        this.inRepositoryServiceImpl = inRepositoryServiceImpl;
    }

}
