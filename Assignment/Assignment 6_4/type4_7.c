#include<stdio.h>
int calculate(int);
void main() {
	int a,b,value;
	printf("enter first num\n");
	scanf("%d",&a);
	printf("enter second num\n");
	scanf("%d",&b);
	printf("enter value");
	scanf("%d",&value);
	int x=calculate(value);
	if(x==1) {
		printf("sum is%d\n",a+b);
	} else if(x==2) {
		printf("subs is%d\n",a-b);
	} else if(x==3) {
		printf("multi is%d\n",a*b);
	} else if(x==4) {
		printf("div is%d\n",a/b);
	} else if(x==5) {
		printf("Mod is%d\n",a%b);
	}
}
int calculate(int value) {

	if(value==1) {
		return 1;
	} else if(value==2) {
		return 2;
	} else if(value==3) {
		return 3;
	} else if(value==4) {
		return 4;
	} else if(value==5) {
		return 5;
	} else {
		printf("number is not detect");
	}
}