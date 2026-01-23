package p2;

public class Selection_sort {
	public static void main(String[] arg) {
		
		int arr[]={3,5,7,3,2,1};

		for(int i=0;i<=arr.length-1;i++) {
			int flag=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[flag]>arr[j]) {
					flag=j;
				}
			
			int temp=arr[flag];
			arr[flag]=arr[i];
			arr[i]=temp; 
			
			
		}
		}
		printArray(arr);
		
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
	
