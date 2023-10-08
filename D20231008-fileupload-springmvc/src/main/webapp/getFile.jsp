<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/8
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>getFile</title>
</head>
<body>
<form action="fileUpload" method="post" enctype="multipart/form-data">
    <input name="file" type="file">
    <input name="text" type="text">
    <input type="submit">
</form>
</body>
</html>
