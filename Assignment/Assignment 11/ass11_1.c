#include<stdio.h>
#include<string.h>
char* replace(char*,char,char);
void main(){
	char a[]="Ashoknagar";
	replace(a,'a','$');
	printf("modify string is %s",a);
	
}
char* replace(char* a,char old,char new){
	int i=0;
	while(a[i]!='\0'){
		if(a[i]==old){
			a[i]=new;
		}
	i++;
	}
	return 0;
}