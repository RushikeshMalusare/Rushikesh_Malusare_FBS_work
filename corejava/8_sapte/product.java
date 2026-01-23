class Test
{
	int id;
	String name;
	int quantity;
	double price;
	void setid(int p)
	{
		this.id=p;
	}
	void setname(String s)
	{
		this.name=s;
	}
	void setquantity(int p)
	{
		this.quantity=p;
	}
	void setprice(double p)
	{
		this.price=p;
	}
	int getid()
	{
		return this.id;
	}	
	String getname()
	{
		return this.name;
	}
	int getquantity()
	{
		return this.quantity;
	}
	Double getprice()
	{
		return this.price;
	}
	Test()//default constru
	{
		this.id=101;
		this.name="Laptop";
		this.quantity=2;
		this.price=7832.23;
		System.out.println("Default Constructor");
	}
	Test(int a,String s,int x,Double d)
	{
		this.id=a;
		this.name=s;
		this.quantity=x;
		this.price=d;
		System.out.println("parameter Constructor");
	}
	void display()//fun defination
	{
		System.out.println("product id "+this.id);
		System.out.println("product name "+this.name);
		System.out.println("product quantity "+this.quantity);
		System.out.println("product price "+this.price);
	}	
}//class end here
class Prod
{
	public static void main(String[] a)
	{
		Test t1=new Test();
		
		t1.display();//fun call
		Test t2=new Test(12,"Book",1,233.23);
		t2.display();
	}
}