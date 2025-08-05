#include<stdio.h>
int main(){
	int n=153,rem,total=0,a;
	a=n;
		while(a>0){
			rem=a%10;
			total=total+rem*rem*rem;
			a=a/10;
         }
	      if(total==n){
	    	printf("number is armstrong ",n);
		}
		else{
			printf("not armstrong");
		}
  return 0;
}