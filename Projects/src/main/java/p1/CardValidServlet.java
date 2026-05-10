package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Valid")
public class CardValidServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String cno=req.getParameter("cno");
		String cHoldernm=req.getParameter("choldernm");
		String cvv=req.getParameter("cvv");
		String expDate=req.getParameter("expdate");
		
		HttpSession session=req.getSession();
		int puramt=(int) session.getAttribute("totalAmt");
		Verify verify=new Verify();
		PrintWriter out=res.getWriter();
		if(verify.verifyDetail(cno,cHoldernm,cvv,expDate)) {
			RequestDispatcher request=req.getRequestDispatcher("balance");//checkAmt
			request.forward(req,res);
			
		}
		else {
			res.sendRedirect("product.html");
		}
	}
}
