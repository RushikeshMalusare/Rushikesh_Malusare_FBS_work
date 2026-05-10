package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddProduct")
public class AdminAddProduct extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		String image = req.getParameter("image");

//		 Product p = new Product();
//	        p.setName(name);
//	        p.setPrice(price);
//	        p.setImage(image);
	        
		TextDAO dao = new TextDAO();
		dao.addProduct(name, price, image);

		res.sendRedirect("adminProduct.jsp");//UserProduct
	}
}
