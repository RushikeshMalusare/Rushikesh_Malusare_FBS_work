package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProduct")
	public class DeleteProductServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	            throws IOException {

	  
	          int id=Integer.parseInt(req.getParameter("id"));
	            TextDAO.deleteProductById(id);
	        res.sendRedirect("showProduct.jsp");
	    }
	}


