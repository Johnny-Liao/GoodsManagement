package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by lifei on 2015/9/22.
 */
@Controller
@Scope("prototype")
public class InrepositoryAction extends ActionSupport {
    private String name;

    public String add() {
//        if(name == null || !name.equals("admin")) {
//            this.addFieldError("name", "name is error");
//            this.addFieldError("name", "name is too long");
//            return ERROR;
//        }
        System.out.println(name);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
