#include<stdio.h>
void add(int*,int*,int*);
void main() {
	int a[]= {1,2,3,4,5,6};
	int b[]= {10,20,30,40,50,60};
	int c[]= {  };
	
	add(a,b,c);
}
    void add(int*a,int *b,int* c){
	for(int i=0; i<6; i++)
		c[i]=a[i]+b[i];
	for(int i=0; i<6; i++)
		printf("addition of two array %d\n  ",c[i]);


}