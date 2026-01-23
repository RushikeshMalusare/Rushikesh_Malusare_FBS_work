class Shirt
{
	int id;
	String name;
	String brand;
	String size;
	double price;
	static double discount;
	static {
		discount=1.1;
	}
	Shirt(){
		this.id=121;
		this.name="T-shirt";
		this.brand="xyz";
		this.size="Small";
		this.price=1000;
	}
	Shirt(int id,String name,String brand,String size,double price){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.size=size;
		this.price.price;
	}
	
	void setid(int id){
		this.id=id;
	}
	void setname(String name){
		this.name=name;
	}
	void setbrand(String brand){
		this.brand=brand;
	}
	void setsize(String size){
		this.size=size;
	}
	void setprice(double price){
		this.price=price;
	}
	
	int getid(){
		return this.id;
	}
	String getname(){
		return this.name;
	}
	String getbrand(){
		return this.brand;
	}
	String getsize(){
		return this.size;
	}
	double getprice(){
		return this.price;
	}
	void calprice(){
		if(size=="Small"){
			price=price*1.1;
			
		}
		else if(size=="Medium"){
			price=price*1.2;
			
		}
		else if(size=="Large"){
			price=price*1.3;
		}
		else if(size=="X-Large"){
			price=price*1.4;
		}
	}
	
	void display(){
		System.out.println("Id is"+this.id);
		System.out.println("Name is"+this.name);
		System.out.println("Brand is"+this.brand);
		System.out.println("Size is"+this.size);
		System.out.println("price is"+price);
	}
}//class end here
class Test
{
	public static void main(String[] a)
	{
		Shirt s1=new Shirt();
		Shirt s2=new Shirt();
		
	
		
		s1.setid(11);                    
		s1.setname("formal");
		s1.setbrand("abz");
		s1.setsize("Large");
		s1.calprice();
		s1.display();
		
		s2.calprice();
		s2.display();
		
	}
}