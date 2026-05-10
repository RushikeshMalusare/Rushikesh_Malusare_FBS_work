
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Card Payment</title>
    <link rel="stylesheet" href="card.css">
</head>
<body>

<div class="payment-container">
    <h2>Enter Card Detail</h2>
   
    <form action="PaymentCheckServlet" method="post">
		
        <label>Card Number</label>
        <input type="text" name="card_no" placeholder="1234 5678 9012 3456" required>

        <label>Card Holder Name</label>
        <input type="text" name="holderName" placeholder="John Doe" required>

        <label>Expiry(MM/YY)</label>
        <input type="text" name="expiry" placeholder="MM/YY" required>

        <label>CVV</label>
        <input type="password" name="cvv" placeholder="***" required>

        
  <input type="hidden" name="amount" value="<%= request.getParameter("amount") %>">

   
        <button type="submit">Pay Now</button>

    </form>
</div>

</body>
</html>
