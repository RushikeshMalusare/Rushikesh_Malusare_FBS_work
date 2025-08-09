#include<stdio.h>
int prime(int);
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
	int a=prime(f);
	if(a==1) {
		printf("num is prime%d",n);
	} else {
		printf("num is not prime%d",n);
	}

}
int prime(int f) {

	return f==0;

}
