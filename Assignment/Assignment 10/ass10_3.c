#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main(){
	char a[]="hello";
	char b[]="hlllo";
   int 	x=mystrcmp(a,b);
	if(x==1){
		printf("string length equal");
	}
	else if(x==2) {
		printf("string  length is not   equal");
	}
}
int mystrcmp(char* a,char* b){
     int i=0;
     int len1=strlen(a);
     int len2=strlen(b);
	while(a[i]!='\0'&&b[i]!='\0'){
		if(len1==len2){
		   	
		  return 1;	 
		i++;	
		}
		else {
			
			return 2;	
		
	}
}
		
}
	

