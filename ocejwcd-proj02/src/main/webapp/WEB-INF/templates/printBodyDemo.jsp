<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>printBody demo</title>
  </head>
  <body>
    <h1>printBody demo</h1>
    
    <ul>
      <m:printBody start="1" end="5">
        <li>Somewhere over the rainbow...</li>
      </m:printBody>
    </ul>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
