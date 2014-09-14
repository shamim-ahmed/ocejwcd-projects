<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>Home page</title>
  </head>
  <body>
    <h1>This is the home page of our application</h1>
    <ul>
      <li><a href="dispatcher.do?tagName=myTag">myTag demo</a></li>
      <li><a href="dispatcher.do?tagName=myTag2">myTag2 demo</a></li>
      <li><a href="dispatcher.do?tagName=printBody">printBody demo</a></li>
      <li><a href="dispatcher.do?tagName=movieDetails">movieDetails demo</a></li>
      <li><a href="dispatcher.do?tagName=toUpperCase">toUpperCase demo</a></li>
    </ul>
  </body>
</html>
