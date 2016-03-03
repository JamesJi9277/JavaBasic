<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/24/16
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>startPage</title>
</head>
<body>
    <h1>This is Cookie page</h1>
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
    <form name="loginForm" action="doLogin.jsp" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username" value="<%=username%>"/></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password" value="<%=password%>" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="checkbox" name="isUseCookie" checked=""/>十天内记住我的登录状态</td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="登录"/><input type="reset" value="取消"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
