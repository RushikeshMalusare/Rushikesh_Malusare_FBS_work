#include<stdio.h>
int strong();
void main() {
	int a;
	a=strong();
	if(a==1) {
		printf("num is strong");
	} else {
		printf("num is not strong");
	}
}
int strong() {
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
	if(res==n) {
		return 1;
	} else {
		return 2;
	}
}