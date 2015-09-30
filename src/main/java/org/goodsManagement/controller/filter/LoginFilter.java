package org.goodsManagement.controller.filter;

import org.goodsManagement.dao.impl.UserDaoImpl;
import org.goodsManagement.po.UserDto;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by never on 2015/9/29.
 */
public class LoginFilter implements Filter {

    /**
     * 拦截白名单
     */
    private static final String[] FILTER_STRING = {"/login.jsp", "/error.jsp", "/Login"};

    private boolean checkString(String string) {
        for (String str : FILTER_STRING) {
            if (string.startsWith(str))
                return true;
        }
        return false;
    }

//    private UserDaoImpl userDao;

    public void init(FilterConfig filterConfig) throws ServletException {
        //这里获取Spring管理的bean，使用注解的方式好像不奏效
//        WebApplicationContext wac = WebApplicationContextUtils
//                .getRequiredWebApplicationContext(filterConfig.getServletContext());
//        userDao = (UserDaoImpl) wac.getBean("userDaoImpl");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;
        HttpSession session = request1.getSession();

        String URI = request1.getRequestURI();

        //这是拦截白名单
        if (checkString(URI)) {
            chain.doFilter(request, response);
        } else {
            UserDto user = (UserDto) session.getAttribute("user");

            //表示之前登录过
            if (user != null/* && userDao.existUser(user) != null*/) {
                chain.doFilter(request, response);
            } else
                //表示之前没有登陆过
                response1.sendRedirect("/login.jsp");
        }
    }

    public void destroy() {

    }
}
