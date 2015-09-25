package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.po.InRepositoryDto;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.service.impl.PoiUtils.InRepositoryUtils;
import org.goodsManagement.vo.InrepositoryGood;
import org.goodsManagement.vo.InrepositoryShow;
import org.goodsManagement.vo.Inrepositorysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.io.File;
import java.util.List;

/**
 * Created by never on 2015/9/24.
 */

@Action("InRepository")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "getAll", location = "/InrepositoryManager.jsp"),
                @Result(name = "error", location = "/error.jsp"),
                @Result(name = "showmessage", location = "/InrepositoryMessage.jsp"),
                @Result(name = "main", location = "/achiver.jsp")
        })
public class InRepositoryAction extends ActionSupport {
    public InRepositoryAction(){
        System.out.println("action被实例化");
    }
    private File file;
    private String inrepositoryid;
    private String intime;
    private String suppliers;
    private List<InrepositoryGood> listGoods;
    private InrepositoryShow inrepositoryShow;
    @Autowired
    private InRepositoryServiceImpl inRepositoryServiceImpl;
    @Autowired
    private InRepositoryUtils inRepositoryUtils;

    public String getAll() {
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
        if(intime!=null||intime!=" "){
            sql.setIntime(intime);
        }
        if(suppliers!=null||suppliers!=" "){
            sql.setIntime(suppliers);
        }
        if(inrepositoryid!=null||inrepositoryid!=" "){
            sql.setInrepositoryid(inrepositoryid);
        }
        list = inRepositoryServiceImpl.selectbysearch(sql);
        System.out.println(list.size());
        return "getAll";
    }

    /**
     *    查询对应的入库信息
     * @return
     */
    public String selectInrepositoryGoods(){
        System.out.println(inrepositoryid);
        listGoods = inRepositoryServiceImpl.selectallingood(inrepositoryid);
        inrepositoryShow = inRepositoryServiceImpl.selectmesInprositoryId(inrepositoryid);
        System.out.println(listGoods.size());
        return "showmessage";
    }

    /**
     *    通过Excel对订单进行入库
     * @return
     */
    public String addInrepository(){
        System.out.println("开始进行入库");
        String filename = file.getPath();
        System.out.println(filename);
        String inid = inRepositoryUtils.addPoiUtils(filename);
        System.out.println("添加入库成功"+inid);
        this.setInrepositoryid(inid);
        return this.selectInrepositoryGoods();
    }






    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<InrepositoryGood> getListGoods() {
        return listGoods;
    }

    public void setListGoods(List<InrepositoryGood> listGoods) {
        this.listGoods = listGoods;
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
    public InrepositoryShow getInrepositoryShow() {
        return inrepositoryShow;
    }

    public void setInrepositoryShow(InrepositoryShow inrepositoryShow) {
        this.inrepositoryShow = inrepositoryShow;
    }

    private List<InrepositoryShow> list;

    public List<InrepositoryShow> getList() {
        return list;
    }

    public void setList(List<InrepositoryShow> list) {
        this.list = list;
    }

}
