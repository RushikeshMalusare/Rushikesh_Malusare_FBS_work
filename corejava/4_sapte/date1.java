class Date
{
	int day;
	void setday(int a)
	{
		this.day=a;
	}
	int  getday()
	{
		return this.day;
	}
	void display()
	{
		System.out.println("day is"+this.day);
	}
	
}//class end here
class test
{
	public static void main(String[] a)
	{
		Date d1=new Date();
		d1.setday(8);
		//d1.setmonth(9);
		//d1.setyear(2025);
		d1.display();
	}
}