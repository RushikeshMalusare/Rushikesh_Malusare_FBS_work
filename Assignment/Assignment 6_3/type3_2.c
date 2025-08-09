#include<stdio.h>
void evenodd(int);
void main() {
	int a;
	printf("enter the number");
	scanf("%d",&a);
	evenodd(a);
}
void evenodd(int a) {
	if(a%2==0) {
		printf("num is even",a);

	} else {
		printf("num is odd",a);

	}
}