<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>综合业务管理系统</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<frameset rows="15%,80%,5%">
    <frame src="fragments/header.jsp" name="topFrame" frameborder="0" border="0" framespacing="0" scrolling="NO" noresize>
    <frameset cols="200,*" frameborder="0" border="0" framespacing="0">
        <frame src="fragments/left.jsp" name="menuFrame" frameborder="0" border="0" framespacing="0" noresize scrolling="NO">
        <frame src="inrepository!getAll" name="contentFrame" frameborder="0" border="0" framespacing="0" scrolling="NO" noresize>
    </frameset>
    <frame src="fragments/footer.jsp" name="footFrame" frameborder="0" border="0" framespacing="0" scrolling="NO" noresize>
</frameset>
</html>