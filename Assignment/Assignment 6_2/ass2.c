#include<stdio.h>
int evenodd();
void main() {
	int x;
	x=evenodd();
	if(x==1) {
		printf("even");
	} else {
		printf("odd");
	}

}
int evenodd() {

	int n;
	printf("enter the number");
	scanf("%d",&n);
	if(n%2==0) {
		return 1;
	} else {
		return 0;
	}
}