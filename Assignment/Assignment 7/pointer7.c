#include<stdio.h>
int age(int*);
void main() {
	int ag;
	printf("enter the age\n");
	scanf("%d",&ag);
	int a=age(&ag);
	if(a==1) {
		printf("eligible for voting");
	} else {
		printf("not eligible for voting");
	}
}
int age(int* ag) {
	return *ag>=18;

}