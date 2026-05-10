package p3;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/orderShows")
	public class OrderCheckServlet extends HttpServlet {

	    protected void doGet(HttpServletRequest req, HttpServletResponse res)
	            throws ServletException, IOException {

//	        TextDAO dao = new TextDAO();
	    	
	        List<Orders1> orders = TextDAO.getAllOrders();
	       // System.out.println(orders);
	        req.setAttribute("orderlist", orders);
	       
	        RequestDispatcher rd = req.getRequestDispatcher("orderShows.jsp");
	        rd.forward(req, res);
	    }
	}


