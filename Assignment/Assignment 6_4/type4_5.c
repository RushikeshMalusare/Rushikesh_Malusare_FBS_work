#include<stdio.h>
char character(char);
void main() {
	char c;
	printf("enter the character\n");
	scanf("%c",&c);
	char a=character(c);
	if(a==1) {
		printf("character is upper");
	} else {
		printf("character is lower");
	}
}
char character(char c) {
	char ch=c;
	if(ch<=90||ch>=122) {
		return 1;
	} else {
		return 2;
	}

}