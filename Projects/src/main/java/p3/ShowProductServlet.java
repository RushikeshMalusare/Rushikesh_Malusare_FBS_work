package p3;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShowProduct")
	public class ShowProductServlet extends HttpServlet {

	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        TextDAO dao = new TextDAO();
	        List<Product> list = dao.getAllProducts(); // DB data

	        req.setAttribute("products", list);
	        req.getRequestDispatcher("adminShowProduct.jsp").forward(req, resp);
	    }
	}


