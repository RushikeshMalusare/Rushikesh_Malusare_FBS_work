class Demo
{
 	void disStudent(Student s)
	{
		if(m > 80)
		{
			System.out.println("Approve 2Lack loan");
		}
		else if(m > 60 && m < 80)
		{
			System.out.println("Approve 1Lack loan");
		}
		else if(m > 40 && m < 60)
		{
			System.out.println("Approve 50K loan");
		}
		else
		{
			System.out.println("No Loan Approve");		
		}
	

		//System.out.println("Student Rollno is "+rollno);
		//System.out.println("Student Name is "+name);
		//System.out.println("Student Mark is"+mark);
	}

	void disEmployee(Employee e)
	{
		if(e > 1200000)
		{
			System.out.println("Approve 7Lack loan");
		}
		else if(e > 1000000 && e < 12)
		{
			System.out.println("Approve 6Lack loan");
		}
		else if(e > 6 && e < 10)
		{
			System.out.println("Approve 5Lack loan");
		}
		else if(e > 4 && e < 6)
		{
			System.out.println("Approve 4Lack loan");
		}
		else
		{
			System.out.println("No Loan Approve");		
		}
		//System.out.println("Employee id is "+id);
		//System.out.println("Employee Name is "+name);
		//System.out.println("Employee Annual Salary is"+annualSal);
	}
}//class end here

class Student{
	int id;
	String name;
	Double mark;
	Student(){ //default constructor
		this.id=02;
		this.name="asd";
		this.mark=32.2;
		
	}
	Student(int id,double mark,String name){ //parameter constructor
		this.id=id;
		this.mark=mark;
		this.name=name;
	}
	//Setter
	void setId(int i){
		this.id=i;
	}
	void setName(String n){
		this.name=n;
	}
	void setMark(double m){
		this.mark=m;
	}
	//Getter
	int getId(){
		return this.id;
	}
	String getName(){
		return this.name;
	}
	double getMark(){
		return this.mark;
	}
	void display(){
		System.out.println("Student Rollno is "+id);
		System.out.println("Student Name is "+name);
		System.out.println("Student Mark is"+mark);
	}	
		
	
}//class student end

class Employee{
	int id;
	String name;
	Double annualSal;
	Employee(){     //default constructor
		this.id=11;
		this.name="yash";
		this.annualSal=76.87;
		
	}
	Employee(int id,double annualSal,String name){   //parameter constructor
		this.id=id;
		this.annualSal=annualSal;
		this.name=name;
	}
	//Setter
	void setId(int eid){
		this.id=eid;
	}
	void setName(String nm){
		this.name=nm;
	}
	void setMark(double sal){
		this.annualSal=sal;
	}
	//Getter
	int getId(){
		return this.id;
	}
	String getName(){
		return this.name;
	}
	double getMark(){
		return this.annualSal;
	}
	void display(){
		System.out.println("Employee id is "+id);
		System.out.println("Employee Name is "+name);
		System.out.println("Employee Annual Salary is"+annualSal);
	}
}//class emp end here
class Test
{
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		Student s1=new Student(101,"yash",81.34);
		s1.display();
		d1.disStudent(s1);
		Employee e1=new Employee(1,"Amol",1200000.45);
		e1.display();
		d1.disEmployee(e1);		
	}
}








