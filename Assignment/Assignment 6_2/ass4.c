#include<stdio.h>
int palindrom();

void main() {
	int a;
	a=palindrom();
	if(a==1) {
		printf("number is palindrom");
	} else {
		printf("number is not palindrom");
	}
}

int palindrom() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int m,rev=0,rem;
	m=n;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==m) {
		return 1;
	} else {
		return 0;
	}
}

