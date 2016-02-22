<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/22/16
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" errorPage="exception.jsp"%>
<html>
<head>
    <title>exception</title>
</head>
<body>
<h1>测试异常的页面</h1>
<hr>
<%
Stack<Integer> stack = new Stack<Integer>();
    out.println(stack.pop());
%>
</body>
</html>
