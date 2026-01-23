

class Emp
{
		int id;
		String name;
		double sal;
		Emp(){
			this.id=0;
			this.name="";
			this.sal=0.0;
		}
		Emp(int id,String name,double sal){
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		void display()//call function
		{
			System.out.println("emp id is"+this.id);
			System.out.println("emp name is"+this.name);	
			System.out.println("sal is"+this.sal);
		}
	 	void setid(int e)
		{
			this.id=e;
		}
		void setname(String str)
		{
			this.name=str;
		}
		void setsal(double e)
		{
			this.sal=e;
		}
		
	}//class emp end here
class Smanager extends Emp
{
	
	double incentive;
	int target;
	Smanager() {
		super();
		this.incentive = 234.3;
		this.target = 4;
		
	}
	Smanager(int id,String name,double sal,double incentive, int target) {
		super(id,name,sal);
		this.incentive = incentive;
		this.target = target;
	}
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display() {
		System.out.println("emp id is"+this.id);
		System.out.println("emp name is"+this.name);	
		System.out.println("sal is"+this.sal);
		System.out.println("emp id is"+this.incentive);
		System.out.println("emp name is"+this.target);	
	
	}
}//class smanager end here
	class Hr extends Emp{
		double commition;

		Hr() {
			super();
			this.commition = 234.3;
			
		}

		Hr(int id,String name,double sal,double commition) {
			super(id,name,sal);
			this.commition = commition;
		}

		double getCommition() {
			return commition;
		}

		void setCommition(double commition) {
			this.commition = commition;
		}
	void display(){
		System.out.println("emp id is"+this.id);
		System.out.println("emp name is"+this.name);	
		System.out.println("sal is"+this.sal);
		
	}
	}//class hr end here
	class Admin extends Emp{
		double allowed;

		Admin() {
			super();
			this.allowed = 12.2;
			
		}

		Admin(int id,String name ,double sal,double allowed) {
			super(id,name,sal);
			this.allowed = allowed;
		}

		double getAllowed() {
			return allowed;
		}

		void setAllowed(double allowed) {
			this.allowed = allowed;
		}
		void display() {
			System.out.println("emp Admin is"+this.allowed);
		}
	}//class admin end here
		class Amanager extends Smanager{
			String nm;

			Amanager() {
				super();
				this.nm = "not given";
			}

			Amanager(int id,String name,double sal,double incentive,int target,String nm) {
				super(id,name,sal,incentive,target);
				this.nm = nm;
			}
			
		
		
	
}//class amanager end here
	
	class Demo
	{
		public static void main(String[] a)
		{	
			{
				Emp s1=new Emp(121,"xyz",2349.34);
				s1.display();
				
				Smanager s2=new Smanager(121,"xyz",2349.34,22.2,21 );
				s2.display();
				Admin s3=new Admin(121,"xyz",2349.34,45.4);
				s3.display();
				Amanager s4=new Amanager(121,"xyz",2349.34,12.2,111,"pqr");
				s4.display();
			}
		}
	}

			
	
		

