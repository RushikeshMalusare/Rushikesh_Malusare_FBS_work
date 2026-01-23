class Employee{
	int id;
	String empName;
	double sal;
	Employee() {
		this.id=11;
		this.empName="not given";
		this.sal=2390;
	}
	Employee(int id, String emp_name, double sal) {
//parameter constructor
		this.id = id;
		this.empName = emp_name;
		this.sal = sal;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getEmpName() {
		return empName;
	}
	void setEmpName(String empName) {
		this.empName = empName;
	}
	double getSal() {
		return sal;
	}
	void setSal(double sal) {
		this.sal = sal;
	}
	void display() {
		System.out.println("Id "+this.id);
		System.out.println("Name "+this.empName);
		System.out.println("Salary "+this.sal);
	}
	
}
class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
	}

}
