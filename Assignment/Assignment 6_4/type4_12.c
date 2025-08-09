#include<stdio.h>
int divide(int); //func declaration
void main() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int a=divide(n); // func call
	if(a==1) {
		printf("divisible by both");
	} else if(a==2) {
		printf("divisible by 3 but not 5");
	} else if(a==3) {
		printf("divisible by 5 but not 3");
	} else {
		printf("not divisible by both");
	}
}
int divide(int n) { //func definetion
	if(n%3==0&&n%5==0) {
		return 1;
	} else if(n/3==0||n/5==0) {
		return 2;
	} else if(n%3==0||n%5==0) {
		return 3;
	}

	else {
		return 4;
	}
}