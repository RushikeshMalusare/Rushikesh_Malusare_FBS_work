#include<stdio.h>
void evenodd(int*);
void main() {
	int a[5],i;
	printf("enter the 5 element");
	for(int i=0; i<5; i++)
		scanf("%d",&a[i]);
	
	evenodd(a);
	
}

 void evenodd(int* a) {
	for(int i=0; i<5; i++) {
		if(a[i]%2==0) 
			printf("\n%d is even num",a[i]);
		 else 
            	printf("\n%d is odd num",a[i]);
		
	}
}

