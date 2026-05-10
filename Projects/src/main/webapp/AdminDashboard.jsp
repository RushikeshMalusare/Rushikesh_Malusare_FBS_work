<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,p3.AllUser,p3.AllOrder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<h2>Registered Users</h2>

<table border="1">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Role</th>
</tr>

<%
List<AllUser> users = (List<AllUser>) request.getAttribute("users");
for(AllUser u : users) {
%>
<tr>
    <td><%=u.getName()%></td>
    <td><%=u.getEmail()%></td>
    <td><%=u.getMobile()%></td>
    <td><%=u.getRole()%></td>
</tr>
<% } %>
</table>

<hr>

<h2>Orders</h2>

<table border="1">
<tr>
    <th>User</th>
    <th>Product</th>
    <th>Price</th>
    <th>Status</th>
</tr>

<%
List<AllOrder> orders = (List<AllOrder>) request.getAttribute("orders");
for(AllOrder o : orders) {
%>
<tr>
    <td><%=o.getUname()%></td>
    <td><%=o.getPname()%></td>
    <td><%=o.getPrice()%></td>
    <td><%=o.getPayStatus()%></td>
</tr>
<% } %>
</table>

</body>
</html>