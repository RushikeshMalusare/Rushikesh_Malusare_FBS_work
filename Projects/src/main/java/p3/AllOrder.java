package p3;

public class AllOrder {
	
	String Uname;
	String Pname;
	int price;
	String PayStatus;
	
	public AllOrder() {
		
	}
	
	public AllOrder(String uname, String pname, int price, String payStatus) {
		super();
		Uname = uname;
		Pname = pname;
		this.price = price;
		PayStatus = payStatus;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		Uname = uname;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPayStatus() {
		return PayStatus;
	}

	public void setPayStatus(String payStatus) {
		PayStatus = payStatus;
	}
	
	
	
}
