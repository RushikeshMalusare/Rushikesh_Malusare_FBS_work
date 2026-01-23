package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mainApp {

	public static void main(String[] args) {
		
		//step 1 load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//protocol:subprotocol:DB-specific information
			try {
				
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","7020");
				String query="select * from user";  
				//stmt java sql se hai interface
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(query);//result set is cursor
				rs.next();
				
				System.out.println(rs.getString(2));
				conn.close();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
