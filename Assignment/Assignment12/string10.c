#include<stdio.h>
#include<string.h>
void main() {
	char a[8]="hello";
	int  x=strstr(a,"lo");
	if(x=='\0') {
		printf("%s is not found",x);
	} else {
		printf("%s is found");
	}

}