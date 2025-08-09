#include<stdio.h>
int voting();

void main() {
	int a;
	a=voting();
	if(a==1) {
		printf("eligible for voting");
	} else {
		printf("not eligible for voting");
	}
}
int voting() {
	int age;
	printf("enter the age\n");
	scanf("%d",&age);
	if(age>=18) {
		return 1;
	} else {
		return 0;
	}
}