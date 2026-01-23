package p1;

		import java.sql.Connection;
		import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
import java.util.Scanner;

		public class Main{

			public static void main(String[] args) {
				String users;
				String pass;
				//step 1 load the driver
				try {
					Scanner sc=new Scanner(System.in);
					users=sc.nextLine();
					pass=sc.nextLine();
					Class.forName("com.mysql.cj.jdbc.Driver");
					//protocol:subprotocol:DB-specific information
					try {
						
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/travel","root","7020");
						//String query="select * from user"; 
						//String query="insert into user( username,uname)values('"+users+"','"+pass+"')";
						//stmt java sql se hai interface
						String query="insert into user(username,uname)values (?,?)";//only prepare statement
						PreparedStatement pstmt=conn.prepareStatement(query); 
						pstmt.setString(1, users);
						pstmt.setString(2,pass);//two ? hai to use to time
						int UpdateRowcount =pstmt.executeUpdate();
						conn.close();
						//ResultSet rs=stmt.executeQuery(query);//result set is cursor
						//rs.next();
						
						System.out.println(UpdateRowcount);
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
