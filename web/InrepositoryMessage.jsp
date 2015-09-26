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
    <div class="ctop"><a href="#">首页</a> &gt; <a href="#">综合业务管理系统</a> &gt; <a href="#">读取入库单信息</a></div>
    <div  class="tum">
      <div class="contlist">
        <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
          <tr>
            <td colspan="6" align="left" bgcolor="#fff8f8" style="font-size:14px; font-weight:bold; padding-left:16px;">简历基本信息</td>
          </tr>
          <tr>
            <td width="9%" align="right"><span class="red">*</span> 订单号：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield" class="s_inputss" value="<s:property value="inrepositoryShow['inrepositoryid']"/>"/></td>
            <td width="9%" align="right"><span class="red">*</span> 联系人：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield1" class="s_inputss" value="<s:property value="inrepositoryShow['linkman']"/>"/></td>
          </tr>
          <tr>
            <td width="9%" align="right"><span class="red">*</span> 供应商：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield2" class="s_inputss" value="<s:property value="inrepositoryShow['suppliers']"/>"/></td>
            <td width="9%" align="right"><span class="red">*</span> 入库人员：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield3" class="s_inputss" value="<s:property value="inrepositoryShow['staffname']"/>"/></td>
            </tr>
          <tr>
           <td width="9%" align="right"><span class="red">*</span> 联系人电话：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield4" class="s_inputss" value="<s:property value="inrepositoryShow['phone']"/>"/></td>
            <td width="9%" align="right"><span class="red">*</span> 入库时间：</td>
            <td width="18%"><input type="text" name="textfield" id="textfield5" class="s_inputss" value="<s:property value="inrepositoryShow['intime']"/>"/></td>
          </tr>
        </table>
        <h3>入库清单：</h3>
        <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
          <%--显示表头标题--%>
          <tr style="color:#000; font-size:14px; padding:10px 0;">
            <s:iterator var="column" value="@org.goodsManagement.ResourceString.Resource@InrepositoryGoodHead" id="headname">
              <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
            </s:iterator>
          </tr>
          <%--显示表内容--%>
          <s:iterator value="listGoods" var="column">
            <tr style="color:#000; font-size:14px; padding:10px 0;">
              <td align="center" bgcolor="#fff8f8">${goodname}</td><br>
              <td align="center" bgcolor="#fff8f8">${goodnumber}</td><br>
              <td align="center" bgcolor="#fff8f8">${goodunit}</td><br>
              <td align="center" bgcolor="#fff8f8">${goodtype}</td><br>
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
