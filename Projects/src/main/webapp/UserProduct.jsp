<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, p3.Product"%>

<!DOCTYPE html>
<html>
<head>
<title>User Products</title>
<link rel="stylesheet" href="prod.css">
</head>

<body>

	<header class="header">
		<h1>Available Products</h1>

		<nav>
			<a href="UserProduct">Home</a> | <a href="cart.jsp">Cart</a> | 
				<a href="Login.jsp">Logout</a>
		</nav>


		<form action="UserProduct" method="post" class="search-form">
			<input type="text" name="search" placeholder="Search product..."
				value="<%=request.getParameter("search") != null ? request.getParameter("search") : ""%>">
			<button type="submit">Search</button>
		</form>
	</header>

	<div class="product-container">

		<%
		List<Product> list = new ArrayList<>();
		/*
		list.add(new Product(1, "Mobile", 15000, "https://m.media-amazon.com/images/I/61bK6PMOC3L._SX679_.jpg"));
		list.add(new Product(2, "Laptop", 55000, "https://m.media-amazon.com/images/I/71TPda7cwUL._SX679_.jpg"));
		list.add(new Product(3, "Headphones", 2000, "https://m.media-amazon.com/images/I/61CGHv6kmWL._SX679_.jpg"));
		list.add(new Product(5, "Cricket Bat", 2000, "https://m.media-amazon.com/images/I/317VTY6RngL.jpg"));
		*/

		List<Product> products = (List<Product>) request.getAttribute("products");
		if (products == null) {
			products = list;
		}

		String search = request.getParameter("search");
		List<Product> filteredList = new ArrayList<>();

		if (search != null && !search.trim().isEmpty()) {
			for (Product p : products) {
				if (p.getName().toLowerCase().contains(search.toLowerCase())) {
			filteredList.add(p);
				}
			}
		} else {
			filteredList = products;
		}
		%>

		<%
		if (!filteredList.isEmpty()) {
			for (Product p : filteredList) {
		%>
		
		<div class="product-box">
			<img src="<%=p.getImage()%>" width="150" alt="Product Image">
			<h3><%=p.getName()%></h3>
			<p>
				₹<%=p.getPrice()%></p>

			<form action="CartServlet" method="post">
				<input type="hidden" name="productId" value="<%=p.getId()%>">
				<input type="hidden" name="name" value="<%=p.getName()%>"> <input
					type="hidden" name="price" value="<%=p.getPrice()%>">
				<button type="submit">Add to Cart</button>
					<br><br>
			</form>


<form action="CardPayment.jsp" method="post">
    <input type="hidden" name="amount" value="<%= p.getPrice() %>">
    <button type="submit">Buy Now</button>
</form>
			

		</div>
		<%
		}
		} else {
		%>
		<p>No product found</p>
		<%
		}
		%>

	</div>

</body>
</html>
