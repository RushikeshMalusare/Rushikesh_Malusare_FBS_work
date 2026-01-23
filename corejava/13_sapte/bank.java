import java.util.Scanner;
class Test
{
	int acc_no;
	String holder_name;
	Double balance;
	static double intrate;
	static
	{
		intrate=9.3;
	}
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
	//void setintrate(Double s)
	//{
		//this.intrate=s;
	//}
	int getacc_no()
	{
		return this.acc_no;
	}
	String getholder_name()
	{
		return this.holder_name;
	}
	//Double getbalance()
	//{
		//return this.balance;
	//}
	double getbranch()
	{
		return this.intrate;
	}
	Test()  //default constructor
	{ 
		this.acc_no=898;
		this.holder_name="abc";
		this.balance=987.0;
	}
	Test(int no,String name,Double bal) //parameter constructor
	{	
		this.acc_no=no;
		this.holder_name=name;
		this.balance=bal;
	}
	void display()
	{
		System.out.println("Bank acc_no "+this.acc_no);
		System.out.println("Bank holder_name "+this.holder_name);
		System.out.println("Bank balance "+this.balance);
		System.out.println("Bank Interast "+this.intrate);
		
	}	
}//class end here
class Bank
{
	public static void main(String[] a)
	{
	
	Test t1=new Test();
	t1.display();
	Test t2=new Test();
       	System.out.println("Parameter Constructor ");
	t2.setacc_no(121);
	t2.setholder_name("yash");
	t2.setbalance(8923.8); 
	t2.display();

	}
}
