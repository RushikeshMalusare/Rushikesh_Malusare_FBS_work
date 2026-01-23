class Demo
{
	int id;
	String name;
	double sal;
	double commition;
	void setid(int a)
	{
		this.id=a;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setsal(Double d)
	{
		this.sal=d;
	}
	void setcommition(Double d)	
	{
		this.commition=d;
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
	Double getcommition()
	{
		return this.commition;
	}
	void display()
	{
		System.out.println("Hiring Resourse Manager id "+this.id);
		System.out.println("Hiring Resourse Manager name "+this.name);
		System.out.println("Hiring Resourse Manager salary "+this.sal);
		System.out.println("Hiring Resourse Manager commition "+this.commition);
	}	
}//class end here
class Hiring
{
	public static void main(String[] a)
	{
		Demo d=new Demo();
		d.setid(1001);
		d.setname("yashraj");
		d.setsal(87232.23);
		d.setcommition(2342.32);
		d.display();
	}
}
		