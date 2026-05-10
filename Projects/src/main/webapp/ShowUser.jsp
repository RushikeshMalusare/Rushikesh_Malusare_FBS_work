
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*,p3.TextDAO, p3.ShowUser" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Users</title>
    <link rel="stylesheet" href="showUser.css">
</head>
<body>


<h2 style="text-align:center;">Registered Users</h2>

<table border="1" align="center" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>MobNo</th>
        <th>Role</th>
    </tr>

<%
    List<ShowUser> users = (List<ShowUser>) TextDAO.getAllUsers();

    if (users != null) {
        for (ShowUser u : users) {
%>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getName() %></td>
        <td><%= u.getEmail() %></td>
        <td><%= u.getPassword() %></td>
        <td><%= u.getMobNo() %></td>
       <td><%= u.getRole() %></td>
    </tr>
<%
        }
    }
%>

</table>


</body>
</html>