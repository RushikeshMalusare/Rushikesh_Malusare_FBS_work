package p3;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserProduct")
public class UserProductServlet extends HttpServlet {

	 protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        TextDAO dao = new TextDAO();
	        List<Product> list = dao.getAllProducts();

	        // THIS LINE FIXES YOUR ERROR
	        request.setAttribute("products",list);
	       // System.out.println("Products fetched = " + list.size());
	        request.getRequestDispatcher("UserProduct.jsp")
	               .forward(request, response);
	    }
}
