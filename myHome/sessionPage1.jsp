<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/21/16
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is session page</title>
</head>
<body>
<h1>This is session page</h1>
<hr>
<%
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    //这里是需要MM是大写,其余全是小写.然后如果是要24小时制的话就是HH,12小时制的话就是hh
    Date d = new Date(session.getCreationTime());
%>
Session创建的时间: <%=sdf.format(d)%> <br>

<%

%>
</body>
</html>
