#include<stdio.h>
#include<stdlib.h>
void main() {
	int *n=(int*)malloc(sizeof(int)*6);
	printf("enter the element");
	for(int i=5; i>-1; i--)
		scanf("%d",&n[i]);
	for(int i=0; i<6; i++) 
		printf(" %d ",n[i]);
	free(n);
}