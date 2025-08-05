void main(){
	int n;
	printf("enter the number");
	scanf("%d",&n);
	if(n%3==0&&n%5==0){
		printf("divisible by both");
	   }
	   else if(n/3==0||n/5==0){
	   	 printf("divisible by 3 but not 5");
	   }
	      else if(n%3==0||n%5==0){
	   	     printf("divisible by 5 but not 3");
	   }

    else{
	  	printf("not divisible by both");
	  }
}