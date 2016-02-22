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
  SimpleDateFormat sdf = new SimpleDateFormat("MMM/dd/yyyy  HH:mm:ss");
    //这里是需要MM是大写,其余全是小写.然后如果是要24小时制的话就是HH,12小时制的话就是hh
    Date d = new Date(session.getCreationTime());
    session.setAttribute("username", "admin");
    session.setAttribute("password", "123456");
    session.setAttribute("age", "20");
    //设置当前session最大生存期限,单位秒
    session.setMaxInactiveInterval(10);
%>
Session创建的时间: <%=sdf.format(d)%> <br>
Session的ID编号: <%=session.getId()%><br>
从Session中获取用户名: <%=session.getAttribute("username")%> <br>
Session中保存的属性有: <br><%
          String[] str = session.getValueNames();
    for(int i = 0; i < str.length; i++) {
        out.println(str[i] + "&nbsp;&nbsp;");
        out.println("<br>");
    }
%>
<%

%>
</body>
</html>
