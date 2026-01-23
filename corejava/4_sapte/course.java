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
			d1.setcourse_id(1001);
			d1.setcourse_name("Java Full Stack");
			d1.setduration(3);
			d1.setfees(40000.23);
			d1.display();//func call
  		}
	}
	