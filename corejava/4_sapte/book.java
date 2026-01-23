class Test1
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
		Test1 t=new Test1();
		t.setid(101);
		t.settitle("C Programming");
		t.setauthor("Dennis Ritchie");
		t.setpublisher(03/02/1972);
		t.setprice(78238.23);
		t.display();//fun call
	}
}