#include<stdio.h>
int perfect();
void main() {
	int a;
	a=perfect();
	if(a==1) {
		printf("number is perfect");
	} else {
		printf("number is not perfect");
	}
}
int perfect() {
	int n=25,i=1,sum=0;
	while(i<n) {
		if(n%i==0) {
			sum=sum+i;
		}
		i++;
	}
	if(sum==n) {
		return 1;
	} else {
		return 2;
	}
}