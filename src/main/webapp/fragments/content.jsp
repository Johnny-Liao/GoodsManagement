<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务单位管理</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="综合业务管理系统">
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="../../style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="cont left">
    <div class="content">
        <div class="contentop">
            <div class="welcome">您好：<a href="#">admin</a>，欢迎登综合业务管理系统！</div>
            <div class="time"><span>2015年4月21日</span><span>星期二</span></div>
        </div>
        <div class="ctop"><a href="#">首页</a> &gt; <a href="#">综合业务管理系统</a> &gt; <a href="#">待办申请</a></div>
        <div class="search">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td><input type="text" name="textfield" id="textfield" class="s_input" value="员工编号"
                               onfocus="javascript:this.style.color='#000000';if(this.value=='员工编号')this.value='';"
                               onblur="javascript:if(this.value==''){this.value='员工编号';this.style.color='#CCCCCC';}"/>
                    </td>
                    <td><input type="text" name="textfield2" id="textfield2" class="s_input" value="姓名"
                               onfocus="javascript:this.style.color='#000000';if(this.value=='姓名')this.value='';"
                               onblur="javascript:if(this.value==''){this.value='姓名';this.style.color='#CCCCCC';}"/>
                    </td>
                    <td><input type="text" name="textfield3" id="textfield3" class="s_input" value="性别"
                               onfocus="javascript:this.style.color='#000000';if(this.value=='性别')this.value='';"
                               onblur="javascript:if(this.value==''){this.value='性别';this.style.color='#CCCCCC';}"/>
                    </td>
                    <td><select name="select" id="select" class="s_inputs">
                        <option>政治面貌</option>
                        <option>党员</option>
                        <option>团员</option>
                    </select></td>
                    <td><input type="submit" name="button" id="button" value="查询" class="s_btn"/></td>
                    <td><input type="submit" name="button2" id="button2" value="导出Excel" class="s_btns"/></td>
                </tr>
            </table>
        </div>

        <div class="tum">
            <div class="contlist">
                <table border="0" cellspacing="0" cellpadding="0" style="width:100%;">
                    <tr style="color:#000; font-size:14px; padding:10px 0;">
                        <td align="center" bgcolor="#fff8f8">员工编号</td>
                        <td align="center" bgcolor="#fff8f8">姓名</td>
                        <td align="center" bgcolor="#fff8f8">性别</td>
                        <td align="center" bgcolor="#fff8f8">政治面貌</td>
                        <td align="center" bgcolor="#fff8f8">英语水平</td>
                        <td align="center" bgcolor="#fff8f8">技能等级</td>
                        <td align="center" bgcolor="#fff8f8">职称</td>
                        <td align="center" bgcolor="#fff8f8">手机</td>
                        <td align="center" bgcolor="#fff8f8">户口性质</td>
                        <td align="center" bgcolor="#fff8f8">户口所在地</td>
                        <td align="center" bgcolor="#fff8f8">现居地</td>
                        <td align="center" bgcolor="#fff8f8">邮政编码</td>
                        <td align="center" bgcolor="#fff8f8">电子邮箱</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#ffffff">007</td>
                        <td align="center" bgcolor="#ffffff">安静</td>
                        <td align="center" bgcolor="#ffffff">女</td>
                        <td align="center" bgcolor="#ffffff">团员</td>
                        <td align="center" bgcolor="#ffffff">4级</td>
                        <td align="center" bgcolor="#ffffff">高级</td>
                        <td align="center" bgcolor="#ffffff">UI设计</td>
                        <td align="center" bgcolor="#ffffff">18721657776</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">河北省定州市</td>
                        <td align="center" bgcolor="#ffffff">北京市昌平区</td>
                        <td align="center" bgcolor="#ffffff">073000</td>
                        <td align="center" bgcolor="#ffffff">163@163.com</td>
                    </tr>
                </table>

            </div>

        </div>

    </div>
</div>
</div>
</body>
</html>
