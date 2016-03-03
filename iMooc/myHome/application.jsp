<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/22/16
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>
<h1>This is application对象</h1>
<hr>
<%
  application.setAttribute("city", "北京");
  application.setAttribute("postcode", "10000");
    application.setAttribute("email", "lisi@126.com");
%>
JSP的版本号是: <%=application.getServerInfo()%> <br>
利用setAttribute得到的城市是: <br><%=application.getAttribute("city")%> <br>
application中的属性有:<br> <%
  Enumeration attributes = application.getAttributeNames();
    while(attributes.hasMoreElements()) {
        out.println(attributes.nextElement() + "&nbsp;&nbsp;");
        out.println("<br>");
    }
%>
当前页面的hashcode是: <%=page.hashCode()%><br>
</body>
</html>
