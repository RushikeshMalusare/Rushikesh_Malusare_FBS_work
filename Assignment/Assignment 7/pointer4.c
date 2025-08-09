#include<stdio.h>
int palindrom(int*);  //func declaration
void main() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int a=palindrom(&n);  //func call
	if(a==1) {
		printf("number is palindrom");
	} else {
		printf("number is not palindrom");
	}

}
int palindrom(int* n) { // func definetion
	int rev=0,rem;
	int m=*n;
	while(*n!=0) {
		rem=*n%10;
		rev=rev*10+rem;
		*n=*n/10;
	}
	return rev==m;

}
