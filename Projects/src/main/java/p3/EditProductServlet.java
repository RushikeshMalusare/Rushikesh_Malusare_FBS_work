package p3;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/EditProduct")
public class EditProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("p",new TextDAO().getProductById(id));

        req.getRequestDispatcher("EditProduct.jsp")
           .forward(req, res);

	      //  res.sendRedirect("EditProduct.jsp");
	    }
	}

