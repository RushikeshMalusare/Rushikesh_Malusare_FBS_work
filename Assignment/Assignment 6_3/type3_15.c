#include<stdio.h>
void prime(int,int);
void main() {
	int n=7;
	int i=2;
	int f=0;
	while(i<=n/2) {
		if(n%i==0) {
			f=1;
			break;
		}
		i++;
	}
	prime(f,n);
}
void prime(int f,int n) {
	if(f==0) {
		printf("num is prime",n);
	} else {
		printf("num is not prime",n);
	}
}