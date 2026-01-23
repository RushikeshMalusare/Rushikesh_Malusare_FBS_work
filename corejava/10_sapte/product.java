import java.util.Scanner;
class Test
{
	int id;
	String name;
	int quantity;
	double price;
	Test(){
		this.id=0;
		this.name="";
		this.quantity=0;
		this.price=0.0;
	}
	Test(int id,String name,int quantity,double price){
		this.id=id;
		this.name=name;	
		this.quantity=quantity;
		this.price=price;
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
	Scanner s=new Scanner(System.in);
		Test t1=new Test();
	System.out.println("Enter Id ");
		int id=s.nextInt();
		t1.setid(id);
		s.nextLine();
	System.out.println("Enter Product Name ");
		String nm=s.nextLine();
		t1.setname(nm);
	System.out.println("Enter Quantity ");
		int qun=s.nextInt();
		t1.setquantity(qun);
	System.out.println("Enter the Price");
		double p=s.nextDouble();
		t1.setprice(p);
		t1.display();//fun call
	}
}