<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>myTag demo</title>
  </head>
  <body>
    <h1>myTag demo</h1>
    
    <p>
      <m:myTag/>
    </p>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
