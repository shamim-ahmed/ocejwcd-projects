<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home page</title>
  </head>
  <body>
    <h1>This is the home page of our application</h1>
    <p><m:myTag /></p>
    <p>
      <ul>
        <m:printBody start="1" end="5">
          <li>Somewhere over the rainbow....</li>
        </m:printBody>
      </ul>
    </p>
</body>
</html>
