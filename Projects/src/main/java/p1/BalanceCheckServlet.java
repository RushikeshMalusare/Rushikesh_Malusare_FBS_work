package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Credit")
public class BalanceCheckServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
	HttpSession session=req.getSession();
	int cno=Integer.parseInt(req.getParameter("cno"));
	String cHoldernm=req.getParameter("choldernm");
	int cvv=Integer.parseInt(req.getParameter("cvv"));
	LocalDate expDate=LocalDate.parse(req.getParameter("expdate"));
	int purAmt=(int) session.getAttribute("totalAmt");
	BalanceCheck balcheck=new BalanceCheck();
	
	PrintWriter out=res.getWriter();
	if(balcheck.checkBalance(cno,purAmt)) {
		out.println("Sufficient Balance");
	}
	else {
		out.println("Insufficint Balance");
	}
}
}
