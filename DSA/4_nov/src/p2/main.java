
package p2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        delete d1 = new delete();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert at position");
            System.out.println("2. Delete at position");
            System.out.println("3. Display list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    d1.addPos( pos);
                    break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    int delPos = sc.nextInt();
                    d1.deletePos(delPos);
                    break;

                case 3:
                    d1.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}


//package p2;
//
//public class main {
//	
//		    public static void main(String[] args) {
//
//		        delete d1 = new delete();
//
//		        d1.addPos(10, 1);
//		        d1.addPos(20, 2);
//		        d1.addPos(30, 3);
//		        d1.addPos(40, 4);
//
//		        
//		        d1.display();
//
//		        d1.addPos(4);
//		        
//		        d1.display();
//		    }
//		}
//	  
//

