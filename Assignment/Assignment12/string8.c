#include<stdio.h>
#include<string.h>
void main(){
	char a[]="hello";
	char n[]="ello";
	int x=strcmp(a,n);
	if(x==0){
		printf(" string is euqal",a,n);
	}
	else {
	printf(" string is not euqal",a,n);	
	}
	
}