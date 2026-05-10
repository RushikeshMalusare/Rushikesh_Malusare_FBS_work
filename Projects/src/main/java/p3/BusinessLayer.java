package p3;

public class BusinessLayer {

 public boolean checkLogin(String user, String pass) {
	        TextDAO dao = new TextDAO();
	        return dao.checkUser1(user, pass);
	    }
 
// 	public boolean registerUser(String name, String email, String password, String mobile,String role) {
//	// TODO Auto-generated method stub
// 		TextDAO dao = new TextDAO();
//     		return dao.saveUser(name, email, password, mobile,role);
// 
// 	}

	public boolean registerUser(String name, String email, String password, String mobile) {
		TextDAO dao = new TextDAO();
 		return dao.saveUser(name, email, password, mobile);
 
	}


}


//	public boolean registerUser(String name, String email, String password, String mobile, String role) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	


