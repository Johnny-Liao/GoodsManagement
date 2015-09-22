package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.goodsManagement.service.impl.InRepositoryServiceImpl;
import org.goodsManagement.service.impl.PoiUtils.InRepositoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by lifei on 2015/9/22.
 */
@Controller
@Scope("prototype")
public class InrepositoryAction extends ActionSupport {
    private String filename;
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
    public String getall() {
        System.out.println(filename);
        inRepositoryServiceImpl.selectallmes();
        return SUCCESS;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
