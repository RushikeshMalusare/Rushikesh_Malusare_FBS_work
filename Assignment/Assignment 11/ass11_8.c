#include<stdio.h>
#include<string.h>
int search(char*,char);
void main() {
	char a[10];
	char ch;
	printf("enter the string");
	scanf("%s",a);
	printf("enter character");
	fflush(stdin);                //clean buffer
	scanf("%c", &ch);

	int x=search (a,ch);

	if(x == 1) {
		printf("character is present in string %s",a);
	} else {
		printf("character is not present in string %s",a);
	}
}
int search(char* a,char ch) {
	int i=0;
	while(a[i]!='\0') {
		if(a[i]==ch) {
			return 1;
			break;
		}
		i++;
	}
	return 0;
}