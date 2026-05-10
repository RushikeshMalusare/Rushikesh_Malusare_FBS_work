package p3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TextDAO {

	public boolean checkUser1(String user, String pass) {

		boolean status = false;

		try {
			Connection conn = DBConnection.getConnection();

			if (conn == null) {
				System.out.println("DB Connection Failed");
				return false;
			}
			// System.out.println("DB Connection sucessfull");

			String sql = "SELECT * FROM users WHERE name=? AND password=? ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, user);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				status = true;
			}

			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("43");
		return status;
	}
	// register

	public boolean saveUser(String name, String email, String password, String mobile) {
		boolean status = false;

		try {
			Connection conn = DBConnection.getConnection();

			String sql = "INSERT INTO users(name,email,password,mobile) VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, mobile);
//			pstmt.setString(5, role);

			status = pstmt.executeUpdate() > 0;

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	// Admin add product
	public void BuyProduct(int userId, int productId) {
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO cart(user_id, product_id) VALUES (?, ?)");

			ps.setInt(1, userId);
			ps.setInt(2, productId);

			ps.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addProduct(String name, int price, String image) {

	    try {
	        Connection con = DBConnection.getConnection();
	        String sql = "INSERT INTO products(name, price, image) VALUES (?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        
	        //System.out.println(sql);
	        ps.setString(1, name);
	        ps.setInt(2, price);
	        ps.setString(3, image);

	        ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

//	public boolean addProduct(String name, int price, String image) {
//		boolean status = false;
//		try (Connection conn = DBConnection.getConnection();
//				PreparedStatement ps = conn.prepareStatement("INSERT INTO products(name,price,image) VALUES(?,?,?)")) {
//
//			ps.setString(1, name);
//			ps.setInt(2, price);
//			ps.setString(3, image);
//
//			status = ps.executeUpdate() > 0;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}

	// get product from db to userproduct page
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();
			String sql = "SELECT * FROM products";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				p.setImage(rs.getString("image"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean updateProduct(int id, String name, int price, String image) {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("UPDATE products SET name=?,price=?,image=? WHERE id=?")) {

			ps.setString(1, name);
			ps.setInt(2, price);
			ps.setString(3, image);
			ps.setInt(4, id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static Product getProductById1(int id) {

		Product p = null;

		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM products WHERE id=?");
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				p = new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"), rs.getString("image"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public boolean getProductById(int id) {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("DELETE FROM products WHERE id=?")) {

			ps.setInt(1, id);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// TODO Auto-generated method stub
	public static void deleteProductById(int id) {
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement("DELETE FROM products WHERE id=?")) {

			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static List<ShowUser> getAllUsers() {
		List<ShowUser> list = new ArrayList<>();

		String sql = "SELECT id, name, email, password, mobile, role FROM users";

		Connection con = DBConnection.getConnection();
//	    System.out.println("205");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
//	       System.out.println("209");
			while (rs.next()) {
				ShowUser u = new ShowUser(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getString("password"), rs.getLong("mobile"), rs.getString("role"));
				list.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
//	       System.out.println("224");
		}

		return list;
	}

	public static List<Product> getProducts() {
		List<Product> list = new ArrayList<>();

		try {
			Connection con = DBConnection.getConnection();
			String sql = "SELECT *FROM products";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product p = new Product(rs.getInt("id"), rs.getString("name"), rs.getInt("price"),
						rs.getString("image"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static int getBalance(String cardNo, String cvvStr) throws Exception {
	    int balance = -1;

	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(
	             "SELECT balance FROM card WHERE card_no=? AND cvv=?")) {

	        ps.setString(1, cardNo);
	        ps.setString(2, cvvStr);

	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            balance = rs.getInt("balance");
	        }
	    }
	    return balance;
	}

	
	 public static Product getProductById11(int id) {

	        Product product = null;

	        try {
	            Connection con = DBConnection.getConnection();

	            String sql = "SELECT * FROM products WHERE id=?";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setInt(1, id);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                product = new Product();
	                product.setId(rs.getInt("id"));
	                product.setName(rs.getString("name"));
	                product.setPrice(rs.getInt("price"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return product;
	    }
	
	

//	public void saveOrder(String cardNo, int totalAmount, String status) throws Exception {
//        Connection con = DBConnection.getConnection();
//        PreparedStatement ps = con.prepareStatement(
//            "INSERT INTO orders1(card_no, total_amount, status) VALUES (?,?,?)"
//        );
//        ps.setString(1, cardNo);
//        ps.setInt(2, totalAmount);
//        ps.setString(3, status);
//        ps.executeUpdate();
//    }

	
	// update balance

//	public static boolean saveOrder(Order order) {
//
//		boolean isSaved = false;
//
//		try {
//			Connection con = DBConnection.getConnection();
//
//			String sql = "INSERT INTO orders(user_id, product_id, amount, status) " + "VALUES (?, ?, ?, ?)";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			ps.setInt(1, order.getUserId());
//			ps.setInt(2, order.getProductId());
//			ps.setInt(3, order.getAmount());
//			ps.setString(4, order.getStatus());
//
//			int rows = ps.executeUpdate();
//
//			if (rows > 0) {
//				isSaved = true;
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return isSaved;
//
//	}

//	public static void saveOrderItem(int orderId, Cart c) {
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement(
//					"INSERT INTO order_items(order_id, product_id, quantity, price) VALUES (?,?,?,?)");
//			ps.setInt(1, orderId);
//			ps.setInt(2, c.getProductId());
//			ps.setInt(3, c.getQuantity());
//			ps.setInt(4, c.getPrice());
//			ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	// get card balance
	public static int getCardBalance(String cardNo, String cvv) {
		int bal = 0;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select balance from card where card_no=? and cvv=?");
			ps.setString(1, cardNo);
			ps.setString(2, cvv);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				bal = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bal;
	}

	public static void updateBalance(String cardNo, int newBalance) throws Exception {
	    try (Connection con = DBConnection.getConnection();
	         PreparedStatement ps = con.prepareStatement(
	             "UPDATE card SET balance=? WHERE card_no=?")) {

	        ps.setInt(1, newBalance);
	        ps.setString(2, cardNo);
	        ps.executeUpdate();
	    }
	
	}

//	public static void saveOrder(int userId, int productId, int price, int qty) {
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement(
//					"insert into orders(user_id, product_id, amount, quantity, status) values(?,?,?,?,?)");
//
//			ps.setInt(1, userId);
//			ps.setInt(2, productId);
//			ps.setInt(3, price * qty);
//			ps.setInt(4, qty);
//			ps.setString(5, "SUCCESS");
//
//			ps.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void updateQuantity(int cartId, int qty) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBConnection.getConnection();

			String sql = "UPDATE cart SET quantity=?, total=price*? WHERE cart_id=?";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, qty);
			ps.setInt(2, qty);
			ps.setInt(3, cartId);

			ps.executeUpdate();

			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
//	
//	public static void saveOrder1(String cardNo, int totalAmount, String status) throws Exception {
//		try (Connection con = DBConnection.getConnection();
//				PreparedStatement ps = con
//						.prepareStatement("INSERT INTO orders1(card_no, total_amount, status) VALUES (?,?,?)")) {
//
//			ps.setString(1, cardNo);
//			ps.setInt(2, totalAmount);
//			ps.setString(3, status);
//			
//			ps.executeUpdate();
//		}
//	}
	public void saveOrder(List<Product> cart, int grandTotal) {
		// TODO Auto-generated method stub
//
	}

	public int saveOrder(int total) {

		int orderId = 0;

		try {
			Connection con = DBConnection.getConnection();
			String sql = "INSERT INTO orders(total_amount) VALUES (?)";
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			ps.setInt(1, total);
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				orderId = rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderId;
	}

//	public void saveOrderItems(int orderId, List<Product> cart) {
//
//		try {
//			Connection con = DBConnection.getConnection();
//			String sql = "INSERT INTO order_items " + "(order_id, product_id, product_name, price) "
//					+ "VALUES (?, ?, ?, ?)";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//
//			for (Product p : cart) {
//				ps.setInt(1, orderId);
//				ps.setInt(2, p.getId());
//				ps.setString(3, p.getName());
//				ps.setInt(4, p.getPrice());
//				ps.executeUpdate();
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
	public static int getUserBalance(int userId) {

	    int bal = 0;
	    try {
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps =
	            con.prepareStatement("SELECT balance FROM user_wallet WHERE user_id=?");

	        ps.setInt(1, userId);
	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            bal = rs.getInt("balance");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return bal;
	}

	public void updateBalance(int userId, int newBalance) {

	    try {
	        Connection con = DBConnection.getConnection();
	        PreparedStatement ps =
	            con.prepareStatement("UPDATE card SET balance=? WHERE card_no=?");

	        ps.setInt(1, newBalance);
	        ps.setInt(2, userId);
	        ps.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static List<Orders1> getAllOrders() {
		List<Orders1> list = new ArrayList<>();
	
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM orders1 ";
              PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orders1 ord = new Orders1();
                ord.setId(rs.getInt("id"));
                ord.setCard_no(rs.getString("card_no"));
                ord.setTotal_amount(rs.getInt("total_amount"));
                ord.setStatus(rs.getString("status"));
                ord.setOrder_date(rs.getTimestamp("order_date"));

                list.add(ord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      
        
        //System.out.println("List Size"+ list.size());
        return list;
	}



	public int getPriceById(int productId) {
		
		 int price = 0;

	        String sql = "SELECT price FROM products WHERE id = ?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {

	            ps.setInt(1, productId);

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                price = rs.getInt("price");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return price;
	    }
	}

//	public int getProductByIdproduct(int productId) {
//		int price = 0;
//
//        try {
//            Connection con = DBConnection.getConnection();
//            String sql = "SELECT price FROM products WHERE id = ?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, productId);
//
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                price = rs.getInt("price");
//            }
//
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return price;
//    
	

	


//	public static void updateProduct(int id, String name, int price) {
//		// TODO Auto-generated method stub
//		
//	}

//	public boolean saveCardDetails(String name, String card, String expiry, String cvv, int amount) {
//
//		boolean status = false;
//
//		try (Connection conn = DBConnection.getConnection();
//				PreparedStatement ps = conn.prepareStatement(
//						"INSERT INTO card(user_name,card_number,expiry,cvv,amount,payment_status) VALUES(?,?,?,?,?,?)")) {
//
//			ps.setString(1, name);
//			ps.setString(2, card);
//			ps.setString(3, expiry);
//			ps.setString(4, cvv);
//			ps.setInt(5, amount);
//			ps.setString(6, "SUCCESS");
//
//			status = ps.executeUpdate() > 0;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return status;
//	}
//
//	public boolean deleteByName(String name) {
//
//		boolean status = false;
//
//		try {
//			Connection con = DBConnection.getConnection();
//
//			String sql = "DELETE FROM products WHERE name=?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, name);
//
//			status = ps.executeUpdate() > 0;
//
//			ps.close();
//			con.close();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return status;
//	}
//
//	public void addToCart(Integer userId, int productid) {
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("INSERT INTO cart(user_id, product_id) VALUES(?,?)");
//			ps.setInt(1, userId);
//			ps.setInt(2, productid);
//			ps.executeUpdate();
//
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public String checkUser(String user, String pass) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void addToCart(int userId, int productId) {
//
//		try {
//			Connection con = DBConnection.getConnection();
//
//			// Check product already in cart
//			String checkSql = "SELECT quantity FROM cart WHERE user_id=? AND product_id=?";
//			PreparedStatement ps1 = con.prepareStatement(checkSql);
//			ps1.setInt(1, userId);
//			ps1.setInt(2, productId);
//			ResultSet rs = ps1.executeQuery();
//
//			if (rs.next()) {
//				// Update quantity
//				String updateSql = "UPDATE cart SET quantity = quantity + 1 WHERE user_id=? AND product_id=?";
//				PreparedStatement ps2 = con.prepareStatement(updateSql);
//				ps2.setInt(1, userId);
//				ps2.setInt(2, productId);
//				ps2.executeUpdate();
//			} else {
//				// Insert new product
//				String insertSql = "INSERT INTO cart(user_id, product_id, quantity) VALUES(?,?,1)";
//				PreparedStatement ps3 = con.prepareStatement(insertSql);
//				ps3.setInt(1, userId);
//				ps3.setInt(2, productId);
//				ps3.executeUpdate();
//			}
//
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	// Get cart items
//	public List<CartItem> getCartItems(int userId) {
//
//		List<CartItem> list = new ArrayList<>();
//
//		try {
//			Connection con = DBConnection.getConnection();
//
//			String sql = """
//					SELECT p.id, p.name, p.price, c.quantity
//					FROM cart c
//					JOIN products p ON c.product_id = p.id
//					WHERE c.user_id = ?
//					""";
//
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, userId);
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				CartItem item = new CartItem();
//				item.setProductId(rs.getInt("id"));
//				item.setName(rs.getString("name"));
//				item.setPrice(rs.getInt("price"));
//				item.setQuantity(rs.getInt("quantity"));
//
//				list.add(item);
//			}
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list;
//	}
//
//	// Remove product
//	public void removeItem(int userId, int productId) {
//
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("DELETE FROM cart WHERE user_id=? AND product_id=?");
//			ps.setInt(1, userId);
//			ps.setInt(2, productId);
//			ps.executeUpdate();
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	
//	
//
//		
//	
//	}

// public String checkUser(String username, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String checkUser(String user, String pass) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//AdminDashboard

//	public List<AllUser> getAllUsers() {
//		List<AllUser> list = new ArrayList<>();
//
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				AllUser u = new AllUser();
//				u.setId(rs.getInt("id"));
//				u.setName(rs.getString("name"));
//				u.setEmail(rs.getString("email"));
//				u.setMobile(rs.getString("mobile"));
//				u.setRole(rs.getString("role"));
//				list.add(u);
//			}
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public List<AllOrder> getAllOrders() {
//		List<AllOrder> list = new ArrayList<>();
//
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("SELECT * FROM orders");
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				AllOrder o = new AllOrder();
//				o.setUname(rs.getString("username"));
//				o.setPname(rs.getString("product_name"));
//				o.setPrice(rs.getInt("price"));
//				o.setPayStatus(rs.getString("payment_status"));
//				list.add(o);
//			}
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

//	Add Card

//	public void addToCart(int userId, int productId) {
//		try {
//			Connection conn = DBConnection.getConnection();
//
//			String sql ="INSERT INTO cart(user_id, product_id) VALUES(?,?)";
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, userId);
//			ps.setInt(2, productId);
//
//			ps.executeUpdate();
//			conn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	

//	addTo card

//	public void addToCart(int userId, String[] productId) {
//
//	    try {
//	        Connection con = DBConnection.getConnection();
//
//	        String sql = "INSERT INTO cart(user_id, product_id, quantity) VALUES(?,?,1)";
//	        PreparedStatement ps = con.prepareStatement(sql);
//
//	        ps.setInt(1, userId);
//	        ps.setInt(2, productId);
//
//	        ps.executeUpdate();
//	        con.close();
//
//	    } catch (Exception e) {
//	        e.printStackTrace();
//	    }

// GET USER CART
//	public List<Cart> getUserCart(int userId) {
//		List<Cart> list = new ArrayList<>();
//
//		try {
//			Connection conn = DBConnection.getConnection();
//			String sql = """
//				    SELECT c.id, p.name, p.price
//				    FROM cart c
//				    JOIN products p ON c.product_id = p.id
//				    WHERE c.user_id = ?
//				"""; 
//					   
//
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setInt(1, userId);
//			ResultSet rs = ps.executeQuery();
//
//			while (rs.next()) {
//				Cart c = new Cart();
//				c.setId(rs.getInt("id"));
//				c.setProductName(rs.getString("name"));
//				c.setPrice(rs.getInt("price"));
//				list.add(c);
//			}
//			conn.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

//
//	// REMOVE FROM CART
//	public void removeCart(int cartId) {
//		try {
//			Connection con = DBConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("DELETE FROM cart WHERE id=?");
//			ps.setInt(1, cartId);
//			ps.executeUpdate();
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//	}
//}
