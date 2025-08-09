#include<stdio.h>
void display(int*,int);
void search(int*,int,int);
void main(){
	int a[]={1,2,3,4,5,6,7,8};
	
	  int size=sizeof(a)/4;
	   printf(" size of array is %d\n",size);

    display(a,size);
    printf("\nyou want to search");
    int n;
    scanf("%d",&n);
    search(a,size,n);
    printf("\n you delete number");
    int no;
    scanf("%d",&no);
    delet(a,size,no);
  
  
}

  void display(int* a,int size){
  	 printf("[");
  	for(int i=0;i<size;i++)
  	  printf("%d",a[i]);
  	  printf("]");
  	  
  }
  void search(int* a,int s,int n){
  	for(int i=0;i<s;i++)
  	 if(a[i]==n){
  	 	printf("%d",i);
	   }
  }
  
  void delet(int* a,int s,int no){
  	int i=0;
	  	for(i=0; i < s -1; i++) {
			if(a[i]==no){
				a[i]=a[i+1];
			}
		}
		s--;
		printf("%d",);
	}
//	for(int i=0;i<s;i++)
//  	  if(a[i]==no){
//  	  	 i--;
//		}
  	  
  
  
  
  
  