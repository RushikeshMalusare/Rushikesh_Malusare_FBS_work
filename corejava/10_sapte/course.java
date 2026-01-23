import java.util.Scanner;
class Demo
{
	int course_id;
	String course_name;
	int duration;
	Double fees;
	Demo(){
		this.course_id=0;
		this.course_name="";
		this.duration=0;
		this.fees=0.0;
	}
	Demo(int id,String course_name,int duration,double fees){
		this.course_id=course_id;
		this.course_name=course_name;
		this.duration=duration;
		this.fees=fees;
	}
	void setcourse_id(int a)
	{
		this.course_id=a;
	}
	void setcourse_name(String s)
	{
		this.course_name=s;
	}
	void setduration(int a)
	{
		this.duration=a;
	}
	void setfees(Double a)
	{
		this.fees=a;
	}
   	int getcourse_id()
	{
		return this.course_id;
	}
	String getcourse_name()
	{
		return this.course_name;
	}
	int getduration()
	{
		return this.duration;
	}
	Double getfees()
	{
		return this.fees;
	}
	void display()
	{
		System.out.println("Course id is "+this.course_id);
		System.out.println("Course name is "+this.course_name);
		System.out.println("Course duration is "+this.duration);
		System.out.println("Course fees is "+this.fees);
	}	
	 
}//class end here
class Course
	{
		public static void main(String[] a)
		{
		Scanner sc=new Scanner(System.in);
			Demo d1=new Demo();
		System.out.println("Enter Id");
			int id=sc.nextInt();
			d1.setcourse_id(id);
			sc.nextLine();
		System.out.println("Enter Course Name");
			String nm=sc.nextLine();
			d1.setcourse_name(nm);
		System.out.println("Enter Duration");
			int dur=sc.nextInt();
			d1.setduration(dur);
		System.out.println("Enter Fees");
			double f=sc.nextDouble();
			d1.setfees(f);
			d1.display();//func call
  		}
	}
	