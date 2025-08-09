#include<stdio.h>
char* mystrlwr(char*);
void main(){
	char a[]="HELLO";
	mystrlwr(a);
	printf("%s",a);
}
char* mystrlwr(char* a){
 int i=0;
  while(a[i]!='\0'){
  	if(a[i]>='A'&&a[i]<='Z'){
  		a[i]=a[i]+32;
	  }
	  i++;
  }	
}