#include<stdio.h>
int age(int*);
void main() {
	int ag;
	printf("enter the age\n");
	scanf("%d",&ag);
	int a=age(&ag);
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
int age(int* ag) {
	if(*ag<12) {
		return 1;
	} else if(*ag>=12&&*ag<=19) {
		return 2;
	} else if(*ag==20||*ag<=59) {
		return 3;
	}


	else {
		return 4;//printf("Senior");
	}
}