<%--
  Created by IntelliJ IDEA.
  User: johnny
  Date: 15-9-29
  Time: 下午5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login_index</title>
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
    <%--表单开始 --%>
    <form action="/Login!validate" method="post">
        <table class="tdfont" width="707" height="120" border="1" cellpadding="0" cellspacing="0"
               bordercolor="cyan">
            <tr align="center">
                <td height="28" colspan="2"><font
                        style="font-weight:bold;">登陆管理</font></td>
            </tr>
            <tr>
                <td width="233" height="28" align="right">用户名：</td>
                <td width="523" height="28"><label><input type="text" name="username"/>*（必填）</label></td>
            </tr>
            <tr>
                <td height="28">
                    <div align="right">密码：</div>
                </td>
                <td height="28"><label><input type="password" name="password"/>*（必填）</label></td>
            </tr>
            <tr>
                <td height="28">&nbsp;</td>
                <td height="28">
                    <input type="submit" name="submit" value="提交"/>
                    <input type="reset" name="reset" value="重置"/>
                    <font color="#FF0000"><s:property value="#session.msg"/></font>
                </td>
            </tr>
        </table>
    </form>
    <%--表单结束 --%>
</center>
</body>
</html>