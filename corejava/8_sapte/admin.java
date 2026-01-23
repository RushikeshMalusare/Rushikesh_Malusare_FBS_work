class Test
{
	int id;
	String name;
	double sal;
	double allowance;
	void setid(int a)
	{
		this.id=a;
	}
	void setname(String s)
	{	
		this.name=s;
	}
	void setsal(Double a)
	{
		this.sal=a;
	}
	void setallowance(Double a)
	{
		this.allowance=a;
	}
	int getid()
	{
		return this.id;
	}
	String getname()
	{
		return this.name;
	}
	Double getsal()
	{
		return this.sal;
	}
	Double getallowance()
	{
		return this.allowance;
	}
	Test()//default constructor
	{
		this.id=111;
		this.name="yash";
		this.sal=8273.84;
		this.allowance=234.23;
		System.out.println("Default Constructor");
	}
	void display()
	{
		System.out.println("Admin id "+this.id);
		System.out.println("Admin name "+this.name);
		System.out.println("Admin sal "+this.sal);
		System.out.println("Admin allowance "+this.allowance);
	}
	
	Test(int d,String s,Double a,Double x)
	{
		 this.id=d;
		 this.name=s;
		 this.sal=a;
		 this.allowance=x;
		System.out.println("parameter Constructor");
	}	
}//class end here
class Admin
{
	public static void main(String[] args)
	{
		Test t1=new Test();
		
		t1.display();//fun call
		Test t2=new Test(111,"raj",8723.23,87.23);
		t2.display();
	}
}