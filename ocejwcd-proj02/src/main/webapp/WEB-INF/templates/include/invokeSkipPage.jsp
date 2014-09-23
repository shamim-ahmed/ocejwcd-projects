<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://www.example.com/mytags"%>

<p class="blue-text">About to invoke &lt;skipPageTag/&gt;</p>
<m:skipPageTag/>
<p class="blue-text">Returned after invoking &lt;skipPageTag/&gt;</p>
