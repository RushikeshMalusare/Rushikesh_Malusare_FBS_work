package p3;

public class Order {

	     int userId;
	     int productId;
	     int amount;
	     String status;
	     
	    public Order() {
	    	
	    }
	    
		public Order(int userId, int productId, int amount,String status) {
			super();
			this.userId = userId;
			this.productId = productId;
			this.amount = amount;
			this.status=status;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
	    
		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	    
	    
}
