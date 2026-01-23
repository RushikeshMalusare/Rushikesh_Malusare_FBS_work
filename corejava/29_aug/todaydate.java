class date
{
	int day,month,year;
	String dow;
	void setday(int d)//fun call
	{
		this.day=d;
	}
	void setmonth(int d)//fun call
	{
		this.month=d;
	}
	void setyear(int d)
	{
		this.year=d;
	}
	void setdow(String str)//fun call
	{
		this.dow=str;
	}
}//class end here
class test
{
	public static void main(String[] a)//main func
	{
		date d1=new date();
		d1.setday(10);
		d1.setmonth(9);
		d1.setyear(2025);
		d1.setdow("wed");
		System.out.println(d1.day+"/"+d1.month+"/"+d1.year);
		//System.out.println(d1.month);
		//System.out.println(d1.year);
		System.out.println(d1.dow);
	}
}