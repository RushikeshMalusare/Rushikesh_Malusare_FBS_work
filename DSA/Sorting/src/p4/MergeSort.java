package p4;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {9,8,2,3,5,1};
		
		divide(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
	}
	public static void divide(int[] ref,int low,int high) {
		if(low >=high) {
			return;
		}
			int mid=low+(high-low)/2;
			divide(ref,low,mid);
			divide(ref,mid+1,high);
			conqure(ref,low,mid,high);
		}
		
	
	public static void conqure(int[] arr,int low,int mid,int high) {
		int []merge =new int[high-low+1];
		int inx1=low;
		int indx2=mid+1;
		int temp=0;
		while(inx1<=mid&&indx2<=high) {
			if(arr[inx1]<=arr[indx2]) {
				merge[temp++]=arr[inx1++];
			}
			else {
				merge[temp++]=arr[indx2++];
				
			}
		
		while(inx1<=mid) {
			merge[temp++]=arr[inx1++];
			
		}
		while(indx2<=high) {
			merge[temp++]=arr[indx2++];
			
		}
		for (int i = 0, j = low; i < merge.length; i++, j++) {
		    arr[j] = merge[i];
		}
		}
		
	}
}


