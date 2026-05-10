package p3;

import java.sql.Timestamp;

public class Orders1{
	
	int id;
	String card_no;
	int total_amount;
	String status;
	Timestamp order_date;
	
	public Orders1() {
		
	}
	
	
	public Orders1(int id, String card_no,int total_amount, String status, Timestamp order_date) {
		super();
		this.id = id;
		this.card_no = card_no;
		this.total_amount=total_amount;
		this.status = status;
		this.order_date = order_date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCard_no() {
		return card_no;
	}


	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public int getTotal_amount() {
		return total_amount;
	}


	public void setTotal_amount(int total_amount) {
		this.total_amount=total_amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Timestamp getOrder_date() {
		return order_date;
	}


	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}
	
	
}