class Demo
{
	int course_id;
	String course_name;
	int duration;
	Double fees;
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
	Demo()//default const
	{
		this.course_id=101;
		this.course_name="Java Full Stack";
		this.duration=6;
		this.fees=40000.90;
		System.out.println("Default Constructor");
	}
	Demo(int a,String s,int x,Double y)//parameter const
	{
		this.course_id=a;
		this.course_name=s;
		this.duration=x;
		this.fees=y;
		System.out.println("Parameterise Constructor");
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
			Demo d1=new Demo();
			
			d1.display();//func call
			Demo d2=new Demo(1,"python",4,30000.23);//parameter const
			d2.display();
  		}
	}
	