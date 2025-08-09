#include<stdio.h>
void palindrom(int);  //func declaration
void main() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	palindrom(n);  //func call


}
void palindrom(int n) { // func definetion
	int m,rev=0,rem;
	m=n;
	while(n!=0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==m) {
		printf("number is palindrom");
	} else {
		printf("number is not palindrom");
	}
}
