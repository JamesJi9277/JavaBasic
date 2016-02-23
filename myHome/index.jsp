<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/23/16
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.po.users"%>;
<html>
<head>
    <title>index Page</title>
</head>
<body>
<h1>使用常规方式来创建javaBean</h1>
<hr>
<%
    users user = new users();
    user.setUsername("Qi Ji");
    user.setPassword("12345");
%>
<font color="#dc143c">通过原始方式创建的Javabean的用户名是: </font><%=user.getUsername()%><br>
通过原始方式创建的Javabean的密码是: <%=user.getPassword()%><br>
<hr>
<jsp:useBean id="myUser" class="com.po.users" scope="page"/>
<%
    myUser.setUsername("Qi Ji");
    myUser.setPassword("123456");
%>
通过jsp动作指令创建的用户名是: <%=myUser.getUsername()%> <br>
通过jsp动作指令创建的密码是: <%=myUser.getPassword()%><br>
<jsp:setProperty name="" property=""/>
</body>
</html>
