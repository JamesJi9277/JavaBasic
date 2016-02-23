<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/23/16
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType = "text/html;charset=UTF-8" language = "java" import = "java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>

<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
<h1>这是一个九九乘法表</h1>
<hr>
<%
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
    String s1 = sdf.format(new Date());
%>
<%
    SimpleDateFormat sdf1 = new SimpleDateFormat();
    String s2 = sdf1.format(new Date());
%>
现在是:<%=s2%>
<br>
今天是: <%=s1%>
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
<br>
你好, <%= s%><br>
x * y = <%=mul(10, 10)%> <br>
aaa


</body>
<body>
<h1>out内置对象</h1>
<%
    out.clear();
    out.println("<h2>静夜思</h2>");
    out.println("床前明月光<br>");
    out.println("一起地上霜<br>");
    out.println("举头望明月<br>");
    out.println("低头思故乡<br>");
%>
缓冲区大小: <%=out.getBufferSize() %>byte<br>
缓冲区剩余大小: <%=out.getRemaining()%>byte<br>
是否自动清空缓冲区: <%=out.isAutoFlush()%><br>


</body>


</html>