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
		e1.setid(101);
		e1.setname("Amol");
		e1.setsal(30000.23);
		e1.display();
	}
}
