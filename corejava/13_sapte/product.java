
class Test
{
	int id;
	String name;
	int quantity;
	double price;
	static double discount;
	static{
		discount=12.2;
	}
	Test(){
		this.id=121;
		this.name="laptop";
		this.quantity=2;
		this.price=48453.23;
	}
	Test(int id,String name,int quantity,double price){
		this.id=id;
		this.name=name;	
		this.quantity=quantity;
		this.price=price;
	}
	void discount(){
		price=price*discount/100;
	}
	
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
		return price*quantity;
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
		Test t2=new Test();
		t1.discount();
		t1.setid(11);                    
		t1.setname("mouse");
		t1.setquantity(2);
		t1.setprice(200.23);
		t1.discount();
		t1.display();//fun call
		t2.discount();
		t2.display();
	}
}