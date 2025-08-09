#include<stdio.h>
#include<string.h>
void main(){
	char a[5]="hello";
	char start,end;
	int i=0;
	while(a[i]!='\0'){
	 int x=strlen(a);
           a[0]=x-1;
			x-1=a[0];
		
			i++;
	}

printf("%s",a);
}