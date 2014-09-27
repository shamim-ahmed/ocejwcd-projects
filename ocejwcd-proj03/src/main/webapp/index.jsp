<%@page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Home Page</title>
    <meta charset="UTF-8"/>
  </head>
  <body>
    <h1>Home Page</h1>

    <p>
      <ul>
        <li><a href="${pageContext.servletContext.contextPath}/xml-weather-data">Weather forecast in XML</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/json-weather-data">Weather forecast in JSON</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/text-weather-data">Weather forecast in plain text</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/late-forecast">Weather forecast timeout</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/list-init-param">List init params</a></li>
      </ul>
    </p>
</body>
</html>
