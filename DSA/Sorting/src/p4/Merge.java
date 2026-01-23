package p4;

public class Merge{
	
	public static void main(String[] args) {
		int[] arr = {74,1,55,4};
		
		sort(arr,0,arr.length-1);
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void sort(int[] arr, int left, int right) {
		int mid ;
		if (left<right) {
			mid = left + (right-left)/2;
			
			sort(arr,left, mid);
			sort(arr,mid+1,right);
			
			Merge(arr,left,mid,right);
			
			
		}
		
		
	}

	private static void Merge(int[] arr, int left, int right, int mid) {
		int leftSize = mid - left+1;
		int rightSize = right -mid;
	
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		for(int i = 0;i<leftSize;i++) {
			leftArray[i]=arr[i];
		}
		for(int i = 0;i<leftSize;i++) {
			rightArray[i]=arr[i];
		}
		
		int leftctr=0;
		int rightctr = 0;
		int mergectr = left;
		
		while(leftctr < leftSize && rightctr < rightSize ) {
		   if(leftArray[leftctr]<=rightArray[rightctr]) {
			   arr[leftctr] = rightArray[leftctr];
			   leftctr++;
		   }
		   else {
			   arr[rightctr] = rightArray[rightctr];
			    rightctr++;
		   }
		   
		   mergectr++;
		}
		
		while(leftctr < leftSize) {
			 arr[leftctr] = rightArray[leftctr];
			   leftctr++; 
			   mergectr++;
		}
	   
		 while(rightctr < rightSize) {
			 arr[rightctr] = rightArray[rightctr];
			    rightctr++;
			    mergectr++;
		 }
		
	}
	
}


//
//public class Merge_Sort {
//
//	private Object Merge;
//	public static void main(String[] args) {
//		int []arr= {2,4,9,4,3,6};
//		
//		Merge_Sort s1=new Merge_Sort();
//		
//		s1.Merge(arr);
//		s1.Print(arr);
//		
//	}
//	public void Print(int[]arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+"");
//		}
//	}
//		private void Merge(int[] arr) {
//		// TODO Auto-generated method stub
//			Sort(arr,0,arr.length-1);
//		
//	}
//		public void Sort(int[] arr,int low,int high) {
//			if(low<=high) {
//				int divisionPos=divide(arr,low,high);
//				Sort(arr,low,divisionPos-1);
//				Sort(arr,divisionPos+1,high);
//			}
//		}
//		private int divide(int[] ref, int low, int high) {
//			int pivot=ref[high];
//			int first=low-1;
//			for(int sec=low;sec<high;sec++) {
//				if(ref[sec]<=pivot) {
//					first++;
//					int temp=ref[first];
//					ref[first]=ref[sec];
//					ref[sec]=temp;
//				}
//			return 0;
//		}
//			return first;
//		
//		
//		}
//}
//	
//
