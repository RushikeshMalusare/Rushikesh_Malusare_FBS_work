#include<stdio.h>
int main(){
	int i=1,n,fact=1,rem;
	int a,res=0;
	a=n;
	printf("enter upper number");
	scanf("%d",&n);
	
		for(i=1;i<=n;i++){
			fact=fact*i;
		rem=n%10;
		res=res+fact;
		fact=1;
		
        while(n!=0){
		
	 if(res==n){
	 	printf("%d",n);
   }
}
return 0;
}
}