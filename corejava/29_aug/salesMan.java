class S_Manager
{
	int id;
	String name;
	double sal,incen;
	int target;
	void setid(int s)
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
		System.out.println(s1.id);		
		System.out.println(s1.name);
		System.out.println(s1.sal);
		System.out.println(s1.incen);
		System.out.println(s1.target);
	}
}
			