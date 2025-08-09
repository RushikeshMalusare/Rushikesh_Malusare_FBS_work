#include<stdio.h>
void main() {
	int a[5],count=0;
	printf("enter the 5 element");
	for( int i=0; i<5; i++) {
		scanf("%d",&a[i]);
	}
	for(int i=0; i<5; i++) {
		if(a[i]!=1) {
			count=0;
			for(int j=2; j<=a[i]/2; j++) {
				if(a[i]%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				printf("%d is prime num\n ",a[i]);
			}
		}
	}

}