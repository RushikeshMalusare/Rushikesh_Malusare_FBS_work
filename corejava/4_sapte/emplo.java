class Emp
{
	int id;
	String name;
	double sal;
	void display()//call function
	{
		System.out.println("emp id is"+this.id);
		System.out.println("emp name is"+this.name);	
		System.out.println("sal is"+this.sal);
	}
 	void setid(int e)
	{
		this.id=e;
	}
	void setname(String str)
	{
		this.name=str;
	}
	void setsal(double e)
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
		e1.display();//fun declare
	}
}
	