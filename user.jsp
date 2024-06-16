<%-- 
    Document   : user
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Record</title>
    </head>
    <body>
        <p><b>New Record</b></p>
        <form name="frmAddUser" action="<%=request.getContextPath()%>/UserController" method="POST">
            <table border="0">
                <tr>
                    <td>User ID: </td>
                    <td><input type="text" name="userid" value="" size="40" required></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstname" value="" size="40" required></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastname" value="" size="40" required></td>
                </tr>
                <tr>
                    <td><input type="hidden" name="action" value="insert"></td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" name="submit" value="Submit">
                        <input type="reset" name="cancel" value="Cancel">
                    </td>
                    <td></td>
                </tr>
            </table>
        </form>
    </body>
</html>
