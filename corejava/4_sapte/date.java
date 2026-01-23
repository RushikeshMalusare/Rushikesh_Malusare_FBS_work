class Emp
{
	int id;
	String name;
	double sal;
	int getid()//call function
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
}//class end here
class Demo
{
	public static void main(String[] a)
	{
		Emp e1;
		e1=new Emp();
		e1.setid(1);
		e1.setname("yash");
		e1.setsal(7865);
		if(e1.getid())
		{
			System.out.println(this.id);
		}
		if(e1.getname())
		{
			System.out.println(this.name);
		}
		if(e1.getsal())
		{
			System.out.println(this.sal);
		}
		
	}
}
	