package p2;

import p1.Emp;

public class HR extends Emp {
	 double commition;

	public HR() {
		super();
		this.commition =4000;
		
	}

	public HR(int id,String name,double sal,double commition) {
		super(id,name,sal);
		this.commition = commition;
	}

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}
public void display(){
	
		
	System.out.println("commision is"+this.commition);
	
}
public String toString(){
	
	return "emp id:"+this.getId()+"emp name:"+this.getName()+"emp sal "+this.getSal() +"commition: "+this.commition;
			
}

@Override
public double Calsal() {
	return this.getSal()+this.commition;
}

}


