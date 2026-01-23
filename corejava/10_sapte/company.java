import java.util.Scanner;
class Test
{
	
	String name;
	int distance;
	String designation;
	Test(){
		this.name="";
		this.distance=0;
		this.designation="";
	}
	Test(String name,int distance,String design){
		this.name=name;
		this.distance=distance;
		this.designation=designation;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setdistance(int a)
	{
		this.distance=a;
	}
	void setdesignation(String x)
	{
		this.designation=x;
	}
	
	String getname()
	{
		return this.name;
	}
	int getdistance()
	{
		return this.distance;
	}
	String getdesignation()
	{
		return this.designation;
	}
	void display()
	{
		System.out.println("Company Name "+this.name);
		System.out.println("Company Distance "+this.distance);
		System.out.println("Company Designation "+this.designation);
		
		
	}	
}//class end here
class Company
{
	public static void main(String[] a)
	{
	Scanner sc=new Scanner(System.in);
	Test t1=new Test();
	System.out.println("Enter Company Name ");
	String nm=sc.nextLine();
	t1.setname(nm);
	System.out.println("Enter The Distance");
	int dis=sc.nextInt();
	t1.setdistance(dis);
	sc.nextLine();
	System.out.println("Enter Designation");
	String des=sc.nextLine();
	t1.setdesignation(des);
	
	t1.display();//fun call
	}
}
