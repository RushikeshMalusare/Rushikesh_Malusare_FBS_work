#include<stdio.h>
char* mystrupr(char*);
void main(){
	char a[]="hello";
	mystrupr(a);
	printf("%s",a);
}
char* mystrupr(char* a){
 int i=0;
  while(a[i]!='\0'){
  	if(a[i]>='a'&&a[i]<='z'){
  		a[i]=a[i]-32;
	  }
	  i++;
  }	
}