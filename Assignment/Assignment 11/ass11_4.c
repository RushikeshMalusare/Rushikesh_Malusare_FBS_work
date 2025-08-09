#include<stdio.h>
#include<string.h>
void main(){
	char a[]="apple are fruit";
	int i=0;
	int count=0;
	while(a[i]!='\0'){
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
			
			count=count+1;
		}
		
	i++;
}
printf("total is %d ",count);	
}