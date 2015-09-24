package org.goodsManagement.controller;

import org.apache.struts2.convention.annotation.*;

/**
 * Created by never on 2015/9/24.
 */
@Action("testAction")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "success", location = "/success.jsp"),
                @Result(name = "error", location = "/error.jsp"),
                @Result(name = "main", location = "/achiver.jsp")
        })
public class TestAction {

    public String get() {
        return "success";
    }
}
