<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>myTag2 demo</title>
  </head>
  <body>
    <h1>myTag2 demo</h1>
    
    <p>
      <m:mytag2>
        The message is: ${message}
      </m:mytag2>
    </p>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
