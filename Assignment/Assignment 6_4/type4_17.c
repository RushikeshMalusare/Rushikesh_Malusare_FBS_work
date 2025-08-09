#include<stdio.h>
int strong(int,int);
void main() {
	int n=145,fact=1,rem;
	int a,res=0;
	int i;
	a=n;
	while(a!=0) {
		rem=a%10;
		for(i=1; i<=rem; i++) {
			fact=fact*i;
		}
		res=res+fact;
		fact=1;
		a=a/10;
	}
	int x=strong(res,n);
	if(x==1) {
		printf("num is strong",n);
	} else {
		printf("num is not strong",n);
	}
}
int strong(int res,int n ) {
	return res==n;
}