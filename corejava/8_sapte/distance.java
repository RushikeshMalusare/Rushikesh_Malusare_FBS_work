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
	Demo()//default constructor
	{
		this.feet=23;
		this.inches=24.98;
		System.out.println("Default Constructor");
	}
	Demo(int a,Double b)//paramerterise constructor
	{
		this.feet=a;
		this.inches=b;
		System.out.println("Parameter Constructor");
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
		
		d1.display();
		Demo d2=new Demo(12,87.45);
		d2.display();
	}
}