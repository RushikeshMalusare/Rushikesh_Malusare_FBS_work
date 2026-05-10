package p3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException {


        String pid = req.getParameter("productId");
        String name = req.getParameter("name");
        String pr = req.getParameter("price");

        String image = req.getParameter("image");

//        if (pid == null || pr == null) {
//            res.getWriter().println("Invalid request cartsevlet");
//            
//            System.out.println("Cart Servlet");
//            return;
//        }

        int id = Integer.parseInt(pid);
        int price = Integer.parseInt(pr);
       
        HttpSession session = req.getSession();
        List<Product> cart =(List<Product>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(new Product(id, name, price,image));
        session.setAttribute("cart", cart);

        res.sendRedirect("cart.jsp");//cart
    }
}
