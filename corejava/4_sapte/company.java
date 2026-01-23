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
	t1.setname("MasterCard");
	t1.setdistance(10);
	t1.setdesignation("HR");
	
	t1.display();//fun call
	}
}
