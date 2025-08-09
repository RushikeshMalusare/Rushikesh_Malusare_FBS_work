#include<stdio.h>
int evenodd(int*);
void main() {
	int a;
	printf("enter the number");
	scanf("%d",&a);
	int x=evenodd(&a);
	if(x==1) {
		printf("num is even",a);
	} else {
		printf("num is odd",a);
	}
}
int evenodd(int* a) {
	return *a%2==0;

}