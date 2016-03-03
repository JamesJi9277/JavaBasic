<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/24/16
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.net.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<hr>

<%
    request.setCharacterEncoding("utf-8");
    String username = "";
    String password = "";
    Cookie[] cookies = request.getCookies();
    if(cookies != null && cookies.length != 0) {
        for(Cookie c : cookies) {
            if(c.getName().equals("username")) {
                username = URLDecoder.decode(c.getValue(),"utf-8");
            }
            if(c.getName().equals("password")) {
                password = URLDecoder.decode(c.getValue(), "utf-8");
            }
        }
    }
%>
<br>
<br>
<br>
用户名: <%=username%> <br>
密码:   <%=password%> <br>
</body>
</html>
