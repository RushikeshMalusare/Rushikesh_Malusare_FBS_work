#include<stdio.h>
 char letter(char*);  //without return type  with parameter
void main(){
	char ch;
	printf("enter the character\n");
	scanf("%c",&ch);
	 int a=letter(&ch);
	 if(a==1){
	 	printf("character is upper");
	 }
	 else{
	 	printf("charcter is lower");
	 }
}
   char letter(char* ch){
	
	return *ch<=90||*ch>=122;
	
	
}