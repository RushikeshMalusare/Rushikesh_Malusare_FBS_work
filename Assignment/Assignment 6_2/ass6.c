#include<stdio.h>
int character();//func declaration
void main() {
	int a;
	a=character();
	if(a==1) {
		printf("character is upper letter");
	} else {
		printf("character is lower letter");
	}
}

int 	character() {
	char ch;
	printf("enter the character\n");
	scanf("%c",&ch);
	if(ch<=90||ch>=122) {
		return 1;
	} else {
		return 0;
	}

}