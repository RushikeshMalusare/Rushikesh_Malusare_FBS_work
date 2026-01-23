package p4;

public class quickSort {
	
	public static void main(String[] args) {
		
	int [] arr= {9,3,2,6,1,4,8};
	
	quickSort q1=new quickSort();
	q1.quick(arr);
	q1.print(arr);
	
	}

	public void print(int []arr) {
		for(int i=0;i<arr.length ;i++) {
		System.out.println(arr[i]+"");
		}		
	}

	public void quick(int[] ref) {
		sort(ref,0,ref.length-1);

	}
	public void sort(int[] arr,int low,int high) {
		if(low<=high) {
			int divisionPos=divide(arr,low,high);
			sort(arr,low,divisionPos-1);
			sort(arr,divisionPos+1,high);
		}
	}
	public int divide(int[] ref,int low,int high) {
		int pivot=ref[high];
		int first=low-1;
		for(int sec=low;sec<high;sec++) {
			if(ref[sec]<=pivot) {
				first++;
				int temp=ref[first];
				ref[first]=ref[sec];
				ref[sec]=temp;
			}
		}
		int temp=ref[first+1];
		ref[first+1]=ref[high];
		ref[high]=temp;
		return first+1;
	}
}