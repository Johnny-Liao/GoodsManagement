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
  <link href="../style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="cont left">
  <div class="content">
    <jsp:include page="fragments/contentTop.jsp"/>
    <div class="ctop"><a href="#">首页</a> &gt; <a href="#">物品信息管理</a>
    </div>
    <form id="formresume" method="post">
      <div class="search">
        <table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>品名：</td>
            <td><input type="text" name="goodName"  class="s_inputs"/></td>
            <td><input type="submit"  name="submit" id="button" value="查询"  class="s_btn"  onclick="javascript:this.form.action='/GoodsManager!selectByName'"/></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><input type="submit"  name="submit" id="add" value="增加"  class="s_btn"  onclick="javascript:this.form.action='/addGood.jsp'"/></td>
          </tr>
        </table>
      </div>

      <div  class="tum">
        <div class="contlist">
          <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
            <%--显示表头标题--%>
            <tr style="color:#000; font-size:14px; padding:10px 0;">
              <s:iterator var="column" value="@org.goodsManagement.ResourceString.Resource@goodInformationHead" id="headname">
                <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
              </s:iterator>
            </tr>
            <%--显示表内容--%>
            <s:iterator value="list" var="column">
              <tr style="color:#000; font-size:14px; padding:10px 0;">
                <td align="center" bgcolor="#fff8f8">${goodname}</td>
                <td align="center" bgcolor="#fff8f8">${goodunit}</td>
                <td align="center" bgcolor="#fff8f8"><a href="/GoodsManager!showAll?goodName=${goodname}">显示详细信息</a></td>
                <td align="center" bgcolor="#fff8f8"><a href="/GoodsManager!deleteGoods?goodName=${goodname}">删除</a></td>
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