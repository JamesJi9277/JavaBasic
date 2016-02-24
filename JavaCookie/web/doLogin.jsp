<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/24/16
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.net.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doLogin</title>
</head>
<body>
<h1><font color="red">登陆成功</font></h1>
<br>
<br>
<br>
<br>

<%
    //先判断用户是否之前有选择保存登录状态
    request.setCharacterEncoding("utf-8");
    String[] isUseCookie = request.getParameterValues("isUseCookie");//与login页面的checkbox名字相同
    if(isUseCookie != null && isUseCookie.length != 0) {
        //如果有的话就可以直接用request调取
        //解决中文问题

        String username = URLEncoder.encode(request.getParameter("username"), "utf-8");
        String password = URLEncoder.encode(request.getParameter("password"), "utf-8");
        //生成新的cookie并且设置时效为10天
        Cookie usernameCookie = new Cookie("username", username);
        Cookie passwordCookie = new Cookie("password", password);

        usernameCookie.setMaxAge(864000);
        passwordCookie.setMaxAge(864000);
        //别忘了用response加上新建的cookie
        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);
    }
    else {
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0) {
            for(Cookie c : cookies) {
                if(c.getName().equals("username") || c.getName().equals("password")) {
                    c.setMaxAge(0);//设置cookie失效
                    response.addCookie(c);//重新保存
                }
            }
        }
    }
%>
<a href="users.jsp" targe="_blank">查看用户信息</a>
</body>
</html>
