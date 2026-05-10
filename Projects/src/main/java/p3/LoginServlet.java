package p3;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse res)
	        throws IOException {

	    String username = req.getParameter("nm");
	    String password = req.getParameter("pass");

	    HttpSession session = req.getSession();

	    
	    if ("Admin".equals(username) && "admin123".equals(password)) {
	       // session.setAttribute("role", "admin");
	        res.sendRedirect("adminProduct.jsp");
	        
	    }
	    else {
	    	res.sendRedirect("UserProduct");
		       
	    }
	}
}
