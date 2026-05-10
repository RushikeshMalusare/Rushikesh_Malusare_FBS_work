package p3;

public class prod {

	int id;
	int p_id;
	String name;
	int price;
	int quantity;
	int total;
	String action;
	
	public prod() {
		
		
	}
	
	public prod(int id, int p_id, String name, int price, int quantity, int total, String action) {
		super();
		this.id = id;
		this.p_id = p_id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
	
}




