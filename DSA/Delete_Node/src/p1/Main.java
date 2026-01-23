package p1;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Delete list = new  Delete();
	        int choice;

	        do {
	            System.out.println("\n=== MENU ===");
	            System.out.println("1. Insert Node");
	            System.out.println("2. Delete First Node");
	            System.out.println("3. Delete Last Node");
	            System.out.println("4. Delete at Position");
	            System.out.println("5. Display List");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter data to insert: ");
	                    int data = sc.nextInt();
	                    list.insert(data);
	                    break;

	                case 2:
	                    list.deleteBeg();
	                    break;

	                case 3:
	                    list.DeleteEnd();
	                    break;

	                case 4:
	                    System.out.print("Enter position to delete: ");
	                    int pos = sc.nextInt();
	                    list.deletePos(pos);
	                    break;

	                case 5:
	                    list.display();
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 6);

	        sc.close();
	    }
	}
