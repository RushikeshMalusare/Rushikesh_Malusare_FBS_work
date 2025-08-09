#include<stdio.h>
int palin();
void main(){
	int a;
	a=palin();
	if(a==1){
		printf("num is palindrom");
	}
	else{
		printf("num is not palindrom");
	}
}
    int palin(){
	int n=1001,rem;
	int m,rev=0;
	 m=n;
	 while(n>0){
	 	rem=n%10;
		rev=rev*10+rem;
		n=n/10;
   }
		if(rev==m){
			return 1;
		}
		else{
		    return 2; 
		}
	}

	