class S_Manager
{
	int id;
	String name;
	double sal,incen;
	int target;
	void setid(int s)//setter return type nhi hai
	{
		this.id=s;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setsal(double s)
	{
		this.sal=s;
	}
	void setincen(double s)
	{
		this.incen=s;
	}
	void settarget(int s)
	{
		this.target=s;
	}
	int getid()
	{
		return this.id;
	}
	double getsal()
	{
		return this.sal;
	}
	Double getincen()
	{
		return this.incen;
	}
	int gettarget()
	{
		return this.target;
	}
	void display()
	{
		System.out.println("sales id is "+this.id);
		System.out.println("sales name "+this.name);
		System.out.println("sales salary "+this.sal);
		System.out.println("sales incentive "+this.incen);
		System.out.println("sales target "+this.target);
	}
}//class end here
class Manager
{
	public static void main(String[] a)
	{
		S_Manager s1=new S_Manager();
		s1.setid(111);
		s1.setname("Aditya");
		s1.setsal(6798.76);
		s1.setincen(8976.23);
		s1.settarget(23);
		s1.display();
		
}
			