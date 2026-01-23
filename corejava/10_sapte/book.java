import java.util.Scanner;
import java.util.Date;
class Test1
{
	int id;
	String title;
	String author;
	String publisher;
	Double price;
	
	Test1(){     //default constructor
		this.id=0;
		this.title="";
		this.author="";
		this.publisher="";
		this.price=0.0;
	}
	Test1(int id,String title,String author,String publisher,double price){	
		this.id=id;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
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
	void setpublisher(String d)
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
	String getpublisher()
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
	Scanner sc=new Scanner(System.in);
		Test1 t=new Test1();
		System.out.println("Enter id");
		int id=sc.nextInt();
		t.setid(id);
		System.out.println("Enter Title");
		String title=sc.nextLine();
		t.settitle(title);

		sc.nextLine();
		System.out.println("Enter Author Name ");
		String author=sc.nextLine();
		t.setauthor(author);

		System.out.println("Enter published Date");
		String d=sc.nextLine();
		t.setpublisher(d);
		sc.nextLine();

		System.out.println("Enter Price");
		double p=sc.nextDouble();
		t.setprice(p);
		t.display();//fun call
	}
}