<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/24/16
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<hr>
<%
    String username = "";
    String password = "";
    Cookie[] cookies = request.getCookies();
    if(cookies != null && cookies.length != 0) {
        for(int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().equals("username")) {
                username = cookies[i].getValue();
            }
            if(cookies[i].getName().equals("password")) {
                password = cookies[i].getValue();
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
