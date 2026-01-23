 package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Doubly_linkedList dd1 =new Doubly_linkedList();
		int choice;
		int ele;
		do {
			System.out.println("\t1.Insert Begining");
			System.out.println("\t2.Insert Last");
			System.out.println("\t3.Display Forword");
			System.out.println("\t5.Exit");
			System.out.println("Enter Your choice\n");
			choice=sc.nextInt();
			
			switch(choice) {		//not allow double int string enum
			case 1:{
				System.out.println("Enter the Data ");
				ele=sc.nextInt();
				dd1.insertBegi(ele);
				break; 
			}
			case 2:{
				System.out.println("enter data");
				ele=sc.nextInt();
				dd1.insertBegi(ele);
				break; 
				
		
			}
			case 3:{
				dd1.display();
				break;
			}
			default :{
				System.out.println("Invalid choice");
			}
			}
		}
		while(choice !=3) ;
			sc.close();
		}

	}


