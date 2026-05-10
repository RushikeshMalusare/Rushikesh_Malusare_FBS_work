<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="p3.TextDAO, p3.Product" %>

<%
    int id = Integer.parseInt(request.getParameter("id"));
    Product p = TextDAO.getProductById1(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
<link rel="stylesheet" href="updateproduct.css">
</head>

<body>

<div class="form-container">
    <h2>Update Product</h2>

    <form action="UpdateProduct" method="post" class="product-form">

        <input type="hidden" name="id" value="<%= p.getId() %>">

        <div class="form-group">
            <label>Product Name</label>
            <input type="text" name="name" value="<%= p.getName() %>" required>
        </div>

        <div class="form-group">
            <label>Price</label>
            <input type="text" name="price" value="<%= p.getPrice() %>" required>
        </div>

        <div class="form-group">
            <label>Image URL</label>
            <input type="text" name="image" value="<%= p.getImage() %>" required>
        </div>

        <button type="submit" class="btn">Update Product</button>

    </form>
</div>

</body>
</html>
