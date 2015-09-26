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
    <div class="ctop"><a href="#">首页</a> &gt; <a href="#">物品信息管理</a> &gt; <a href="#">增加物品</a>
    </div>
    <form id="formresume" method="post">
      <div class="search">
        <table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>品名：</td>
            <td><input type="text" name="goodsVo.goodname" class="s_inputs"/></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>单位：</td>
            <td><input type="text" name="goodsVo.goodunit"  class="s_inputs"/></td>
          </tr>
          <tr>
            <td>数量：</td>
            <td><input type="text" name="goodsVo.goodnumbers" class="s_inputs"/></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td>类型：</td>
            <td><input type="text" name="goodsVo.goodtype"  class="s_inputs"/></td>
          </tr>
          <tr>
            <td><input type="submit"  name="submit" id="button" value="确定"  class="s_btn"  onclick="javascript:this.form.action='/GoodsManager!addGood'"/></td>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
            <td><input type="submit"  name="submit" id="return" value="返回"  class="s_btn"  onclick="javascript:this.form.action='/GoodsManager!getAll'"/></td>
          </tr>
        </table>
      </div>
    </form>
  </div>
</div>
</div>
</body>
</html>