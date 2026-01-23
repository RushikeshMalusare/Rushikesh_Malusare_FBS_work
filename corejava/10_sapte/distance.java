import java.util.Scanner;
class Demo
{
	int feet;
	double inches;
	Demo(){ //default constructor
		this.feet=0;
		this.inches=0.0;
	}
	Demo(int feet,double inches){
		this.feet=feet;
		this.inches=inches;
	}
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
	Scanner s=new Scanner(System.in);
		Demo d1=new Demo();
	System.out.println("Enter feet");
		int f=s.nextInt();
		d1.setfeet(f);
	System.out.println("Enter Inches");
		double inc=s.nextDouble();
		d1.setinches(inc);
		d1.display();
	}
}