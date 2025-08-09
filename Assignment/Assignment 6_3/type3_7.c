#include<stdio.h>
void age(int);
void main() {
	int ag;
	printf("enter the age\n");
	scanf("%d",&ag);
	age(ag);
}
void age(int ag) {
	if(ag>=18) {
		printf("eligible for voting");
	} else {
		printf("not eligible for voting");
	}
}