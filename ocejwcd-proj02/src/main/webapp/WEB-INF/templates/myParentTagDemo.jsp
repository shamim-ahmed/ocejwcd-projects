<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>Parent-child demo</title>
  </head>
  <body>
    <h1>Parent-child demo</h1>
    
    <p>
      <m:myParentTag>
        <m:myChildTag>
          The parent said: <c:out value="${message}"/>
        </m:myChildTag>
      </m:myParentTag>
    </p>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
