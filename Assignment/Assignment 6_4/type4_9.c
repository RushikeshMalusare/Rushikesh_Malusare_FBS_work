#include<stdio.h>
int greater(int,int,int);   //func declaration
void main() {
	int a,b,c;
	printf("enter first num\n");
	scanf("%d",&a);
	printf("enter second num\n");
	scanf("%d",&b);
	printf("enter third num\n");
	scanf("%d",&c);
	int x=greater(a,b,c);  //func call
	if(x==1) {
		printf("a is greater");
	} else if(x==2) {
		printf("c is greater");
	} else if(x==3) {
		printf("b is greater");
	} else {
		printf("c is greater");
	}
}
int greater (int a,int b,int c) { //func definetion
	if(a>b) {
		if(a>c) {
			return 1;
		} else {
			return 2;
		}
	} else {
		if(b>c) {
			return 3;
		} else {
			return 4;
		}
	}
}

