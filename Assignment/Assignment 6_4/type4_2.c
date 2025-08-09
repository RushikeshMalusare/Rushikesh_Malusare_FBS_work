#include<stdio.h>
int evenodd(); //func declaration
void main() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int a=evenodd(n);  //func call
	if(a==1) {
		printf("num is even");
	} else {
		printf("num is odd");
	}
}
int evenodd(int n) { //func definetion
	int num=n;
	if(num%2==0) {
		return 1;
	} else {
		return 2;

	}
}