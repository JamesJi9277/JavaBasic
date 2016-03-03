<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/24/16
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    //首先判断用户是否选择了记住登录状态
    String[] isUseCookie = request.getParameterValues("isUseCookie");
    if(isUseCookie != null && isUseCookie.length != 0) {
        //需要保存cookie
        //把用户名和密码保存在cookie对象里面
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Cookie usernameCookie = new Cookie("username", username);
        Cookie passwordCookie = new Cookie("password", password);
        //设置最大生存期限
        usernameCookie.setMaxAge(864000);
        passwordCookie.setMaxAge(864000);

        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);
    }
    else {
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0)
        {
            for(Cookie c:cookies)
            {
                if(c.getName().equals("username")||c.getName().equals("password"))
                {
                    c.setMaxAge(0); //设置Cookie失效
                    response.addCookie(c); //重新保存。
                }
            }
        }
    }
%>
<a href="users.jsp" targe="_blank">查看用户信息</a>
</body>
</html>
