class Emp
{
	int id;
	String name;
	double sal;
	void setid(int e)//call function
	{
		this.id=e;
	}
	void setname(String e)
	{
		this.name=e;	
	}
	void setsal(Double e)
	{
		this.sal=e;
	}
}//class end here
class Demo
{
	public static void main(String[] a)
	{
		Emp e1;
		e1=new Emp();
		e1.setid(101);//function defination
		e1.setname("sarthak");
		e1.setsal(98218.98);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.sal);
	}
}
	