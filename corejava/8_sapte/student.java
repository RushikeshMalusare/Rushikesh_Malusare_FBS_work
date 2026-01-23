class Test
{
	String frn;
	String name;
	double mark;
	void setfrn(String a)
	{
		this.frn=a;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setmark(Double a)
	{
		this.mark=a;
	}
	String getfrn()
	{
		return this.frn;
	}
	String getname()
	{
		return this.name;
	}
	Double getmark()
	{
		return this.mark;
	}
	Test()//default constr
	{
		this.frn="FRN-11J0625/047";
		this.name="Rushikesh";
		this.mark=70.23;
		System.out.println("Default Constructor");
	}
	Test(String a,String s,Double m)
	{
		this.frn=a;
		this.name=s;
		this.mark=m;
		System.out.println("Parameter Constructor");
	}
	void display()//fun defination
	{
		System.out.println("Student frn is "+this.frn);
		System.out.println("Student name is "+this.name);
		System.out.println("Student mark is "+this.mark);
	}
}//class end here
class Stud
{
	public static void main(String[] a)
	{
		Test t1=new Test();
		
		t1.display();//fun call
		Test t2=new Test("FRN-11J625/043","yash",89.23);
		t2.display();
	}
}