package p3;

public class ShowUser {
	     int id;
	     String name;
	     String email;
	     String password;
	    long mobile;
	    String role;
	    
	    public ShowUser() {
	    	
	    }

	    public ShowUser(int id, String name, String email, String password,long mobile,String role) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.password = password;
	        this.mobile=mobile;
	        this.role=role;
	        
	  	}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public long getMobNo() {
			return mobile;
		}

		public void setMobNo(long mobile) {
			this.mobile = mobile;
		}
		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role=role;
		}
	    
	    
	    
}
