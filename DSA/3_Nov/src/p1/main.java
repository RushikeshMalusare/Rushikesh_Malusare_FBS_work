package p1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList my=new MyLinkedList ();
		Scanner sc=new Scanner(System.in);
		//Node n1=new Node(10);
		//insertion
//		my.add(10);
//		my.add(20);  //hard code 
//		my.add(30);
//		
		//display element
		//my.display();
		int choice;
		int data;
		do {
			System.out.println("\t1.Add");
			System.out.println("\t2.Display");
			System.out.println("\t3.Exit");
			System.out.println("Enter your choice :");
			choice=sc.nextInt();
			
		switch(choice)	{
		case 1:{
			int ch;
			System.out.println("Enter Data: ");
			data=sc.nextInt();
			do {
				System.out.println("\t1.Add first");
				System.out.println("\t2.Add position");
				System.out.println("\t3.Add last");
				System.out.println("\t4.go to main menu");
				System.out.println("Enter your choice");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1 :{
					my.addFirst(data);
					break;
						
					}
				case 2:{
					my.addPosition(data);
					break;
				}
				case 3:{
					my.addLast(data);
					break;
				}
				case 4:{
					break;
				}
				default:{
					System.out.println("Enter valid choice");
					break;
				}
				}
				System.out.println("do you continue ?");
				System.out.println("\t1.yes");
				System.out.println("\t2.go to main menu");
				ch=sc.nextInt();
			}
			while(ch == 1);
			my.addFirst(data);
			break;
			
			}
		case 2:{
			my.display();
			break;
		}
		case 3:{
			System.out.println("Existing");
			break;
		}
		default :{
			System.out.println("Enter valid choice");
			break;
		}
		}
	}
		while(true);
	}

}
