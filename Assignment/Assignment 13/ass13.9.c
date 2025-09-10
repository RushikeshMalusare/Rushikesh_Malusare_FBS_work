#include<stdio.h>
#include<stdlib.h>
void main() {
	
	int*arr=(int*)malloc(sizeof(int)*5);
	printf("Enter the element in array:\n");
    for(int i = 0 ; i < 5 ; i++)
	scanf("%d",&arr[i]);
	printf("\nThe array:");
	for(int i = 0 ; i < 5 ; i++)
        printf("%d ",arr[i]);

	printf("\nThe Count of num:");
    int no, count;
    printf("enter the num you want to count ");
	scanf("%d",&no);
    for(int i=0; i < 5; i++)
   {
       if(arr[i]==no){
	   
           count++;
       }
   }
    if (count==0){
	
	printf("not found");
   }

	else{
		printf("occour %d times", count);

	}
}

