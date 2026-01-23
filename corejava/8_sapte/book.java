class Test
{
	int id;
	String title;
	String author;
	int publisher;
	Double price;
	void setid(int a)
	{
		this.id=a;
	}
	void settitle(String s)
	{
		this.title=s;
	}
	void setauthor(String s)
	{
		this.author=s;
	}
	void setpublisher(int d)
	{
		this.publisher=d;
	}
	void setprice(Double d)
	{
		this.price=d;
	}
	int getid()
	{
		return this.id;
	}
	String gettitle()
	{
		return this.title;
	}
	String getauthor()
	{
	 	return this.author;
	}
	int getpublisher()
	{
		return this.publisher;
	}
	Double getprice()
	{
		return this.price;
	}
	Test()//Default constr
	{
		this.id=101;
		this.title="C Programming";
		this.author="Dennis Ritchie";
		this.publisher=23-2-2025;
		this.price=200.23;
		System.out.println("Default constructor");
	}
	Test(int a,String s,String m,int d,Double p)
	{
		this.id=a;
		this.title=s;
		this.author=m;
		this.publisher=d;
		this.price=p;
		System.out.println("Parameter Constructor");
	}
	void display()
	{
		System.out.println("Book id "+this.id);	
		System.out.println("Book title "+this.title);
		System.out.println("Book author "+this.author);
		System.out.println("Book publisher "+this.publisher);
		System.out.println("Book price "+this.price);
	}
}//class end here
class Book
{
	public static void main(String[] a)
	{
		Test t=new Test();
		t.display();//fun call
		Test t1=new Test(121,"java","james gosling",23-2-2025,450.32);
		t1.display();
	}
}