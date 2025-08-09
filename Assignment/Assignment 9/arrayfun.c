#include<stdio.h>
void storearray(int*,int);
void display(int*,int);
int search(int*,int,int);
void main() {
	int a[5];
	printf("enter the 5 element");
	storearray(a,5);
	display(a,5);
	printf("enter num you want to search");
	int no;
	scanf("%d",&no);
	int x=search(a,5,no);
	if(x==-1) {
		printf("not fount");
	}
	else{
		printf("%d",x);
	}

	}

void storearray(int* a,int s) {
	for(int i=0; i<5; i++)
		scanf("%d",&a[i]);
}
void display(int* a,int s) {
	for(int i=0; i<5; i++)
		printf("%d ",a[i]);
}

int search(int* a,int s,int no) {
	for(int i=0; i<s; i++) {

		if(a[i]==no) {
			return i;
		}
	}
	return -1;


}


