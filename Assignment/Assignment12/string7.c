#include<stdio.h>
#include<string.h>
void main(){
	char a[8]="hello";
	char n[]="word";
	int x=strcat(a,n);
	printf("%s",x);
}