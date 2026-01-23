class Stud
{
	int rollno;
	String name;
	double marks;
	void setrollno(int h)
	{
		this.rollno=h;
	}
	void setname(String sm)
	{
		this.name=sm;
	}
	void setmarks(double s)
	{
		this.marks=s;
	}
}//class end here
class Student
{
	public static void main(String[] a)
	{
		Stud s1=new Stud();
		s1.setrollno(1);
		s1.setname("Ganesh");
		s1.setmarks(79.45);
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.marks);
	}
}