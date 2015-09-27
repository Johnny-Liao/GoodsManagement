<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>综合业务管理系统</title>
    <link href="../style/style.css" rel="stylesheet" type="text/css"/>
    <script src="../js/jquery-1.3.2.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $(".subNav").click(function () {
                $(this).toggleClass("currentDd").siblings(".subNav").removeClass("currentDd")
                $(this).toggleClass("currentDt").siblings(".subNav").removeClass("currentDt")
                $(this).next(".navContent").slideToggle(500).siblings(".navContent").slideUp(500);
            })
        })
    </script>
</head>
<body>
<div class="subNavBox">
    <div style="padding-bottom:50px;">
        <div class="subs"><a href="#">物品管理系统</a></div>
        <ul class="navContent " style="display:block">
            <li><a href="/GoodsManager!getAll" target="contentFrame">物品信息管理</a></li>
            <li><a href="#" target="contentFrame">库房盘存</a></li>
            <li><a href="#" target="contentFrame">人员物品领用明细</a></li>
            <li><a href="/InRepository!getAll?page=1" target="contentFrame">入库管理</a></li>
            <li><a href="/OutRepository!getAll" target="contentFrame">出库管理</a></li>
        </ul>
    </div>
</div>
</body>
</html>
