class Test
{
	
	String name;
	int distance;
	String designation;
	void setname(String s)
	{
		this.name=s;
	}
	void setdistance(int a)
	{
		this.distance=a;
	}
	void setdesignation(String x)
	{
		this.designation=x;
	}
	
	String getname()
	{
		return this.name;
	}
	int getdistance()
	{
		return this.distance;
	}
	String getdesignation()
	{
		return this.designation;
	}
	Test()//default constructor
	{
		this.name="Capgemini"
		this.distance=20;
		this.designation="Manager";
		System.out.println("Default Constructor");
	}
	Test(String s,int a,String x)//parameter constructor
	{
		this.name=s;
		this.distance=a;
		this.designation=x;
		System.out.println("Parameter Constructor");
	}
	void display()
	{
		System.out.println("Company Name "+this.name);
		System.out.println("Company Distance "+this.distance);
		System.out.println("Company Designation "+this.designation);
		
		
	}	
}//class end here
class Company
{
	public static void main(String[] a)
	{
	Test t1=new Test();
	t1.display();
	
	Test t2=new Test();
	t2.display("MasterCard",10,"HR");
	
	
	t2.display();//fun call
	}
}
