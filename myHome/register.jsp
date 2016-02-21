<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/21/16
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
  <h1>用户注册</h1>
  <hr>
  <form name = "regFrom" action = "request.jsp" method = "post">
      <table>
          <tr>
              <td>用户名: </td>
              <td><input type = "text" name = "username"/></td>
          </tr>
          <tr>
              <td>爱好: </td>
              <td>
                  <input type = "checkbox" name = "favourite" value = "read">"读书"
                  <input type = "checkbox" name = "favourite" value = "music">"音乐"
                  <input type = "checkbox" name = "favourite" value = "movie">"电影"
                  <input type = "checkbox" name = "favourite" value = "internet">"上网"
              </td>
          </tr>
          <tr>
              <td colspan="2"><input type = "submit" value = "提交"/></td>
          </tr>
      </table>
  </form>
</body>
</html>
