class Shape
{

	void calArea(Triangle t)
	{
		double area;
		area=0.5*t.getBase()*t.getHeight();
		System.out.println("Triangle area is"+area);	
	}
	void calArea(Rectangle r)
	{
		double area;
		area=r.getLength()*r.getBreadth();
		System.out.println("Rectangle area is"+area);	
		
	}	
	void calArea(Circle c)
	{
		double area;
		area=3.14*(c.getRadius() * c.getRadius());
		System.out.println("Circle is "+area);
	}
}//class end here

class Triangle{
	double base;
	double height;
	Triangle(){
		this.base=0;
		this.height=0;
	}
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	//setters
	void setBase(double b){
		this.base=b;
	}
	void setHeight(double h){
		this.height=h;
	}
	
	//getter
	double getBase(){
		return this.base;
	}
	double getHeight(){
		return this.height;
	}
	void display(){
		System.out.println("Base"+this.base);
		System.out.println("Base"+this.height);
	}
}//class triangle end
class Circle{
	double radius;
	Circle(){
		this.radius=3;
	}
	Circle(double r){
		this.radius=r;
	}
	void setRadius(double r){
		 this.radius=r;
	}
	double getRadius(){
		 return this.radius;
	}
	void display(){
		System.out.println("Radius"+this.radius);
	}
}//class circle end
class Rectangle{
	double len;
	double bre;
	Rectangle(){
		this.len=1;
		this.bre=1;
	}
	Rectangle(double l,double b){
		this.len=l;
		 this.bre=b;
	}
	void setLength(double l){
		this.len=l;
	}
	void setBreadth(double b){
		this.bre=b;
	}
	double getLength(){
		return this.len;
	}
	double getBreadth(){
		return this.bre;
	}
	void display(){
		System.out.println("Length"+this.len);
		System.out.println("Breadth"+this.bre);
	}
}//class rectangle end
class Test
{
	public static void main(String[] args)
	{
	
		
		Shape s1=new Shape();
		Triangle t1=new Triangle(5,2);
		t1.display();
		s1.calArea(t1);
		Circle c1=new Circle(5);
		c1.display();
		s1.calArea(c1);
		Rectangle r1=new Rectangle(5,3);
		r1.display();
		s1.calArea(r1);
		
	}
}//class test end here