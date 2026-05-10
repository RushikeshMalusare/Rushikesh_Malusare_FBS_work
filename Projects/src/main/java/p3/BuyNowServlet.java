package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BuyNow")
public class BuyNowServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String pidStr = req.getParameter("pid");

        if (pidStr == null) {
            res.getWriter().println("Product ID not received");
            return;
        }

        int pid = Integer.parseInt(pidStr);

        Product product = TextDAO.getProductById11(pid);

        if (product == null) {
            res.getWriter().println("Product not found in DB");
            return;
        }

        req.setAttribute("product", product);

        try {
            req.getRequestDispatcher("CardPayment.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	}


