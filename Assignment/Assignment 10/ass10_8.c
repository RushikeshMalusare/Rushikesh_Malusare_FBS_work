#include<stdio.h>
int mystrstr(char*,char*);
void main() {
	char a[]="hello";
	char b[]="ell";
	int x=mystrstr(a,b);
	if(x==1) {
		printf("string b is sub string of a");
	} else {
		printf("string b is not sub string of a");
	}


}
int mystrstr(char* a,char* b) {
	int i=0,j=0;
	for(i=0; a[i]!='\0'; i++) {
		for(j=0; b[j]!='\0'; j++) {
			if(a[i+j]!=b[j]) {
				break;
			}
		}
	if(b[j]=='\0') {
			return 1;
		}
	}

	return -1;
}




