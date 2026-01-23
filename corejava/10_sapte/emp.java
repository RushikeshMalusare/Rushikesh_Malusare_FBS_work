import java.util.Scanner;
class Emp
{
	int id;
	String name;
	double sal;
	Emp(){
		this.id=0;
		this.name="";
		this.sal=0.0;
	}
	Emp(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
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
	Scanner s=new Scanner(System.in);
		Emp e1;
		e1=new Emp();
	System.out.println("Enter id ");
		int id=s.nextInt();
		e1.setid(id);//function defination
		s.nextLine();
	System.out.println("Enter Name ");
		String nm=s.nextLine();
		e1.setname(nm);
	System.out.println("Enter Salary ");
		double sal=s.nextDouble();
		e1.setsal(sal);
		e1.display();//fun declare
	}
}
	