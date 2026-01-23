package p3;

public class Insertion_Sort {

	public static void main(String[] args) {				
	int arr[]={3,5,7,3,2,1};
						
		for(int i=1;i<arr.length;i++) {
			int flag=arr[i];
			int dem;
			
		for(int j=i-1;j<arr.length-1;j--) {
		if(arr[flag]<arr[j]) {
				flag=j;
			}
		
		int temp=arr[flag];
		arr[flag]=arr[j+1];
		arr[j+1]=flag;
		}
		printArray(arr);
	}
				
	}
			
			public static void printArray(int arr[]) {
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
			}
				
				
	}
//package p3;
//
//public class Insertion_Sort {
//
//    public static void main(String[] args) {
//        int arr[] = {3, 5, 7, 3, 2, 1};
//
//        insertionSort(arr);
//        printArray(arr);
//    }
//
//    public static void insertionSort(int arr[]) {
//
//        for (int i = 1; i < arr.length; i++) {
//
//            int key = arr[i];     // the element to insert
//            int j = i - 1;
//
//            // shift elements greater than key to the right
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//
//            arr[j + 1] = key;     // insert key at correct position
//        }
//    }
//
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}



