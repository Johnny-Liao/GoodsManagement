<%--
  Created by IntelliJ IDEA.
  User: never
  Date: 2015/9/28
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.goodsManagement.ResourceString.Resource" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>人员领用明细管理</title>
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
        <div class="ctop"><a href="#">首页</a> &gt; <a href="#">人员领用明细管理</a> &gt; <a href="#">人员领用明细管理</a>
        </div>
        <form id="formresume" enctype="multipart/form-data" method="post">
            <div class="search">
                <table border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td>订单号：</td>
                        <td><input type="text" name="inrepositoryid" class="s_inputs" value="${inrepositoryid}"/></td>
                        <td>入库时间：</td>
                        <td><input type="text" name="intime" class="s_inputs" value="${intime}"/></td>
                        <td>供应商：</td>
                        <td><input type="text" name="suppliers" class="s_inputs" value="${suppliers}"/></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td><input type="submit" name="submit" id="button" value="查询" class="s_btn"
                                   onclick="javascript:this.form.action='/InRepository!selectbysearch?page=1'"/></td>
                    </tr>
                    <tr>
                        <td><input type="file" name="file"></td>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td><input type="submit" name="submit" id="button3" value="添加入库" class="s_btn"
                                   onclick="javascript:this.form.action='/InRepository!addInrepository'"/></td>
                    </tr>

                </table>
            </div>

            <div class="tum">
                <div class="contlist">
                    <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
                        <%--显示表头标题--%>
                        <tr style="color:#000; font-size:14px; padding:10px 0;">
                            <s:iterator var="column"
                                        value="@org.goodsManagement.ResourceString.Resource@DeliveryDetail"
                                        id="headname">
                                <td align="center" bgcolor="#fff8f8"><s:property value='headname'/></td>
                            </s:iterator>
                        </tr>
                        <%--显示表内容--%>
                        <c:forEach var="dto" items="${dtos}">
                            <tr style="color:#000; font-size:14px; padding:10px 0;">
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.deptname}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.id}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.staffname}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.sex}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.goodname}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.getnumber}"/></td>
                                <td align="center" bgcolor="#fff8f8"><c:out value="${dto.goodtype}"/></td>
                                    <%--<td align="center" bgcolor="#fff8f8"><a--%>
                                    <%--href="/InRepository!selectInrepositoryGoods?inrepositoryid=${inrepositoryid}">查看详细信息</a>--%>
                                    <%--</td>--%>
                            </tr>
                        </c:forEach>
                    </table>
                    <td><input type="submit" name="submit" id="up" value="上一页" class="s_btn"
                               onclick="javascript:this.form.action='/InRepository!dispachar?page=${(page - 1) > 1 ? (page - 1) : 1}'"/>
                    </td>
                    共<s:property value="countpage"></s:property>页
                    当前第<s:property value="page"></s:property>页
                    <td><input type="submit" name="submit" id="down" value="下一页" class="s_btn"
                               onclick="javascript:this.form.action='/InRepository!dispachar?page=${(page + 1) > countpage ? countpage : (page + 1)}'"/>
                    </td>
                </div>

            </div>
        </form>
    </div>
</div>
</div>
</body>
</html>
