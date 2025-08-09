#include<stdio.h>
void letter(char);// func declaration

void main() {
	char ch;

	printf("enter the character\n");
	scanf("%c",&ch);
	letter(ch); //func call


}
void letter(char ch) { // func definetion

	if('a'==ch||'e'==ch||'i'==ch||'o'==ch||'u'==ch) {
		printf("character is vowels");
	} else {
		printf("character is consonant");
	}

}
