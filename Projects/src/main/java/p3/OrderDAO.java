package p3;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

	public static void saveOrder(String card_no, int totalAmount, String status) throws Exception {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con
						.prepareStatement("INSERT INTO orders1(card_no, total_amount, status) VALUES (?,?,?)")) {

			ps.setString(1, card_no);
			ps.setInt(2, totalAmount);
			ps.setString(3, status);
			
			ps.executeUpdate();
		}
	}

	
}
