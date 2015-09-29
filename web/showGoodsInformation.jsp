<%@ page import="org.goodsManagement.ResourceString.Resource" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: lifei
  Date: 2015/9/24
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>物品信息管理</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="综合业务管理系统">
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="cont left">
    <div class="content">
        <jsp:include page="fragments/contentTop.jsp"/>
        <div class="ctop"><a href="#">首页</a> &gt; <a href="#">物品信息管理</a> &gt; <a href="#">显示物品详细信息</a>
        </div>
        <form id="formresume" method="post">
            <div class="search">
                <table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td>品名：</td>
                        <td><input type="text" name="goodName" value="<s:property value="listGood[0].goodname"/>"
                                   class="s_inputs"/></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td>单位：</td>
                        <td><input type="text" name="goodUnit" value="<s:property value="listGood[0].goodunit"/>"
                                   class="s_inputs"/></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td><input type="submit" name="submit" id="return" value="返回" class="s_btn"
                                   onclick="javascript:this.form.action='/GoodsManager!getAll'"/></td>
                    </tr>
                </table>
            </div>

            <div class="tum">
                <div class="contlist">
                    <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
                        <%--显示表头标题--%>
                        <tr style="color:#000; font-size:14px; padding:10px 0;">
                            <s:iterator var="column"
                                        value="@org.goodsManagement.ResourceString.Resource@goodNuberAndTypeHead"
                                        id="headname">
                                <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
                            </s:iterator>
                        </tr>
                        <%--显示表内容--%>
                        <s:iterator value="listGood" var="column">
                            <tr style="color:#000; font-size:14px; padding:10px 0;">
                                <td align="center" bgcolor="#fff8f8">${goodnumbers}</td>
                                <td align="center" bgcolor="#fff8f8">${goodtype}</td>
                            </tr>
                        </s:iterator>
                    </table>

                </div>

            </div>
        </form>
    </div>
</div>
</div>
</body>
</html>