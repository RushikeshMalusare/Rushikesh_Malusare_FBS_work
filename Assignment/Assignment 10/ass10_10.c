#include<stdio.h>
char* mystrchr(char*,char);
void main(){
	char a[]="hello";
	char ch='o';
	int x=mystrchr(a,ch);
	 if(x==1){
	 	printf("character present in string");
	 }
	 else{
	 	printf("charcter not present in string");
	 }
}


char* mystrchr(char* a,char ch){
	int i=0;
	while(a[i]!='\0'){
	
	    if(a[i]==ch){
	    	return 1;
		}
		i++;
    }
    return 2;
}


