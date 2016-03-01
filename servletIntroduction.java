手工编写第一个Servlet
  1.首先写一个类来继承HttpServlet
  2.重写doGet()或者doPost()方法，取决于用户提交请求的方式，分为get和post的两个方式来提交请求
  3.在web.xml中注册Servlet

在web.xml中修改的
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">
    <servlet>
        <servlet-name>HelloServlet</servlet-name>
        <servlet-class>servlet.helloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>HelloServlet</servlet-name>
        <url-pattern>/servlet/helloServlet</url-pattern>
    </servlet-mapping>
</web-app>


<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 3/1/16
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*, java.text.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>servletDemo</title>
  </head>
  <body>
    <h1>This is servlet demo</h1>
    <hr>
    <a href="servlet/HelloServlet">Get方式请求helloServlet</a>
    <form action="servlet/helloServlet" method="post"> 
      <input type="submit" value="用post方式请求helloServlet"/>
    </form>
  </body>
</html>
