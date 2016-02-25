<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/25/16
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testInclude</title>
</head>
<h1>Test Include command</h1>
<hr>
<%@ include file="date.jsp" %>
<jsp:include page="date.jsp" flush="false"/>
</body>
</html>
