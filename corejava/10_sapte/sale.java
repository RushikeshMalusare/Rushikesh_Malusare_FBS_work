import java.util.Scanner;
class S_Manager
{
	int id;
	String name;
	double sal,incen;
	int target;
	S_Manager(){
		this.id=0;
		this.name="";
		this.sal=0.0;
		this.incen=0.0;
		this.target=0;
	}
	S_Manager(int id,String name,double sal,int target){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.incen=incen;
		this.target=target;
	}
	void setid(int s)//setter return type nhi hai
	{
		this.id=s;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setsal(double s)
	{
		this.sal=s;
	}
	void setincen(double s)
	{
		this.incen=s;
	}
	void settarget(int s)
	{
		this.target=s;
	}
	int getid()
	{
		return this.id;
	}
	double getsal()
	{
		return this.sal;
	}
	Double getincen()
	{
		return this.incen;
	}
	int gettarget()
	{
		return this.target;
	}
	void display()
	{
		System.out.println("sales id is "+this.id);
		System.out.println("sales name "+this.name);
		System.out.println("sales salary "+this.sal);
		System.out.println("sales incentive "+this.incen);
		System.out.println("sales target "+this.target);
	}
}//class end here
class Manager
{
	public static void main(String[] a)
	{
	Scanner s=new Scanner(System.in);
		S_Manager s1=new S_Manager();
	System.out.println("Enter id ");
		int id=s.nextInt();
		s1.setid(id);
		s.nextLine();
	System.out.println("Enter Name ");
		String nm=s.nextLine();
		s1.setname(nm);
	System.out.println("Enter Salary");
		double sal=s.nextDouble();
		s1.setsal(sal);
	System.out.println("Enter incen ");
		double ince=s.nextDouble();
		s1.setincen(ince);
	System.out.println("Enter Target ");
		int tar=s.nextInt();
		s1.settarget(tar);
		s1.display();
	}
		
}
			