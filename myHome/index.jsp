<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/18/16
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType = "text/html;charset=UTF-8" language = "java" import = "java.util.*"%>

<html>
  <head>
    <title>我的个人主页</title>
  </head>
  <body>
  <h1>这是一个九九乘法表</h1>
  <!--这是注释,源代码课件-->
  <%-- 这是JSP注释,客户端不可见--%>
  <%!String s = "开始";
    int mul(int x, int y) {
      return x * y;
    }
  %>
  <%
    //单行注释
    /**
     *
     * 多行注释
     */
    out.print("<br>");
    out.println(s);
    out.print("<br>");
    int i = 0;
    int j = 0;
    for(i = 1; i <= 9; i++) {
      for(j = 1; j <= i; j++) {
        out.print(i + " * " + j + " = " + mul(i, j) + "&nbsp; &nbsp; ");
        if(j == i) {
          out.println("<br>");
        }
      }
    }
  %>


  </body>


</html>
