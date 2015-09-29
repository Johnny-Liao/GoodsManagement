package org.goodsManagement.controller;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.convention.annotation.*;
import org.goodsManagement.po.UserDto;
import org.goodsManagement.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Deal with login and logout.
 * Created by johnny on 15-9-29.
 */
@Action("Login")
@ParentPackage("struts-default")
@Namespace("/")
@Results(
        {
                @Result(name = "PASS", location = "/index.jsp"),
                @Result(name = "NOT_PASS", location = "/login.jsp"),
                @Result(name = "error", location = "/error.jsp")
        })
public class LoginAction {

    @Autowired
    UserServiceImpl userService;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validate() {
        Map<String, Object> session = ActionContext.getContext().getSession();
        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        userDto.setPassword(password);
        if (userService.existUser(userDto) == null) {
            session.put("msg", "用户名或密码出错！");
            return "NOT_PASS";
        }
        session.put("user", userDto);
        return "PASS";
    }

    public String logout() {
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.remove("user");
        session.put("msg", "退出成功！");
        return "NOT_PASS";
    }
}
