import java.util.Scanner;
class Test
{
	int id;
	String name;
	double sal;
	int allowance;
	Test(){	   //default constructor  
		this.id=0;
		this.name="";
		this.sal=0;
		this.allowance=0;
	}
	Test(int id,String name,double sal,int allowance){  //parameter constructor
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.allowance=allowance;
	}
	void setid(int a)  //setter 
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
	int getid() //getter
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
		Scanner sc=new Scanner(System.in);
		Test t1=new Test();
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		t1.setid(id);
		sc.nextLine();  //kue
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		t1.setname(name);

		System.out.println("Enter Salary: ");
		double sal=sc.nextDouble();
		t1.setsal(sal);

		System.out.println("Enter Allowance: ");
		int al=sc.nextInt();
		t1.setallowance(al);
		t1.display();//fun call
	}
}