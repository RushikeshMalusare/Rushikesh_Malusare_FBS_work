#include<stdio.h>
int palin(int,int);
void main() {
	int n=101,rem;
	int m,rev=0;
	m=n;
	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	int a=palin(rev,m);
	if(a==1) {
		printf("number is palindrom",m);
	} else {
		printf("number is not palindrom",m);
	}
}
int palin(int rev,int m) {
	return rev==m;
}
