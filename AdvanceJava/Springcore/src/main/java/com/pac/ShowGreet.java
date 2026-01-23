package com.pac;

public class ShowGreet implements DemoTable{

	String msg;
	
	public ShowGreet() {
		
	}
	
	public ShowGreet(String msg) {
		super();
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello Word!");
	}

	
}
