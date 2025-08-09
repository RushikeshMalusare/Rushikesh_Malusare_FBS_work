#include<stdio.h>
int triangle();
void main() {

	int a;
	a=triangle();
	if(a==0) {
		printf("equilateral");
	} else if(a==1) {
		printf("isosceles");
	}

	else {
		printf("scalen");
	}

}
int triangle() {
	int equ,iso,sca;
	printf("enter the number");
	scanf("%d",&equ);
	printf("enter the number");
	scanf("%d",&iso);
	printf("enter the number");
	scanf("%d",&sca);
	if(equ==iso && iso==sca) {
		return 0;

	} else if(equ==iso||iso==sca||equ==sca) {
		return 1;
	} else {
		return 2;

	}

}