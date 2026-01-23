
package p3;
import java.util.ArrayList;
import java.util.Scanner;
import p4.EmpDao;

import p1.Emp;
import p2.Admin;
import p2.HR;
import p2.SaleManager;

public class Test {
		public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		         EmpDao dao = new EmpDao();
		         ArrayList<Emp> employees=null;

		         int choice;
		         do {
		             System.out.println("\n Employee Management Menu ");
		             System.out.println("1. Add Employee");
		             System.out.println("2. Search Employee");
		             System.out.println("3. Update Employee");
		             System.out.println("4. Delete Employee");
		             System.out.println("5. Display All Employees");
		             System.out.println("6. Calculate Salary of Each Employee");
		             System.out.println("0. Exit");
		             System.out.print("Enter your choice: ");
		             choice = sc.nextInt();

		             switch (choice) {
		                 case 1:
		                     System.out.println("Enter Employee Type (1-HR, 2-Admin, 3-SalesManager): ");
		                     int type = sc.nextInt();

		                     System.out.print("Enter ID ");
		                     int id = sc.nextInt();
		                     sc.nextLine();
		                     System.out.print("Enter Name ");
		                     String name = sc.nextLine();
		                     System.out.print("Enter Salary ");
		                     double salary = sc.nextDouble();

		                     if (type == 1) {
		                         System.out.print("Enter Commission ");
		                         double comm = sc.nextDouble();
		                         dao.addEmployee(new HR(id, name, salary, comm));
		                         System.out.println("HR added successfully ");
		                     } else if (type == 2) {
		                         System.out.print("Enter Allowance ");
		                         double allowance = sc.nextDouble();
		                         dao.addEmployee(new Admin(id, name, salary, allowance));
		                         System.out.println("Admin added successfully ");
		                     } else if (type == 3) {
		                         System.out.print("Enter Target ");
		                         int target = sc.nextInt();
		                         System.out.print("Enter Incentive  ");
		                         double incentive = sc.nextDouble();
		                         dao.addEmployee(new SaleManager(id, name, salary, incentive,target));
		                         System.out.println("Sale Manager added successfully");
		                     } else {
		                         System.out.println("Invalid Type!");
		                     }
		                     break;

		                 case 2:   	
		                     System.out.print("Enter ID to search ");
		                     id = sc.nextInt();
		                    
		                     Emp e = dao.searchEmployeeById(id);
		                   
		                     while (e == null) {
		                         System.out.println("Employee not found. Please re-enter a valid ID:");
		                         id = sc.nextInt();
		                         e = dao.searchEmployeeById(id);
		                         System.out.println("enter 0 exit");
		                         if(id==0) {
		                         	break;
		                         }
		                     }
		                    

		 				System.out.println("Found: " + e);
		 				break;
		 				case 3:
		                     System.out.print("Enter ID to update: ");
		                     id = sc.nextInt();
		                     System.out.print("Enter New Salary: ");
		                     salary = sc.nextDouble();
		                     if (dao.updateEmployee(id, salary))
		                         System.out.println("Updated successfully!");
		                     else
		                         System.out.println(" not found.");
		                     break;

		                 case 4:
		                     System.out.print("Enter ID to delete: ");
		                     id = sc.nextInt();
		                     if (dao.deleteEmployee(id))
		                         System.out.println("Deleted successfully!");
		                     else
		                         System.out.println("Employee not found.");
		                     break;

		                 case 5:
		                        dao.displayAll();
		                     if (employees.isEmpty()) {
		                         System.out.println("No employees found.");
		                     } else {
		                         System.out.println("\n Employee List ");
		                         for (Emp emp : employees) {
		                             System.out.println(emp);
		                         }
		                     }
		                     break;
		                     
		                 case 6:
		                     employees = dao.getAllEmp();
		                     if (employees.isEmpty()) {
		                         System.out.println("No employees ");
		                     } else {
		                         System.out.println("\n Salary Calculation ");
		                         for (Emp emp : employees) {
		                             System.out.println(emp.getName() + " Total Salary: " + emp.Calsal());
		                         }
		                     }
		                     break;


		                 case 0:
		                     System.out.println("Exiting ");
		                     break;

		                 default:
		                     System.out.println("Invalid choice ");
		             }
		         } while (choice != 0);

		         sc.close();
		     }
		 }

//	