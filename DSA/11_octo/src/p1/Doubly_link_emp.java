package p1;

public class Doubly_link_emp {
	
	Emp start;
	
	public void addEmp(int id,String name,double salary) {
		Emp e1=new Emp(id,name,salary);
		if(start==null) {
			start=e1;
			return;
		}
		Emp temp=start;
		while(temp.next!=null) {
			 
			temp = temp.next;
		 }
		   temp.next = e1;
		    }
	
	public void deleteEmp(int id) {
	 if (start == null) {
	        System.out.println("List is empty!");
	           return;
	      }

	  if (start.id == id) {
	        System.out.println("Deleted employee: " + start.name);
	         start = start.next;
	      return;
	      }
	  Emp temp = start;
      while (temp.next != null && temp.next.id != id) {
          temp = temp.next;
      }

      if (temp.next == null) {
          System.out.println("Employee with ID " + id + " not found!");
          return;
      }

      System.out.println("Deleted employee: " + temp.next.name);
      	temp.next = temp.next.next;
  }
	void display() {
        if (start == null) {
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\n--- Employee List ---");
        Emp temp = start;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }
}
	
	
	
		
	
	
  


