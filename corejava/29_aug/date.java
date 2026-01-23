class Date
{
	int day,month,year;
	String dow;//reference
}//class end here
class test
{
	public static void main(String []a)
	{
		Date d1;
		d1=new Date();
		System.out.println(d1);
		d1.dow="wed";
		d1=new Date();
		System.out.println(d1.dow);
	}//main end here
}//class test end here		