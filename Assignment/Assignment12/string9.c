#include<stdio.h>
#include<string.h>
void main() {
	char a[7]="hello";
	char n[9]="hllouhjk";
	int s=4;
	int x=strncmp(a,n,s);
	if(x==0) {
		printf("  string is euqal ");
	} else {
		printf(" string is not euqal");
	}
}
