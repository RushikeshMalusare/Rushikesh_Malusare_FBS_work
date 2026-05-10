
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Insufficient Balance</title>
    <link rel="stylesheet" href="Insufficient.css">
</head>
<body>

<div class="status-container error">
    <h2>❌ Payment Failed</h2>
    <p>Insufficient balance in your card.</p>

    <div class="actions">
        <a href="CardPayment.jsp" class="btn retry">Try Again</a>
        <a href="UserProduct" class="btn shop">Continue Shopping</a>
    </div>
</div>

</body>
</html>
