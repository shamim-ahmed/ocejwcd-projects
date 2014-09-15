<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table border="1">
  <tr><th>Attribute name</th><th>Attribute value</th></tr>
  <c:forEach var="attrEntry" items="${requestScope}">
    <tr><td>${attrEntry.key}</td><td>${attrEntry.value}</td></tr>
  </c:forEach>
</table>