#include<stdio.h>
int discount(int,char);
int main() {
	int a;
	char c;

	printf("enter the price ");
	scanf("%d",&a);
	printf("you are student");
	fflush(stdin);
	scanf("%c",&c);
	int k=a;
	char ch=c;
	int x=discount(a,ch);
	if(x==1) {
		if(ch=='y') {
			printf("final price is  %d",k=k-k*0.20);
		} else if(x==2) {
			printf("final price is%d",k=k-k*0.15);
		}
	} else {
		if(x==3) {
			if(ch=='y') {
				printf("final price is%d",k=k-k*0.10);
			}
		} else if(x==4) {
			printf("not discount%d",k);
		}
	}
}
int discount(int a,char c) {
	char ch=c;
	if(a>500) {
		if(ch=='y') {

			return 1;//	printf("final price is  %d",temp=temp-temp*0.20);
		} else if(a>600) {
			return 2;//printf("final price is%d",temp=temp-temp*0.15);
		}
	} else {
		if(a<500) {
			return 3;// printf("final price is%d",temp=temp-temp*0.10);
		} else {
			return 4;// printf("not discount%d",temp);
		}
	}
}
