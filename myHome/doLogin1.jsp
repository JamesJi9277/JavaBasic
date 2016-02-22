<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/22/16
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username ="";
    String password = "";
    request.setCharacterEncoding("utf-8");
    username = request.getParameter("username");
    password = request.getParameter("password");
    if(username.equals("admin") && password.equals("admin")) {
        session.setAttribute("loginUser", username);
        request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
    }
    else {
        response.sendRedirect("loginFailure.jsp");
    }
%>
