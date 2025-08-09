#include<stdio.h>
#include<string.h>
void main(){
	char a[10];
	int b;
	int i=0;
	printf("enter the string");
	scanf("%s",a);
	
	printf("enter the index to remove character");
	scanf("%d",&b);
	
	int len=strlen(a);
	
	for( i=b;i<len;i++){
		a[i]=a[i+1];
		
	}
	printf("new string is %s",a);
	}