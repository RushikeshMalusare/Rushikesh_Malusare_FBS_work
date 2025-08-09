#include<stdio.h>

void concat(char*,char*);
void main() {
	char a[50]="hello";
	char b[]="word";
	concat(a,b);

	printf("%s",a);
}
void concat(char* a,char* b) {
	int i=0;
	while(a[i]!='\0') {
		i++;
	}
	int j=0;
	while(b[j]!='\0') {
		a[i]=b[j];
		j++;
		i++;
	}
}