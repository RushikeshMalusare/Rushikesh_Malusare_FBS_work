#include<stdio.h>
int facto();
int main(){
	
	if(facto())
	 printf("factor is%d",facto);
}
   int facto(){
	int n=5;
	int i=1;
	int fact=1;
	for(i=1;i<=n;i++){
		fact=fact*i;
		 return fact;
    }
}