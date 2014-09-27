<%@page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Multi-module webapp demo</title>
    <meta charset="UTF-8"/>
  </head>
  <body>
    <h1>Multi-module webapp demo</h1>
    
    <p>
    <ul>
      <li><a href="${pageContext.servletContext.contextPath}/hello-world">hello world demo</a></li>
      <li><a href="${pageContext.servletContext.contextPath}/display-image">display image demo</a></li>
      <li><a href="${pageContext.servletContext.contextPath}/weather-forecast">weather forecast demo</a></li>
      <li><a href="${pageContext.servletContext.contextPath}/exotic.do">Exotic servlet demo</a></li>
    </ul>
    </p>
  </body>
</html>
