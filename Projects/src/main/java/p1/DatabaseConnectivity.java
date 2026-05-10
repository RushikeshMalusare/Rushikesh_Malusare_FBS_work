package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity {
		public int getPrice(String productName)	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		int total=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_Management","root","7020");
		String  query="select price from product where name=?";
//		for(int i=0;i<productName.length;i++) {
//			 pstmt=conn.prepareStatement(query);
			 pstmt.setString(1, productName);
			 rs=pstmt.executeQuery();
			 if(rs.next())
			 {
				total=total+rs.getInt(1); 
			 }
		
		return total;
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		if(pstmt!=null)
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	return 0;
}

//		@Override
//		public int getPrice(String[] productName) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

	//	@Override
//		public int getTotalAmount(String[] product) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

//	public int getPrice(String productName) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
		

