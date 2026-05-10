<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Product Management</title>
<link rel="stylesheet" href="adminProduct.css">
</head>

<body>

    <!-- HEADER -->
    <header class="admin-header">
        <h1>Admin Product Management</h1>
    </header>

    <!-- MAIN CONTAINER -->
    <div class="admin-container">

        <div class="admin-card">
            <a href="NewProduct.jsp">
                <button class="btn">Add Product</button>
            </a>

            <a href="showProduct.jsp">
                <button class="btn update">Manage Product</button>
            </a>

            <a href="ShowProduct">
                <button class="btn move">Show Product Page</button>
            </a>

			<a href="orderShows">
                <button class="btn move">Show Order Page</button>
            </a>

            <a href="ShowUser">
                <button class="btn move">Show All Users</button>
            </a>

            <a href="Login.jsp">
                <button class="btn logout">Logout</button>
            </a>
        </div>

    </div>

</body>
</html>
