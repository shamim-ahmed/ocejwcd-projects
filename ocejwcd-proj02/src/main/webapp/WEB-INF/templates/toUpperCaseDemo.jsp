<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>toUpperCase demo</title>
  </head>
  <body>
    <h1>toUpperCase demo</h1>
    
    <c:import var="poem" url="/static/poe.txt"/>
    
    <div>
      <m:toUpperCase var="myText" message="${poem}">
        A dream within a dream<br/>
        ${myText}
      </m:toUpperCase>
    </div>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
