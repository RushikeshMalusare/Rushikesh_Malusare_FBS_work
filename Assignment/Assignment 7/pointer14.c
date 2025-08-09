#include<stdio.h>
int prime(int*,int*);
void main() {
	int n=17;
	int i=2;
	int f=0;
	while(i<=n/2) {
		if(n%i==0) {
			f=1;
			break;
		}
		i++;
	}
	int a=prime(&f,&n);
	if(a==1) {
		printf("num is prime",n);
	} else {
		printf("num is not prime",n);
	}
}
int prime(int* f,int* n) {
	if(*f==0) {
		return 1;
	} else {
		return 2;
	}
}