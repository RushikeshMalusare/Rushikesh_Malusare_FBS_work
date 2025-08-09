#include<stdio.h>
#include<string.h>
int wordcount(char*);
void main() {
	char a[50];
	printf("enter the string");
	 gets(a);
     
	int x=wordcount(a);

	printf("total word is %d",x);
}
int wordcount(char* a) {

	int i=0;
	int count=0;
	while(a[i]!='\0') {
		if(a[i]==' ') {
			count=count+i;
			return count;
		}
	}
		i++;
	
	
}