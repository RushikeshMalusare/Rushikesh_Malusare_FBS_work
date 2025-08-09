#include<stdio.h>
void perf(int,int);// func declaration
void main() {
	int n=28,i=1,sum=0;
	while(i<n) {
		if(n%i==0) {
			sum=sum+i;
		}
		i++;

	}
	perf(sum,n);// func call
}
void perf(int sum,int n) {  //func definetion

	if(sum==n) {
		printf("num is perfect",n);
	} else {
		printf("num is not perfect",n);
	}
}