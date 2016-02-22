<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/22/16
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    //String basePath = request.getScheme() + "://" + request.getServerName()+request.getServerPort()+path+"/";
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    String s = sdf.format(d);
    out.println(s + "&nbsp&nbsp;");
    out.println("<br>");
%>