class Emp
{
	int id;
	String name;
	double sal;
	void setid(int e)
	{
		this.id=e;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setsal(Double d)
	{
		this.sal=d;
	}
	int getid()
	{
		return this .id;
	}
	String get()
	{
		return this.name;
	}
	Double sal()
	{
		return this.sal;
	}
	Emp()//default constr
	{
		this.id=111;
		this.name="xyz";
		this.sal=12345.89;
		System.out.println("Default Constructor");
	}
	Emp(int a,String s,Double d)//parameter constr
	{
		this.id=a;
		this.name=s;
		this.sal=d;
		System.out.println("Parameter Constructor");
	}

	void display()
	{
		System.out.println("emp id "+this.id);
		System.out.println("emp name "+this.name);
		System.out.println("emp sal "+this.sal);
	}
	
}//class end here
class test
{
	public static void main(String[] a)
	{
		Emp e1=new Emp();
		e1.display();
		Emp e2=new Emp(121,"Adi",8721.12);
		e2.display();//fun call;
	}
}
