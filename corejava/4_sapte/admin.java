
class Test
{
	int id;
	String name;
	double sal;
	int allowance;
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
	void setallowance(int a)
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
	int getallowance()
	{
		return this.allowance;
	}
	void display()
	{
		System.out.println("Admin id "+this.id);
		System.out.println("Admin name "+this.name);
		System.out.println("Admin sal "+this.sal);
		System.out.println("Admin allowance "+this.allowance);
	}	
}//class end here
class Admin
{
	public static void main(String[] a)
	{
		Test t1=new Test();
		t1.setid(101);
		t1.setname("Aditya");
		t1.setsal(28738.23);
		t1.setallowance(23);
		t1.display();//fun call
	}
}