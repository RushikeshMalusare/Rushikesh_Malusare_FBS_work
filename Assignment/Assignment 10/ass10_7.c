#include<stdio.h>
void mystrrev(char*);
void main(){
	char a[]="hello";
	int i = 0;
    while (a[i] != '\0') {
        if (a[i] == '\n') {
            a[i] = '\0';
            break;
        }
    i++;
	}
        
	mystrrev(a);
	printf("%s",a);
}
void mystrrev(char* a){
	int start=0;
	int end=0;
	while(a[end]!='\0'){
		end++;
	}
	end--;
	while(start<end){
		char temp=a[start];
		 a[start]=a[end];
		 a[end]=temp;
		 start++;
		 end--;
		 
	}
	
}