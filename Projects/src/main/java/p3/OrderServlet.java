package p3;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession();

		List<Product> cart = (List<Product>) session.getAttribute("cart");

		if (cart == null || cart.isEmpty()) {
			res.sendRedirect("cart.jsp");
			return;
		}

		int total=0;
		for (Product p : cart) {
			total += p.getPrice();
		}

		session.setAttribute("orderTotal", total);

		TextDAO dao = new TextDAO();
		int orderId = dao.saveOrder(total); // save order

//    dao.saveOrderItems(orderId, cart);    // save products
//
//    session.removeAttribute("cart");      // clear cart

		res.sendRedirect("CardPayment.jsp");// Pay
	}
}