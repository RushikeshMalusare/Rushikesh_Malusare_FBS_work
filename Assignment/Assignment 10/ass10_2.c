#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main() {
	char a[]="hello";

	int x=mystrlen(a);
	printf("%d",x);
}

int mystrlen(char* a) {
	int i=0;
	while(a[i]!='\0') {
    
		i++;
	}
	return i;
}