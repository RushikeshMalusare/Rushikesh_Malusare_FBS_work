#include<stdio.h>
int palindrom(int);
void main() {
	int n;
	printf("enter the number");
	scanf("%d",&n);
	int a=palindrom(n);
	if(a==1) {
		printf("num is palindrom");
	} else {
		printf("num is not palindrom");
	}

}
int palindrom(int no) {
	int rev=0,rem;
	int temp = no;
	while(no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	return rev==temp;


}
