
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, p3.Orders1" %>

<!DOCTYPE html>
<html>
<head>
<title>Admin - All Orders</title>

<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}
table {
    width: 90%;
    margin: 30px auto;
    border-collapse: collapse;
    background: white;
}
th, td {
    padding: 10px;
    border: 1px solid #ddd;
    text-align: center;
}
th {
    background: #212529;
    color: white;
}
h2 {
    text-align: center;
    margin-top: 20px;
}
</style>

</head>
<body>

<h2> All Orders</h2>

<table>
<tr>
    <th>Order ID</th>
    <th>Card No</th>
    <th>Total Price</th>
    <th>Status</th>
    <th>Date</th>
</tr>

<%

List<Orders1> list = (List<Orders1>) request.getAttribute("orderlist");
	System.out.println(list);
	
if (list != null && !list.isEmpty()) {

    for (Orders1 o : list) {
    	
    	
%>

<tr>

    <td><%= o.getId() %></td>
    <td><%= o.getCard_no()%></td>
    <td>₹<%= o.getTotal_amount() %></td>
    <td><%= o.getStatus()%></td>
    <td><%= o.getOrder_date()%></td>
</tr>
<%
    }
} else {
%>
<tr>
    <td colspan="5">No Orders Found</td>
</tr>
<% } %>

</table>

</body>
</html>