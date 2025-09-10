#include<stdio.h>
#include<stdlib.h>
void main(){
	
	int *a=(int*)malloc(sizeof(int)*5);
	int *b=(int*)malloc(sizeof(int)*5);
	int *x=(int*)malloc(sizeof(int)*5);
	printf("enter the 5 element");
	for(int i=0;i<5;i++)
		scanf("%d",&a[i]);
	
	for(int i=0;i<5;i++)
		printf("%d ",a[i]);
	
	printf("\n enter the 5 element");
	for(int i=0;i<5;i++)
		scanf("%d",&b[i]);
	
	for(int i=0;i<5;i++)
		printf("%d ",b[i]);
	
     for(int i=0;i<5;i++)
	     x[i]=a[i]+b[i];
	     
	    printf("\n sum of array is "); 
	 for(int i=0;i<5;i++)
	    printf("%d ",x[i]);
	
	free(a);
	free(b);
	free(x);
}
