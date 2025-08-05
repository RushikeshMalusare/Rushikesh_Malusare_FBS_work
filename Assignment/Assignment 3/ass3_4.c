void main(){
	int n=13;
	int i=2;
	int f=0;
	while(i<=n/2){
		if(n%i==0){
			f=1;
			  break;
		}
		 i++;
	}
	if(f==0){
		printf("num is prime%d",n);
	}
	else{
		printf("num is not prime%d",n);
	}
}