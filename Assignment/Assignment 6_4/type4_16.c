#include<stdio.h>
int perfect(int,int);
void main() {
	int n=28,i=1,sum=0;
	while(i<n) {
		if(n%i==0) {
			sum=sum+i;
		}
		i++;
	}
	int a=perfect(sum,n);
	if(a=1) {
		printf("num is perfect",n);
	} else {
		printf("num is not perfect");
	}


}
int perfect(int sum,int n) {
	if(sum==n) {
		return 1;
	} else {
		return 2;
	}
}