#include<stdio.h>
#include<string.h>
void main(){
	char a[]="hello good morning";
	int i=0;
	while(a[i]!='\0'){
		if(a[i]==' '){
			a[i]='#';
		}
	i++;
	}
printf("modify string is %s",a);	
}