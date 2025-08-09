#include<stdio.h>
void calculation(int,int,int);
void main() {
	int a,b,value;
	printf("enter first num\n");
	scanf("%d",&a);
	printf("enter second num\n");
	scanf("%d",&b);
	printf("enter value");
	scanf("%d",&value);
	calculation(value,a,b);
}
void calculation(int value,int a,int b ) {

	if(value==1) {
		printf("sum is%d",a+b);
	} else if(value==2) {
		printf("subs is%d",a-b);
	} else if(value==3) {
		printf("multi is%d\n",a*b);
	} else if(value==4) {
		printf("div is%d\n",a/b);
	} else if(value==5) {
		printf("Mod is%d\n",a%b);
	} else {
		printf("number is not detect");
	}
}