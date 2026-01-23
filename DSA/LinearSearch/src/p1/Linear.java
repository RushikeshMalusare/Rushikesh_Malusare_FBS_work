package p1;
public class Linear {
	public static void main(String[] args) {
		int []arr= {10,2,3,4,8,5,1};
		int target=8;
		Lin(arr,target);
		
	}
	public static void Lin(int []arr,int target)
	{
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println(i);
			}
		}

	}

}
