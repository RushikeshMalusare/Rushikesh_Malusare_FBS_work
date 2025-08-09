#include<stdio.h>

void main() {
	int a[]= {1,2,3,4,5,6};
	int b[]= {10,20,30,40,50,60};
	int n1=sizeof(a)/sizeof(a[0]);
	int n2=sizeof(b)/sizeof(b[0]);
	int c[n1+n2];
	for(int i=0;i<n1;i++){
		c[i]=a[i];
	}
	for(int i=0;i<n2;i++){
		c[n1+i]=b[i];
		
	}
	for(int i=0;i<n1+n2;i++){
		printf("%d "c[i]);
	}

}