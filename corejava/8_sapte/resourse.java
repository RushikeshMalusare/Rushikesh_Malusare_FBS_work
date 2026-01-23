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
	Demo()//default constructor
	{	
		this.id=1001;
		this.name="sai";
		this.sal=9821.12;
		this.commition=232.90;
		System.out.println("Default Constructor");
	}
	Demo(int a,String s,Double x,Double z)
	{
		this.id=a;
		this.name=s;
		this.sal=x;
		this.commition=z;
		System.out.println("parameter Constructor");
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
		
		d.display();
		Demo d1=new  Demo(111,"mayur",76237.23,87.23);
		d1.display();

	}
}
		