<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Success</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .success-box {
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 8px;
        text-align: center;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }

    .success-box h2 {
        color: #28a745;
        margin-bottom: 15px;
    }

    .success-box p {
        color: #555;
        margin-bottom: 20px;
    }

    .success-box a {
        text-decoration: none;
        background-color: #007bff;
        color: #fff;
        padding: 10px 20px;
        border-radius: 5px;
        font-weight: bold;
    }

    .success-box a:hover {
        background-color: #0056b3;
    }
</style>

</head>

<body>

    <div class="success-box">
        <h2>🎉 Order Placed Successfully!</h2>
        <p>Thank you for your purchase. Your order has been confirmed.</p>
        <a href="UserProduct">Continue Shopping</a>
    </div>

</body>
</html>
