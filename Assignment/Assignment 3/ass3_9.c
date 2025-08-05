void main(){
	int n=121,rem;
	int m,rev=0;
	 m=n;
	 while(n>0){
	 	rem=n%10;
		rev=rev*10+rem;
		n=n/10;
   }
		if(rev==m){
			printf("number is palindrom",m);
		}
		else{
			printf("number is not palindrom",m);
		}
	}

	