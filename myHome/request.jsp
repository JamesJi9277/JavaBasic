<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/21/16
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request</title>
</head>
<body>
  <h1>request内置对象</h1>
  <hr>
  <%
    request.setCharacterEncoding("utf-8");//解决中文乱码问题
  %>
  用户名: <%=request.getParameter("username")%><br>
  爱好: <%
    String[] f = request.getParameterValues("favourite");
    for(int i = 0; i < f.length; i++) {
        out.println(f[i] + "&nbsp;&nbsp;");
    }
  %>
</body>
</html>
