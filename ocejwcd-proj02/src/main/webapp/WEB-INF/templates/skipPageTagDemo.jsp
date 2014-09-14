<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css"/>
    <title>Skip page demo</title>
  </head>
  <body>
    <h1>Skip page demo</h1>
    
    <p class="green-text">About to include fragment that invokes the tag</p>
    <jsp:include page="include/invokeSkipPage.jsp"/>
    <p class="green-text">Done invoking the fragment !</p>
  </body>
</html>
