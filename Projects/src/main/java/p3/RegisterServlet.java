package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

	   public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
		   	
	        // Get form data
	        String name = req.getParameter("name");
	        String email = req.getParameter("email");
	        String password = req.getParameter("password");
	        String mobile = req.getParameter("mobile");
	        

	        // Call Business Layer
	        BusinessLayer bl = new BusinessLayer();
	        boolean status = bl.registerUser(name, email, password, mobile);

	        if (status)
	        	res.sendRedirect("Login.jsp");
//	        	System.out.println("Login page");
	        	else
//	        		System.out.println("repete");
	            res.sendRedirect("Register.jsp");
	    }
	}



