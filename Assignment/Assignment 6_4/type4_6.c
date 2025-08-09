#include<stdio.h>
int voting(int);
void main() {
	int age;
	printf("enter the age\n");
	scanf("%d",&age);
	int a=voting(age);
	if(a==1) {
		printf("eligible for voting");
	} else {
		printf("not eligible for voting");
	}

}
int voting(int age) {

	return age>=18;
}
