<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>

    <!-- External CSS -->
    <link rel="stylesheet" href="addproduct.css">
</head>

<body>

<div class="form-container">
    <h2>Add New Product</h2>

    <form action="AddProduct" method="post">

        <input type="text" name="name" placeholder="Product Name" required>

        <input type="number" name="price" placeholder="Price" required>

        <input type="text" name="image" placeholder="Image URL" required>
        
		
        <button type="submit" class="btn">Add Product</button>
	</form>
    
</div>

</body>
</html>
    