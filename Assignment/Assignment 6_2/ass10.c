#include<stdio.h>
int marks();  //  func declaration
void main() {
	int a,num;
	a=marks();   //  func call
	if(a==1) {
		printf("distinction");
	} else if(a==2) {
		printf("first class");
	} else if(a==3) {
		printf("second class");
	} else if(a==4) {
		printf("pass class");
	} else {
		printf("failed");
	}
}
int marks() {   // func defination
	int num;
	printf("enter total marks");
	scanf("%d",&num);
	if(num>=75) {
		return 1;
	} else if(num>=65) {
		return 2;
	} else if(num>=55) {
		return 3;
	} else if(num>=40) {
		return 4;
	} else {
		return 5;
	}
}