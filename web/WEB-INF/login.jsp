<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

        <h1>Hello ${firstname}</h1>
        <div>
            <form action="Login" method="post">
                <table>
                <tr>
                    <td>
                        <label>Username:</label>
                    </td>
                    <td>
                        <input type="text" name="myusername" value="${username}">
                    </td>
                </tr>
                <td>
                    <label>Password:</label>
                </td>
                <td>
                    <input type="password" name="mypassword" value="${password}">
                </td>
                </table>
                <input type="submit" value="Sign In">
            </form>
        </div>
        ${errorMessage}
        ${logout1}
  
<c:import url="/includes/header.html" />
