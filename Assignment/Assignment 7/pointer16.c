#include<stdio.h>
int arm(int*,int*);
int main() {
	int n=153,rem,total=0,a;
	a=n;
	while(a>0) {
		rem=a%10;
		total=total+rem*rem*rem;
		a=a/10;
	}
	int x=arm(&total,&n);
	if(x==1) {
		printf("number is armstrong ");
	} else {
		printf("not armstrong");
	}
}

int arm(int* total,int* n) {
	if(*total==*n) {
		return 1;
	} else {
		return 2;
	}

}
