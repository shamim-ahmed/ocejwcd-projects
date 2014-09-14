<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8"/>
    <title>movieDetails demo</title>
  </head>
  <body>
    <h1>movieDetails demo</h1>
    
    <table border="1">
      <tr><th>Title</th><th>Genre</th></tr>
      <m:movieDetails var="movie" movies="${requestScope.movies}">
        <tr><td>${movie.title}</td><td>${movie.genre}</td></tr>
      </m:movieDetails>
    </table>
    
    <%@include file="common/footer.jspf"%>
  </body>
</html>
