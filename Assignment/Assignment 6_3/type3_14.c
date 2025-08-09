#include<stdio.h>
void age(int);
void main() {
	int ag;
	printf("enter the age\n");
	scanf("%d",&ag);
	age(ag);
}
void age(int ag) {
	if(ag<12) {
		printf("child");
	} else if(ag>=12&&ag<=19) {
		printf("Teenager");
	} else if(ag==20||ag<=59) {
		printf("Adult");
	}
	else {
		printf("Senior");
	}
}