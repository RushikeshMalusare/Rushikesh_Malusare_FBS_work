import java.util.Scanner;
class Test
{
	String frn;
	String name;
	double mark;
	Test(){
		this.frn="";
		this.name="";
		this.mark=0;
	}
	Test(String frn,String name,double mark){
		this.frn=frn;
		this.name=name;
		this.mark=mark;
	}
	void setfrn(String a)
	{
		this.frn=a;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setmark(Double a)
	{
		this.mark=a;
	}
	String getfrn()
	{
		return this.frn;
	}
	String getname()
	{
		return this.name;
	}
	Double getmark()
	{
		return this.mark;
	}
	void display()//fun defination
	{
		System.out.println("Student frn is "+this.frn);
		System.out.println("Student name is "+this.name);
		System.out.println("Student mark is "+this.mark);
	}
}//class end here
class Stud
{
	public static void main(String[] a)
	{
	Scanner s=new Scanner(System.in);
		Test t1=new Test();
	System.out.println("Enter FRN No ");
		String frn=s.nextLine();
		t1.setfrn(frn);
		
	System.out.println("Enter Name ");
		String nm=s.nextLine();
		t1.setname(nm);
		
	System.out.println("Enter Mark ");
		double mar=s.nextDouble();
		t1.setmark(mar);
		t1.display();//fun call
	}
}