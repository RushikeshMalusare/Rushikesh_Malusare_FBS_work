class Test
{
	int acc_no;
	String holder_name;
	Double balance;
	String branch;
	void setacc_no(int a)
	{
		this.acc_no=a;
	}
	void setholder_name(String s)
	{
		this.holder_name=s;
	}
	void setbalance(Double s)
	{
		this.balance=s;
	}
	void setbranch(String s)
	{
		this.branch=s;
	}
	int getacc_no()
	{
		return this.acc_no;
	}
	String getholder_name()
	{
		return this.holder_name;
	}
	Double getbalance()
	{
		return this.balance;
	}
	String getbranch()
	{
		return this.branch;
	}
	Test()//cons name
	{
		this.acc_no=1238;
		this.holder_name="yash";
		this.balance=98239.32;
		this.branch="Hdfc";
		System.out.println("Default Constructor");
	}
	Test(int a,String s,Double d,String x)
	{
		this.acc_no=a;
		this.holder_name=s;
		this.balance=d;
		this.branch=x;
		System.out.println("parameter constructor");	
	}
	void display()
	{
		System.out.println("Bank acc_no "+this.acc_no);
		System.out.println("Bank holder_name "+this.holder_name);
		System.out.println("Bank balance "+this.balance);
		System.out.println("Bank branch "+this.branch);
		
	}
	
	
}//class end here
class Bank
{
	public static void main(String[] a)
	{
	Test t1=new Test();
	
	t1.display();//fun call
	Test t2=new Test(12234,"surya",8127.23,"SBI");
		t2.display();
	}
}
