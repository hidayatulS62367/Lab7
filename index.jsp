<%-- 
    Document   : index
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.controller.UserController"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample Perform CRUD USing Java Servlet</title>
    </head>
    <body>
        <h1>Sample Perform CRUD USing Java Servlet</h1>
        <jsp:forward page="/UserController?action=listUser" />
    </body>
</html>
