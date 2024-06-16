<%-- 
    Document   : editUser
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit User</title>
    </head>
    <body>
        <p>Updating User</p>
        <form name="frmEditUser" action="UserController" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>User Id:</td>
                        <td><input type="text" name="userid" value="<c:out value="${user.userid}" />" size="25" readonly="readonly"></td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstname" value="<c:out value="${user.firstname}" />" size="40"></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastname" value="<c:out value="${user.lastname}" />"  size="40"></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="hidden" name="action" value="edit">
                        </td>
                        <td></td>
                    </tr>
                    
                    <tr>
                        <td>
                            <input type="submit" name="submit" value="Submit">
                        </td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
