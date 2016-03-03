<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/25/16
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<%
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    String s = sdf.format(d);
    out.println(s);
    out.println("<br>");
%>
