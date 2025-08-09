#include<stdio.h>
#include<string.h>
void main() {
	char a[]="hellohey ";
	char b[]=" ";
	mystrcpy(a,b);
}
void mystrcpy(char* a,char* b) {
	int i=0;
	while(a[i]!='\0') {

		b[i]=a[i];

		i++;
	}
	b[i]='\0';
	printf("%s",b);


}












