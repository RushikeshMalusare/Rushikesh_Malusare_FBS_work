
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, p3.Product"%>

<%
String removeId = request.getParameter("removeId");

List<Product> cart = (List<Product>) session.getAttribute("cart");

if (removeId != null && cart != null) {
	int rid = Integer.parseInt(removeId);
	cart.removeIf(p -> p.getId() == rid);
	session.setAttribute("cart", cart);
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Cart</title>
<link rel="stylesheet" href="cart.css">
</head>
<body>

	<header class="header">
		<h3>My Shopping Cart</h3>
	</header>

	<div class="cart-container">

		<table class="cart-table">
			<tr>
				<th>ID</th>
				<th>Product</th>
				<th>Price</th>
				<th>Action</th>
			</tr>

			<%
			int total = 0;

			if (cart != null && !cart.isEmpty()) {
				for (Product p : cart) {
					total += p.getPrice();
					
				
			%>
			<tr>
				<td><%=p.getId()%></td>
				<td><%=p.getName()%></td>
				<td class="price">₹<%=p.getPrice()%></td>
				<td><a href="cart.jsp?removeId=<%=p.getId()%>"
					class="remove-btn">❌ Remove</a></td>
			</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td colspan="4" class="empty">Cart is empty</td>
			</tr>
			<%
			}
			%>

			<tr class="total-row">
				<td colspan="3"><b>Total</b></td>
				<td><b>₹<%=total%></b></td>

			</tr>
		</table>

		<a href="UserProduct">⬅ Continue Shopping</a>

	

<form action="CardPayment.jsp" method="post">
    <input type="hidden" name="amount" value="<%= total %>">
    <button type="submit">Pay Now</button>
</form>


	</div>
</body>
</html>
