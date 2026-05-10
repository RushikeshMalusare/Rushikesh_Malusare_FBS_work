package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class CardDatabaseConnectivity implements CardValidConnectivity, BalanceExist {
	public boolean isCardValid(String cno, String cHoldernm, String cvv, String expDate) {
		 
		java.sql.Date sqlDate=java.sql.Date.valueOf(expDate);
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/product_Management","root","7020");
			String query="select * from card where cardNo =? and name =? and cvv=? and  expDate=?  ";
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, cno);
			pstmt.setString(2, cHoldernm);
			pstmt.setString(3, cvv);
			pstmt.setDate(4, sqlDate);
			rs=pstmt.executeQuery();
			return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	@Override
	public int AvailableAmt(int cno) {
		// TODO Auto-generated method stub
		Connection conn=null;
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/product_Management","root","7020");
			String query="select balance from card where cardNo=?";
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, cno);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int avlblAmt=rs.getInt(1);
				return avlblAmt;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
//	@Override
//	public boolean isCardValid(String cno, String cHoldernm, String cvv, String expDate) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
