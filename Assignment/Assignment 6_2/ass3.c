#include<stdio.h>
int character();
void main() {
	int a;
	a=character();
	if(a==1) {
		printf("vowels");
	} else {
		printf("not vowels");
	}
}
int character() {

	char ch;
	printf("enter the character\n");
	fflush(stdin);
	scanf("%c",&ch);
	if('a'==ch||'e'==ch||'i'==ch||'o'==ch||'u'==ch) {
		return 1;
	} else {
		return 0;
	}
}