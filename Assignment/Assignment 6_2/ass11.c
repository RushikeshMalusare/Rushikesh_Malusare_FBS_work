#include<stdio.h>
int prime();
void main() {
	int a;
	a=prime();
	if(a==1) {
		printf("number is prime");
	} else {
		printf("number is not prime");
	}
}
int prime() {
	int n=13;
	int i=2;
	int f=0;
	while(i<=n/2) {
		if(n%i==0) {
			f=1;
			break;
		}
		i++;
	}
	if(f==0) {
		return 1;
	} else {
		return 2;
	}
}