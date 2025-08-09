#include<stdio.h>
void letter(char);  //without return type  with parameter
void main() {
	char ch;
	printf("enter the character\n");
	scanf("%c",&ch);
	letter(ch);

}
void letter(char ch) {

	if(ch<=90||ch>=122) {
		printf("character is upper");
	} else {
		printf("charcter is lower");
	}

}