#include<stdio.h>
int leap(int*); //func declaratiom
void main() {
	int year;
	printf("enter the year");
	scanf("%d",&year);
	int a=leap(&year);  //func call
	if(a==1) {
		printf("year is leap",year);
	} else {
		printf("year is not leap",year);
	}
}

int leap(int* year) { //func definetion
	return *year%4==0&&*year%100!=0||*year%400==0;

}