#include<stdio.h>
int arm();
int main() {
	int a;
	a=arm();
	if(a==1) {
		printf("number is armstrong");
	} else {
		printf("number is not armstrong");
	}
}
int arm() {
	int n=153,rem,total=0;
	int	a=n;
	while(a>0) {
		rem=a%10;
		total=total+rem*rem*rem;
		a=a/10;
	}
	if(total==n) {
		return 1;
	} else {
		return 2;
	}

}