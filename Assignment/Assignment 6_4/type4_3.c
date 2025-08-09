#include<stdio.h>
char letter(char);
void main() {
	char c;
	printf("enter the character\n");
	scanf("%c",&c);
	int a=letter(c);
	if(a==1) {
		printf("char is vowels");
	} else {
		printf("char is consonent");
	}

}
char letter(char c) {
	char ch=c;
	if('a'==ch||'e'==ch||'i'==ch||'o'==ch||'u'==ch) {
		return 1;
	} else {
		return 2;
	}

}