package p3;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PaymentCheckServlet")
public class PaymentCheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String  cardNo= req.getParameter("card_no");
        
        //String cardNo = last4.substring(last4.length() - 4);
        
        String cvv = req.getParameter("cvv");

        String totalStr = req.getParameter("amount");
        //int amount = Integer.parseInt(amountStr);

        
//        String totalStr = req.getParameter("total");   // cart checkout
//        String priceStr = req.getParameter("price");   // buy now

       

        

//		System.out.println("Card No = " + cardNo);
//		System.out.println("CVV = " + cvvStr);
//		System.out.println("Total = " + totalStr);
		if (cardNo == null || cvv == null  ||totalStr == null) { // totalStr == null) 
			res.getWriter().println("Invalid Request");
			return;
		}

		int total=0;
		try {
			total = Integer.parseInt(totalStr);
		} catch (NumberFormatException e) {
//			res.getWriter().println("Invalid Total Amount");
//			return;
		}
		

		int balance;
		try {
			balance = TextDAO.getBalance(cardNo, cvv);
		} catch (Exception e) {
			e.printStackTrace();
			res.getWriter().println("Database Error");
			return;
		}
		if (balance >= total ) {
			int newBalance = balance - total;

			try {
				TextDAO.updateBalance(cardNo, newBalance);
				OrderDAO.saveOrder(cardNo, total, "SUCCESS");
			} catch (Exception e) {
				e.printStackTrace();
				//res.getWriter().println("Payment Failed");
				return;
			}
			HttpSession session = req.getSession();
			session.removeAttribute("cart");

			res.sendRedirect("sucess.jsp");
			
			
		}
		
			
		//fail	
		 if(balance < total )  {
			try {
				OrderDAO.saveOrder(cardNo, total, "Failed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//res.getWriter().println("Payment Failed");
				return;
			}
			res.sendRedirect("InsufficientBal.jsp");
			
			
		} 
	
	
	}
}

        
        
        
        
        
//        if (cardNo == null || cvv == null || cardNo.isEmpty() || cvv.isEmpty()) {
//            res.getWriter().println("Invalid Card Details");
//            return;
//        }
//
//     
//        String cardNoEnd = cardNo.substring(cardNo.length() - 4);
//
//        int amount=0;
////        String paymentType = "";
//
//       
//        if (totalStr != null && !totalStr.isEmpty()) {
//            try {
//                amount = Integer.parseInt(totalStr);
////                paymentType = "CART";
//            } catch (NumberFormatException e) {
////                res.getWriter().println("Invalid cart total");
////                return;
//            }
//        }
//
//        else if (priceStr != null && !priceStr.isEmpty()) {
//            try {
//                amount = Integer.parseInt(priceStr);
////                paymentType = "BUY_NOW";
//            } catch (NumberFormatException e) {
//                res.getWriter().println("Invalid product price");
//                return;
//            }
//        }
//
//      
//        else {
//            res.getWriter().println("Invalid payment request");
//            return;
//        }
//
//       
//        int balance;
//        try {
//            balance = TextDAO.getBalance(cardNo, cvv);
//        } catch (Exception e) {
//            e.printStackTrace();
//            res.getWriter().println("Database Error");
//            return;
//        }
//
//        if (balance >= amount) {
//            try {
//                TextDAO.updateBalance(cardNo, balance - amount);
//                OrderDAO.saveOrder(cardNoEnd, amount, "SUCCESS");
//
//                HttpSession session = req.getSession();
//
//                
////                if ("CART".equals(paymentType)) {
////                    session.removeAttribute("cart");
////                }
//
//                res.sendRedirect("sucess.jsp");
//            } catch (Exception e) {
//                e.printStackTrace();
//                res.getWriter().println("Payment Failed");
//            }
//        }
//
//        
//        else {
//            try {
//                OrderDAO.saveOrder(cardNoEnd, amount, "FAILED");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            res.sendRedirect("InsufficientBal.jsp");
//        }
//    }
//}
//

