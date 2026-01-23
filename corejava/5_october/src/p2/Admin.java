
package p2;
import p1.Emp;

public class Admin extends Emp {
	 double allowed;

	public Admin() {
		super();
		this.allowed =5000;
		
	}

	public Admin(int id,String name ,double sal,double allowed) {
		super(id,name,sal);
		this.allowed = allowed;
	}

	public double getAllowed() {
		return allowed;
	}

	public void setAllowed(double allowed) {
		this.allowed = allowed;
	}
	public String toString() {
		return super.toString()+"Allowed"+this.allowed;
	}
//	public double Calsal()
//	{
//		return sal+allowed;
//	}

	@Override
	public double Calsal() {
		
		 return this.getSal()+this.allowed;
	}
}


