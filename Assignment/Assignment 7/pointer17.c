#include<stdio.h>
int perf(int*,int*);// func declaration
void main() {
	int n=28,i=1,sum=0;
	while(i<n) {
		if(n%i==0) {
			sum=sum+i;
		}
		i++;

	}
	int a=perf(&sum,&n);// func call
	if(a==1) {
		printf("num is perfect");
	} else {
		printf("num is not perfect");
	}
}

int perf(int* sum,int* n) {  //func definetion

	if(*sum==*n) {
		return 1;
	} else {
		return 2;
	}
}