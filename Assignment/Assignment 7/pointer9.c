#include<stdio.h>
int triangle(int*,int*,int*);
void main() {
	int equ,iso,sca;
	printf("enter the number");
	scanf("%d",&equ);
	printf("enter the number");
	scanf("%d",&iso);
	printf("enter the number");
	scanf("%d",&sca);
	int a=triangle(&equ,&iso,&sca);
	if(a==1) {
		printf("it is a equilateral");
	} else if(a==2) {
		printf("it is isosceles");
	} else {
		printf("it is scalene");
	}
}
int triangle(int* equ,int* iso,int* sca) {
	if(*equ==*iso && *iso==*sca) {
		return 1;
	} else if(*equ==*iso||*iso==*sca||*equ==*sca) {
		return 2;
	} else {
		return 3;
	}
}