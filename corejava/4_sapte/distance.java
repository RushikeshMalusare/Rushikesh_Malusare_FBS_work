class Demo
{
	int feet;
	double inches;
	void setfeet(int a)
	{
		this.feet=a;
	}
	void setinches(Double d)
	{
		this.inches=d;
	}
	int getfeet()
	{
		return this.feet;
	}
	Double getinches()
	{
		return this.inches;
	}
	void display()
	{
		System.out.println("Distance in feet "+this.feet);
		System.out.println("Distance in inches "+this.inches);
	}
}//class end here
class Distance
{
	public static void main (String[] a)
	{
		Demo d1=new Demo();
		d1.setfeet(34);
		d1.setinches(223.45);
		d1.display();
	}
}