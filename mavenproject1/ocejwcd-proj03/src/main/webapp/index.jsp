<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Home page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Home page</h1>
    
    <p><a href="includeTrial.jsp">include trial</a></p>
    <p><a href="forwardTrial.jsp">forward trial</a></p>
    <p><a href="${pageContext.request.contextPath}/delegate.do">Dispatch by URL</a></p>
    <p><a href="${pageContext.request.contextPath}/delegate.do?useName=true">Dispatch by name</a></p>
  </body>
</html>