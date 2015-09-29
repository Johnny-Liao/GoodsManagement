<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2015/9/28
  Time: 23:43
--%>
<%@ page import="org.goodsManagement.ResourceString.Resource" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>库房盘存</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="综合业务管理系统">
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="cont left">
    <div class="content">
        <jsp:include page="fragments/contentTop.jsp"/>
        <div class="ctop"><a href="#">首页</a> &gt; <a href="#">库房盘存</a></div>
            <div class="tum">
                <div class="contlist">
                    <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
                        <%--显示表头标题--%>
                        <tr style="color:#000; font-size:14px; padding:10px 0;">
                            <s:iterator var="column"
                                        value="@org.goodsManagement.ResourceString.Resource@GoodHead" id="headname">
                                <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
                            </s:iterator>
                        </tr>
                        <%--显示表内容--%>
                        <s:iterator value="list" var="column">
                            <tr style="color:#000; font-size:14px; padding:10px 0;">
                                <td align="center" bgcolor="#fff8f8">${goodname}</td>
                                <br>
                                <td align="center" bgcolor="#fff8f8">${sumnum}</td>
                                <br>
                                <td align="center" bgcolor="#fff8f8">${goodunit}</td>
                                <br>
                            </tr>
                        </s:iterator>
                    </table>
                </div>
            </div>
    </div>
</div>
</div>
</body>
</html>
