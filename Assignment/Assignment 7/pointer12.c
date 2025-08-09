#include<stdio.h>
int student(int*,char*);
int main() {
	int a;
	char ch;
	int temp=0;
	printf("enter the price ");
	scanf("%d",&a);
	printf("you are student");
	fflush(stdin);
	scanf("%c",&ch);
	temp=a;
	int x=student(&a,&ch);
	if(x==1) {
		printf("final price with discount is  %d",temp=temp-temp*0.20);
	} else if(x==2) {
		printf("final price with discount is%d",temp=temp-temp*0.15);
	} else if(x==3) {
		printf("final price with discount is%d",temp=temp-temp*0.10);
	} else {
		printf("not discount%d",temp);
	}
}
int student(int* a,char* ch) {
	//int temp=a;
	if(*a>=500) {
		if(*ch==*ch) {

			return 1;//printf("final price with discount is  %d",temp=temp-temp*0.20);
		} else if(*a>600) {
			return 2;//printf("final price with discount is%d",temp=temp-temp*0.15);
		} else {
			return 3;//printf("final price with discount is%d",temp=temp-temp*0.10);
		}
	} else {
		return 4;//printf("not discount%d",temp);
	}

}
