package p2;

public class sel {

	public static void main(String[] args) {
		int arr[]= {23,89,43,22,12};
		
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
			System.out.println(arr[i]+" ");
		}
	}
	

}
