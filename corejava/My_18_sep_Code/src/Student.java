class Student
{
	int fbs;
	String name;
	double dis_travelled;
	static int count;
	static {
		count=0;
	}
	Student(){	
		this.fbs=0;
		this.name="";
		this.dis_travelled=0.0;
		count ++;
	}
	Student(int fbs,String name,double dis_travelled){
		this.fbs=fbs;
		this.name=name;
		this.dis_travelled=dis_travelled;
		count++;
	}	
	void setFbs(int f){
		this.fbs=f;
	}
	void setName(String nm){
		this.name=nm;
	}
	void setDis(double d){
		this.dis_travelled=d;
	}
	int getFbs(){
		return this.fbs;
	}
	String getName(){
		return this.name;
	}
	double getDis(){
		return this.dis_travelled;
	}
	static int getcount(){
		return count;
	}
	void display(){
		System.out.println("Student Fbs "+this.fbs);
		System.out.println("Student Name "+this.name);
		System.out.println("Student Distance Travelled "+this.dis_travelled);
		
	}
}//class end here


class PlaceStudent extends Student{
	
	String c_name;
	String desgn;
	PlaceStudent() {
		super();
		this.c_name = "not given";
		this.desgn = "not given";
		
	}
	PlaceStudent(String c_name, String desgn) {
		
		//super(fbs,name,dis_travelled);
		this.c_name = c_name;
		this.desgn = desgn;
	}
	String getC_name() {
		return c_name;
	}
	void setC_name(String c_name) {
		this.c_name = c_name;
	}
	String getDesgn() {
		return desgn;
	}
	void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	void display() {
//		System.out.println("Id is "+this.fbs);
//		System.out.println("Name is "+this.name);
//		System.out.println("Distance Travelled "+this.dis_travelled);
		System.out.println("Company Name"+this.c_name);
		System.out.println("Designation"+this.desgn);
	}
	
}
class Student1
{
	public static void main(String[] a)
	{
		Student s1=new Student(121,"yash",12);
		s1.display();
		Student s2=new Student(111,"xyz",10);
		s2.display();
		Student.getcount();
	}
}






