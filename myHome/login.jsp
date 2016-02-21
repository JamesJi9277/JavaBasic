<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/21/16
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个登录界面的例子</title>
</head>
<body>
  <h1>用户登录</h1>
  <hr>
  <form action=" doLogin.jsp" name = "loginForm" method="post">
      <table>
          <tr>
              <td>用户名: </td>
              <td><input type = "text" name = "username"/> </td>
          </tr>
          <tr>
              <td>密码: </td>
              <td><input type = "text" name = "password"/></td>
          </tr>
          <tr>
              <td colspan = "2"><input type = "submit" value = "登录"></td>
          </tr>
      </table>
  </form>
</body>
</html>
