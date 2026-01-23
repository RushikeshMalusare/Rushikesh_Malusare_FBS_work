package p1;
import java.util.Scanner;

public class mainf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mylink list = new mylink();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert at position");
            System.out.println("2. Display list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int ele = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.addPos(ele, pos);
                    break;

                case 2:
                    System.out.println("Linked List elements are:");
                    list.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}


//package p1;
//
//public class mainf {
//	    public static void main(String[] args) {
//
//	        mylink list = new mylink();
//
//	        list.addPos(10, 1);
//	        list.addPos(20, 2);
//	        list.addPos(30, 3);
//	        list.addPos(40, 4);
//
//	        System.out.println("Before insert:");
//	        list.display();
//	        
//	        list.addPos(25, 4);
//
//	        System.out.println("After insert:");
//	        list.display();
//	    }
//	}
//  
