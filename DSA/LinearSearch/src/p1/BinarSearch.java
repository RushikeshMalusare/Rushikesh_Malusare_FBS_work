package p1;

public class BinarSearch {
	public static void main(String[] args) {
		
	int []arr= {12,43,54,65,78};
	int target=6;
	int temp=binarySearch(arr,target);
			if(temp==-1) {
				System.out.println("Not Found");
	
			}
			else {
		
				System.out.println(temp);
			}
				
			}

	private static int binarySearch(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		
		for(int i=0;i<=arr.length-1;i++) {
			int mid=left+(right-left)/2;
			if(target==arr[mid]) {
				return mid ;
			}
			else if(target<arr[mid]) {
				right=mid-1;
				//return i;
			}
			else if(target>arr[mid]){
				left=mid+1;
			}
		}

		return -1; 
		
	}
}

	
		
		
		
	
