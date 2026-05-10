<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*,p3.OrderDAO, p3.TextDAO, p3.Product" %>

<%
    TextDAO dao = new TextDAO();
    List<Product> list = dao.getAllProducts();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Products</title>
<link rel="stylesheet" href="adminShowProducts.css">
</head>

<body>


<div class="container">
    <h2>Available Products</h2>

    <table class="product-table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Product Name</th>
                <th>Price (₹)</th>
                <th>Image</th>
            </tr>
        </thead>

        <tbody>
        <%
            if (list != null && !list.isEmpty()) {
                for (Product p : list) {
        %>
            <tr>
                <td><%= p.getId() %></td>
                <td><%= p.getName() %></td>
                <td><%= p.getPrice() %></td>
                <td>
                    <img src="<%= p.getImage() %>" class="product-img">
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="4" class="no-data">No products found</td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
