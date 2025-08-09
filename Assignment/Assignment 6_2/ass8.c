#include<stdio.h>
int operator();
void main() {
	int a,b;
	int x=operator();
	if(x==1) {
		printf("addition is%d",a+b);
	} else if(x==2) {
		printf("substraction%d\n");
	}
}
int operator() {

	int c,b,x,value,sum;
	printf("enter first num\n");
	scanf("%d",&c);
	printf("enter second num\n");
	scanf("%d",&b);
	printf("enter value");
	scanf("%d",&value);
	if(value==1) {
		
			return 1;//	printf("sum is%d\n",a+b);
	} else if(value==2) {
		return 2;//printf("subs is%d\n",a-b);
	} else if(value==3) {
		return 3;//	printf("multi is%d\n",a*b);
	} else if(value==4) {
		return 4;// printf("div is%d\n",a/b);
	} else if(value==5) {
		return 5;//	printf("Mod is%d\n",a%b);
	} else {
		printf("number is not detect");
	}
}