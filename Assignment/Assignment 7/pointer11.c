#include<stdio.h>
int mark(int*);
void main() {
	int num;
	printf("enter total marks");
	scanf("%d",&num);
	int a=mark(&num);
	if(a==1) {
		printf("Distinction");
	} else if(a==2) {
		printf("Firt Class");
	} else if(a==3) {
		printf("Second Class");
	} else if(a==4) {
		printf("Pass Class");
	} else {
		printf("Failed");
	}
}
int mark(int* num) {
	if(*num>=75) {
		return 1;
	} else if(*num>=65) {
		return 2;
	} else if(*num>=55) {
		return 3;
	} else if(*num>=40) {
		return 4;
	} else {
		return 5;
	}
}