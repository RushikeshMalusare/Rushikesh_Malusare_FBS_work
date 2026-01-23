package p1;

public class demo{
	
	public static void main(String[] args) {
		
	String arr[]= {"yash","apple","raj","bat","zero"};
		
		
		bubbleSort(arr);
		printArray(arr);
	
	}
	public static void printArray(String[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		 System.out.println();
	}


	public static void bubbleSort(String[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	
	}
}
		
		
	






//import java.util.Scanner;
//
//public class Bubble_sort {
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int size;
//		System.out.println("Enter Size of array");
//		size=sc.nextInt();
//		//int arr[];
//		//int []brr;
//		int []crr=new int [size]; //first class obj
//		System.out.println("Enter "+size+"ele");
//		for(int i=0;i<crr.length;i++) {
//			System.out.println("crr ["+i+"]");
//			crr[i]=sc.nextInt();
//			}
//		System.out.println("Original Array");
//		for(int i=0;i<crr.length;i++) {
//			System.out.println("\t"+crr[i]);
//		}
//		System.out.println();
//		bubbleSort(crr,size);
//		System.out.println("After Sorting "+crr);
//		for(int i=0;i<size;i++) {
//			System.out.println(crr[i]+" " );
//		}
//		
//	
//	public static void bubbleSort(int []crr) {
//		for(int i=0;i<crr.length;i++) {
//			for(int j=0;j<crr.length-1-i;j++) {
//				
//				if( crr [j]>crr [j+1]) {
//				int temp=crr[j];
//				crr[j]=crr[j+1];
//				crr[j+1]=temp;
//				
//			}
//		}
//	}
//}
	
