#include<stdio.h>
#include<string.h>
char* deleteodd(char*);
void main() {
	char a[]="hello";
	 	printf("%s",a);

	deleteodd(a);
	printf("total is %s :",a);

}
char* deleteodd(char* a) {
	int i=0,j=0;
	
	while(a[i]!='\0') {
		if(i%2==0) {
			a[j]=a[i];

			j++;

		}
		i++;

	}
  a[j]='\0';
return a;

}