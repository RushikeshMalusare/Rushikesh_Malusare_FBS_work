package p1;

public abstract class Emp {
	 int id;
	 String name;
	 double sal;
	      //fucnction override;
	public Emp(){
		this.id=0;
		this.name="not given";
		this.sal=70372.0;
	}
	public Emp(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public abstract double Calsal();
	
	
	
//	public String toString(){
//		
//		return "emp id is: "+this.id+
//				"emp name is: "+this.name+
//				"sal is"+this.sal;
//	}
	public void displayAll() {
		System.out.println("emp id is: "+this.id+
		"emp name is: "+this.name+
		"sal is"+this.sal);
	
	}
	
	
}



