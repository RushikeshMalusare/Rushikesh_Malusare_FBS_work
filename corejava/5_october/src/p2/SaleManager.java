package p2;


import p1.Emp;

public class SaleManager extends Emp {
	double incentive;
	int target;
	public SaleManager() {
		super();
		this.incentive =0;
		this.target = 0;
		
	}
	public SaleManager(int id,String name,double sal,double incentive, int target) {
		super(id,name,sal);
		this.incentive = incentive;
		this.target = target;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public String toString() {
		return "Incentive is "+this.incentive+
				"Target Is "+this.target;
	
	}
	@Override
	public double Calsal() {
		
		return this.getSal()+incentive;
	}
	
}


