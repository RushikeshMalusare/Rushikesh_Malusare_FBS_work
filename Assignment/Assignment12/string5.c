#include<stdio.h>
#include<string.h>
void main(){
	char a[50]="hello ";
	printf("before concatenate  %s\n ",a);
	strcat(a,"bye");
	printf("after concatenate  %s\n ",a);
}