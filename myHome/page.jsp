<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/22/16
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page</title>
</head>
<body>
<h1>This is page demo</h1>
<hr>
当前page页面对象的字符串描述: <%=page.toString()%> <br>
当前页面的hashCode: <%=page.hashCode()%><br>

<h1>下面是pageContext对象</h1>
<hr>
<%!
int i = 20;
%>
<%
//session.setAttribute("username", i);
%>
利用page指令的到的session用户名是: <%=pageContext.getSession().getAttribute("username")%><br>
<%
// pageContext.forward("register.jsp");
    pageContext.include("register.jsp");
%>
</body>
</html>
