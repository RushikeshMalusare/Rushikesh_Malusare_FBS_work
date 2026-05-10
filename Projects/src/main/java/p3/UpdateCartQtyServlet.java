package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCartQty")
	public class UpdateCartQtyServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	        throws IOException {

	    int cartId = Integer.parseInt(req.getParameter("cartId"));
	    int qty = Integer.parseInt(req.getParameter("qty"));

	    TextDAO dao = new TextDAO();
	    dao.updateQuantity(cartId, qty);

	    res.sendRedirect("ViewCart");
	}
	}


