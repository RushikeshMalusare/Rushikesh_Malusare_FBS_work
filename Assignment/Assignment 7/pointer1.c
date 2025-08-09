#include<stdio.h>
int letter(char*);// func declaration

void main() {
	char ch;

	printf("enter the character\n");
	scanf("%c",&ch);
	int a=letter(&ch); //func call
	if(a==1) {
		printf("character is vowels");
	} else {
		printf("character is consonant");
	}

}
int letter(char* ch) { // func definetion

	if('a'==*ch||'e'==*ch||'i'==*ch||'o'==*ch||'u'==*ch) {
		return 1;
	} else {
		return 2;
	}

}
