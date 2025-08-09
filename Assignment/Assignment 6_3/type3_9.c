#include<stdio.h>
void triangle(int,int,int);
void main() {
	int equ,iso,sca;
	printf("enter the number");
	scanf("%d",&equ);
	printf("enter the number");
	scanf("%d",&iso);
	printf("enter the number");
	scanf("%d",&sca);
	triangle(equ,iso,sca);
}
void triangle(int equ,int iso,int sca) {
	if(equ==iso && iso==sca) {
		printf("it is a equilateral");
	} else if(equ==iso||iso==sca||equ==sca) {
		printf("it is isosceles");
	} else {
		printf("it is scalene");
	}

}