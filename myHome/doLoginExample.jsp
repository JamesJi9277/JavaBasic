<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/23/16
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>doLoginExample</title>
</head>
<h1>setProperity动作元素使用方法</h1>
<jsp:useBean id="myUser" class="com.po.users" scope="page"/>
<hr>

<%--根据表单自动匹配--%>
<jsp:setProperty name="myUser" property="*"/>

<%--手动去赋值--%>
<jsp:setProperty name="myUser" property="password" value="1234"/>
<jsp:setProperty name="myUser" property="username" value="admin1" />
<%--通过URL传参数,来给属性赋值--%>
<%--http://localhost:8080/JavaWeb/doLoginExample.jsp?mypass=999999 这是当前的地址栏--%>
<jsp:setProperty name="myUser" property="password" param="mypass"/>
用户名: <%=myUser.getUsername()%> <br>
密码: <%=myUser.getPassword()%><br>
<hr>
</body>
</html>
