<%--
  Created by IntelliJ IDEA.
  User: jiqi
  Date: 2/21/16
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request</title>
</head>
<body>
  <h1>request内置对象</h1>
  <hr>
  <%
      request.setCharacterEncoding("utf-8");//解决中文乱码问题
      request.setAttribute("password", "123456");
  %>
  用户名: <%=request.getParameter("username")%><br>
  爱好: <%
    if(request.getParameterValues("favourite")!= null) {
        String[] f = request.getParameterValues("favourite");
        for (int i = 0; i < f.length; i++) {
            out.println(f[i] + "&nbsp;&nbsp;");
        }
    }
  %><br>
   密码: <%=request.getAttribute("password")%> <br>
   请求体的MIME类型: <%=request.getContentType()%>; <br>
   协议类型以及版本号: <%=request.getProtocol()%> <br>
   服务器主机名: <%=request.getServerName()%>  <br>
   服务器端口号: <%=request.getServerPort()%> <br>
   字符编码模式: <%=request.getCharacterEncoding()%> <br>
   请求体的长度: <%=request.getContentLength()%> <br>
   客户端的IP地址: <%=request.getRemoteAddr()%> <br>
   <%=response.getCharacterEncoding()%> <br>
</body>
</html>
