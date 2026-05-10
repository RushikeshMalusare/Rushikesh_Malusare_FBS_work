package p3;
	import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
	import java.io.IOException;
	import java.util.List;
@WebServlet("/ShowUser")
	public class ShowUsersServlet extends HttpServlet {

	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        // 1. Get users from DB
	        List<ShowUser> users = TextDAO.getAllUsers();

	        // 2. Store in request
	        request.setAttribute("userList", users);

	        // 3. Forward to JSP
	        RequestDispatcher rd = request.getRequestDispatcher("ShowUser.jsp");
	        rd.forward(request, response);
	    }
	}


