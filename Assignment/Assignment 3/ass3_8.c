void main(){
	int n=124,fact=1,rem;
	int a,res=0;
	int i;
	a=n;
	while(a!=0){
		rem=a%10;
		for(i=1;i<=rem;i++){
			fact=fact*i;
		}
		res=res+fact;
		fact=1;
		a=a/10;
	}
	 if(res==n){
	 	printf("num is strong",n);
	 }
	    else{
	    	printf("num is not strong",n);
	 }
}