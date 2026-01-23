class Sales
{
	int id;
	String name;
	double sal,incen;
	int target;
	void setid(int s)//setter return type nhi hai
	{
		this.id=s;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setsal(double s)
	{
		this.sal=s;
	}
	void setincen(double s)
	{
		this.incen=s;
	}
	void settarget(int s)
	{
		this.target=s;
	}
	int getid()
	{
		return this.id;
	}
	double getsal()
	{
		return this.sal;
	}
	Double getincen()
	{
		return this.incen;
	}
	int gettarget()
	{
		return this.target;
	}
	Sales()//default constr
	{
		this.id=120;
		this.name="Amol";
		this.sal=27823.32;
		this.incen=872.32;
		this.target=23;
		System.out.println("Default Constructor");
	}
	Sales(int a,String s,Double d,Double x,int t)
	{
		this.id=a;
		this.name=s;
		this.sal=d;
		this.incen=x;
		this.target=t;
		System.out.println("Parameter Constructor");
	}
	void display()
	{
		System.out.println("sales id is "+this.id);
		System.out.println("sales name "+this.name);
		System.out.println("sales salary "+this.sal);
		System.out.println("sales incentive "+this.incen);
		System.out.println("sales target "+this.target);
	}
}//class end here
class Manager
{
	public static void main(String[] a)
	{
		Sales s1=new Sales();
		
		s1.display();
		Sales s2=new Sales(111,"xyz",78112.12,178.12,12);
		s2.display();
	}
		
}
			