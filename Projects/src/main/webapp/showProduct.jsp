<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*, p3.TextDAO, p3.Product" %>

<%
    TextDAO dao = new TextDAO();
    List<Product> list = dao.getAllProducts();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Products</title>
<link rel="stylesheet" href="showProducts.css">
</head>

<body>

<div class="container">
    <h2>Manage Products</h2>

    <table class="product-table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price (₹)</th>
                <th>Image</th>
                <th>Action</th>
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
                
                <td class="action-btns">
                    <a href="Update.jsp?id=<%= p.getId() %>" class="btn update-btn">
                        Update
                    </a>

                    <a href="DeleteProduct?id=<%= p.getId() %>"
                       class="btn delete-btn"
                       onclick="return confirm('Are you sure you want to delete this product?')">
                        Delete
                    </a>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="5" class="no-data">No products found</td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
