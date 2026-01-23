class Time
{
	int hr,min,sec;

	Time()
	{
		this.hr=0;
		this.min=0;
		this.sec=0;
	}
	Time(int hr, int min, int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}

	void addTime(Time t1,Time t2)
	{
		this.hr=t1.hr+t2.hr;
		this.min=t1.min+t2.min;
		this.sec=t1.sec+t2.sec;
	}
	void addTime(Time t1)
	{
		this.hr=t1.hr+2;
		this.min=t1.min+2;
		this.sec=t1.sec+2;
	}
	void display()
	{
		int totalTime=(this.hr*60*60)+(this.min*60)+(this.sec);
		this.min=(totalTime%3600)/60;
		this.hr=totalTime/3600;	
		this.sec=(totalTime%3600)%60;
		System.out.println(this.hr+":"+this.min+":"+this.sec);
	}
	
}
//Time class ends here
class TestTime
{
	public static void main(String []args)
	{
		Time t1=new Time(5,59,59);
		Time t2=new Time(1,2,2);
		Time t3=new Time();
		t3.addTime(t1,t2);
		t3.display();
		t3.addTime(t1);
		t3.display();
		
		
	}

}
