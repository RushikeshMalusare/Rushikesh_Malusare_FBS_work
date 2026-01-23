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
	void display()//fun defination
	{
		System.out.println("product id"+this.id);
		System.out.println("product name"+this.name);
		System.out.println("product quantity"+this.quantity);
		System.out.println("product price"+this.price);
	}	
}//class end here
class Prod
{
	public static void main(String[] a)
	{
		Test t1=new Test();
		t1.setid(111);
		t1.setname("laptop");
		t1.setquantity(3);
		t1.setprice(23445.23);
		t1.display();//fun call
	}
}