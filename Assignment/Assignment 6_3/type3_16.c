#include<stdio.h>
void arm(int,int);
int main() {
	int n=153,rem,total=0,a;
	a=n;
	while(a>0) {
		rem=a%10;
		total=total+rem*rem*rem;
		a=a/10;
	}
	arm(total,n);
}

void arm(int total,int n) {
	if(total==n) {
		printf("number is armstrong ",n);
	} else {
		printf("not armstrong");
	}

}
