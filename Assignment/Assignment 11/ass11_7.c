#include<stdio.h>
#include<string.h>
int palindrom(char*);
void main() {
	char a[]="abc";
	int x=palindrom(a);
	if(x==1) {
		printf("string is not palindrom %s",a);
	} else {
		printf("string is palindrom %s",a);
	}

}
int palindrom(char* a) {
	int i=0;
	int s=0;
	int e=strlen(a)-1;
	while(a[i]!='\0') {
		if(a[s]<a[e]) {
			if(a[s]!=a[e]) {

				return 1;
			}
			s++;
			e--;
		}
		i++;
	}

}