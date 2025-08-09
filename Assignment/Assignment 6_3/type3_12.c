#include<stdio.h>
void student(int,char);
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
	student(a,'y');
}
void student(int a,char ch) {
	int temp=a;
	if(a>=500) {
		if(ch=='y') {
			printf("final price with discount is  %d",temp=temp-temp*0.20);
		} else if(a>600) {
			printf("final price with discount is%d",temp=temp-temp*0.15);
		} else {
			printf("final price with discount is%d",temp=temp-temp*0.10);
		}
	} else {
		printf("not discount%d",temp);
	}
	return 0;
}
