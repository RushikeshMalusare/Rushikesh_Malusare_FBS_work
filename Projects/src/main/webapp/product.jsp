<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*, p3.Product"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products</title>
    <link rel="stylesheet" href="prod.css">

<body>

<h2>Available Products</h2>

<form action="AddCart" method="post">


     
    
    <div class="product-box">
        <img src="https://rukminim2.flixcart.com/image/480/640/xif0q/ball/4/u/s/420-445-premier-5-size-football-hand-stitched-for-artificial-original-imah6rv9c9bbfeb7.jpeg?q=90" alt="Product 2" width="150" height="150">
        <h3>Football</h3>
        <p>Price: 900</p>
        <input type="checkbox" name="product" value="Football-900">
    </div>
        
    
    <div class="product-box">
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNrmIQJoo2LZlx4NTXWFqmV19NLwtbd0rkTQ&s" alt="Product 3" width="150" height="150">
        <h3>Tennis Racket</h3>
        <p>Price: 2200</p>
        <input type="checkbox" name="product" value="Tennis Racket-2200">
    </div>

   
    <div class="product-box">
        <img src="https://media.istockphoto.com/id/181668903/vector/shiny-red-traditional-cricket-ball.jpg?s=612x612&w=0&k=20&c=FrODP12OH_uCIhzpa9oChPu6l--5h5BBLgnkJy9n5sg=" alt="Product 4" width="150" height="150">
        <h3>Cricket Ball</h3>
        <p>Price: 300</p>
        <input type="checkbox" name="product" value="Cricket Ball-300">
    </div>

    <br><br>
    <button type="submit">Add Selected to Cart</button>

</form>

</body>
</html>