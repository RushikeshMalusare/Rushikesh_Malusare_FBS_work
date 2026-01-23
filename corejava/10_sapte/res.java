import java.util.Scanner;
class Demo
{
	int id;
	String name;
	double sal;
	double commition;
	Demo(){
		this.id=0;
		this.name="";
		this.sal=0.0;
		this.commition=0.0;
	}
	Demo(int id,String name,double sal,double commition){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.commition=commition;
	}
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
	Scanner s=new Scanner(System.in);
		Demo d=new Demo();
	System.out.println("Enter Id ");
		int id=s.nextInt();
		d.setid(id);
		s.nextLine();
	System.out.println("Enter Name ");
		String nm=s.nextLine();
		d.setname(nm);
	System.out.println("Enter Salary ");
		double sal=s.nextDouble();
		d.setsal(sal);
	System.out.println("Enter Commition ");	
		double com=s.nextDouble();
		d.setcommition(com);
		d.display();
	}
}
		