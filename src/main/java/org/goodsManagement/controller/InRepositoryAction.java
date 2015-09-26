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
    private List<InrepositoryShow> list;
    private int countpage;
    private int page;



    @Autowired
    private InRepositoryServiceImpl inRepositoryServiceImpl;
    @Autowired
    private InRepositoryUtils inRepositoryUtils;

    /**
     *    判断是获取所有信息还是进行条件查询
     * @return
     */
    public String dispachar(){
        System.out.println(intime);
        if((suppliers != null && suppliers.equals("")==false)
                ||(inrepositoryid != null && inrepositoryid.equals("")==false)
                ||(intime != null && intime.equals("")==false)
                ){
            return this.selectbysearch();
        }else{
            return this.getAll();
        }
    }


    /**
     *    获取所有的订单信息
     * @return
     */
    public String getAll() {
        System.out.println(page);
        int pagetemp = (page-1);
        list = inRepositoryServiceImpl.selectbypage(pagetemp);
        countpage = inRepositoryServiceImpl.selectcountpage();
        System.out.println(countpage);
        System.out.println("拿到所有信息的方法");
        return "getAll";
    }
    /**
     * 条件查询
     */
    public String selectbysearch() {
        Inrepositorysql sql = new Inrepositorysql();
        if(intime != null && intime.equals("")==false){
            String s = intime;
            sql.setIntime(s);
        }

        if(suppliers != null && suppliers.equals("")==false){
            String ss = suppliers;
            sql.setSuppliers(ss);
        }

        if(inrepositoryid != null && inrepositoryid.equals("")==false){
            String sss = inrepositoryid;
            sql.setInrepositoryid(sss);
        }
        if(page!=0){
            int temppage = (page-1)*3;
            sql.setPage(temppage);
        }

        list = inRepositoryServiceImpl.selectbysearch(sql);
        countpage = inRepositoryServiceImpl.selectcountsearchpage(sql);
        System.out.println("通过条件查询统计有"+countpage+"页");
        System.out.println("通过条件查询统计有"+countpage+"页");
        System.out.println("通过条件查询统计有"+countpage+"页");
        System.out.println("通过条件查询统计有"+countpage+"页");
        System.out.println(sql.getIntime());
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


    public List<InrepositoryShow> getList() {
        return list;
    }

    public void setList(List<InrepositoryShow> list) {
        this.list = list;
    }
    public int getCountpage() {
        return countpage;
    }

    public void setCountpage(int countpage) {
        this.countpage = countpage;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
