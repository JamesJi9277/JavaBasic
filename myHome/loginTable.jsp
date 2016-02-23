<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/23/16
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginTable</title>
</head>
<body>
<h1>登录系统</h1>
<hr>
<form name="loginForm" action="doLoginExample.jsp?mypass=999999" method="post">
    <table>
        <tr>
            <th>用户名</th>
            <th><input type="text" name="username" value=""/></th>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password" value=""/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="登录"/></td>
            <td></td>
        </tr>
    </table>
</form>
</body>
</html>
