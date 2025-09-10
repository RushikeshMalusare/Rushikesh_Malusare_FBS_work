#include<stdio.h>
#include<stdlib.h>
void main() {
	int *a=(int*)malloc(sizeof(int)*5);
	printf("enter the 5 element");
	int count=0;
	for( int i=0; i<5; i++) {
		scanf("%d",&a[i]);
	}
	for(int i=0; i<5; i++) {
		if(a[i]!=1) {
			int count=0;
			for(int j=2; j<=a[i]/2; j++) {
				if(a[i]%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				printf("%d is prime num in this array\n ",a[i]);
				 
			}
			
		}
		
		
	}

 free(a);
}