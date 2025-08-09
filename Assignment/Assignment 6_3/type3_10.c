#include<stdio.h>
void greater(int,int,int);
void main() {
	int a,b,c;
	printf("enter first num\n");
	scanf("%d",&a);
	printf("enter second num\n");
	scanf("%d",&b);
	printf("enter third num\n");
	scanf("%d",&c);
	greater(a,b,c);
}
void greater(int a,int b,int c) {
	if(a>b) {
		if(a>c) {
			printf("a is greater");
		} else {
			printf("c is greater");
		}
	} else {
		if(b>c) {
			printf("b is greater");
		} else {
			printf("c is greater");
		}
	}
}

