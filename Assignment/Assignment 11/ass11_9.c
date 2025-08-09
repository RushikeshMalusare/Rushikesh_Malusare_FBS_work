#include<stdio.h>
#include<string.h>
int largest(char*,char*);
void main() {
	char a[]="hellogood";
	char b[]="friend";

	int x=largest(a,b);
	if(x==a) {
		printf("%s",a);
	} else if(x==b) {
		printf("%s",b);
	}

}
int largest(char* a,char* b) {
	int i=0;
	while(a[i]!='\0') {
		if(a[i]>b[i]) {
			//a[i]>b[i];
			return a;
		} else if(a[i]<b[i]) {
			return b;

		}
		i++;
	}

}