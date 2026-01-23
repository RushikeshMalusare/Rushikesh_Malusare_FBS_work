class Date
{
	int day,month,year;
	String dow;
	void setday(int a)
	{
		this.day=a;
	}
	void setmonth(int a)
	{
		this.month=a;
	}
	void setyear(int a)
	{
		this.year=a;
	}
	void setdow(String s)
	{
		this.dow=s;
	}
	int  getday()
	{
		return this.day;
	}
	String getdow()
	{
		return this.dow;
	}
	Date()//constructor name
	{
		this.day=7;
		this.month=1;
		this.year=2023;
		this.dow="Tue";
		System.out.println("default constructor");
	}
	void display()
	{
		System.out.println(this.day);
		System.out.println(this.month);
		System.out.println(this.year);
		System.out.println(this.dow);
	}
	Date(int d,int m,int y,String s)//constructor name
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=s;
		System.out.println("parameter constructor");
	}	
	
}//class end here
class test
{
	public static void main(String[] a)
	{
		Date d1=new Date();
		
		d1.display();
		Date d2=new Date(13,5,2025,"wed");
		d2.display();
		
	}
}