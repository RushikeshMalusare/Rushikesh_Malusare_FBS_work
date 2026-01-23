package p1;

	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Doubly_link_emp list = new  Doubly_link_emp();
	        int choice;

	        do {
	            System.out.println("\n=== Employee Menu ===");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Delete Employee by ID");
	            System.out.println("3. Display All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Employee ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine(); 
	                    System.out.print("Enter Employee Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Salary: ");
	                    double salary = sc.nextDouble();
	                    list.addEmp(id, name, salary);
	                    break;

	                case 2:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int delId = sc.nextInt();
	                    list.deleteEmp(delId);
	                    break;

	                case 3:
	                    list.display();
	                    break;

	                case 4:
	                    System.out.println("Exiting program...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


