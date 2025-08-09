#include<stdio.h>
int leapyear();
void main() {
	int x;
	x=leapyear();
	if(x==1) {
		printf("leap year");
	} else {
		printf("not leap year");
	}
}
int leapyear() {

	int year;
	printf("enter the year");
	scanf("%d",&year);
	if(year%4==0&&year%100!=0||year%400==0) {
		return 1;
		return 0;
	}
}