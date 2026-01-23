class Test
{
	long_int acc_no;
	String holder_name;
	Double balance;
	String branch;
	void setacc_no(long_int a)
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
	long_int getacc_no()
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
	t1.setacc_no(287218732376);
	t1.setholder_name("yash");
	t1.setbalance(87238.12);
	t1.setbranch("HDFC");
	t1.display();//fun call
	}
}
