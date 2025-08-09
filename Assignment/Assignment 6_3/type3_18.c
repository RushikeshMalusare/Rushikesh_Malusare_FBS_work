#include<stdio.h>
void palin(int,int);
void main() {
	int n=121,rem;
	int m,rev=0;
	m=n;
	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	palin(rev,m);
}
void palin(int rev,int m) {
	if(rev==m) {
		printf("number is palindrom",m);
	} else {
		printf("number is not palindrom",m);
	}
}

