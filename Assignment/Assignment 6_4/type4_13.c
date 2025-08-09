#include<stdio.h>
int isage(int);
void main() {
	int age;
	printf("enter the age\n");
	scanf("%d",&age);
	int a=isage(age);
	if(a==1) {
		printf("child");
	} else if(a==2) {
		printf("Teenager");
	} else if(a==3) {
		printf("Adult");
	} else {
		printf("Senior");
	}
}
int isage(int age) {
	if(age<12) {
		return 1;
	} else if(age>=12&&age<=19) {
		return 2;
	} else if(age==20||age<=59) {
		return 3;
	}

    else {
		return 4;
	}
}