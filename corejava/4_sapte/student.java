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
		t1.setfrn("frn-11J0625/047");
		t1.setname("Rushi");
		t1.setmark(89.23);
		t1.display();//fun call
	}
}