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
  <title>入库管理</title>
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
    <div class="ctop"><a href="#">首页</a> &gt; <a href="#">入库出库管理</a> &gt; <a href="#">入库管理</a>
    </div>
    <form id="formresume" enctype="multipart/form-data" method="post">
      <div class="search">
        <table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>订单号：</td>
            <td><input type="text" name="inrepositoryid"  class="s_inputs"/></td>
            <td>入库时间：</td>
            <td><input type="text" name="intime"  class="s_inputs"/></td>
            <td>供应商：</td>
            <td><input type="text" name="suppliers"  class="s_inputs"/></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><input type="submit"  name="submit" id="button" value="查询"  class="s_btn"  onclick="javascript:this.form.action='/InRepository!selectbysearch'"/></td>
          </tr>
          <tr>
            <td><input type="file" name="file"></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><input type="submit"  name="submit" id="button3" value="添加入库"  class="s_btn" onclick="javascript:this.form.action='/InRepository!addInrepository'"/></td>
          </tr>

        </table>
      </div>

      <div  class="tum">
        <div class="contlist">
          <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
            <%--显示表头标题--%>
            <tr style="color:#000; font-size:14px; padding:10px 0;">
              <s:iterator var="column" value="@org.goodsManagement.ResourceString.Resource@InrepositoryHead" id="headname">
                <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
              </s:iterator>
            </tr>
            <%--显示表内容--%>
              <s:iterator value="list" var="column">
                <tr style="color:#000; font-size:14px; padding:10px 0;">
                  <td align="center" bgcolor="#fff8f8">${inrepositoryid}</td>
                  <td align="center" bgcolor="#fff8f8">${intime}</td>
                  <td align="center" bgcolor="#fff8f8">${suppliers}</td>
                  <td align="center" bgcolor="#fff8f8">${linkman}</td>
                  <td align="center" bgcolor="#fff8f8">${phone}</td>
                  <td align="center" bgcolor="#fff8f8">${operatorid}</td>
                  <td align="center" bgcolor="#fff8f8"><a href="/InRepository!selectInrepositoryGoods?inrepositoryid=${inrepositoryid}">查看详细信息</a></td>
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