<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lifei
  Date: 2015/9/22
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
页面跳转成功
<table>
  <tr>
    <th>用户ID</th>
    <th>用户名</th>
    <th>用户年龄</th>
    <th>用户地址</th>
  </tr>

  <s:iterator value="list">
    <tr>

      ========<th>${inrepositoryid}</th>======
    </tr>
  </s:iterator>
</table>
</body>
</html>
