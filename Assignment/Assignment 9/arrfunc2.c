#include<stdio.h>
void sum(int*);
void main() {
	int a[5];
	printf("enter the 5 element");
	for(int i=0; i<5; i++) 
		scanf("%d",&a[i]);
	  sum(a);
	
	
}
   void sum(int* a){
	int sum=0;
	for(int i=0; i<5; i++) {
		if(a[i]>0) {
			sum=sum+a[i];
		}
	}
	printf("\n sum of total array is %d ",sum);
}