#include<stdio.h>
#include<string.h>
void main() {
	char a[]="hello";
	char ch[]={'s'};
	int x=strchr(a,ch);
	if(x=='\0') {
	printf("%s character is not present",x);
	} 
	else {
		printf("%s character is present",x);
	}
}