#include<stdio.h>
typedef struct salesmanager {
	int id;
	char name[20];
	float salary;
	float incentive;
	int target;
} sales;
void storedetail(sales *,int);
void displaydetail(sales *,int);
int displaysearch(sales *,int,int );
void deletedetail(sales*,int*,int);
void main() {
	int n;
	printf("enter how many salesmanager to enter ");
	scanf("%d",&n);

	sales a[n];
	printf("enter salesmanager detail\n");
	storedetail(a,n);
	displaydetail(a,n);
	int id;
	printf("enter the id you want to search");
	scanf("%d",&id);
	int idx=displaysearch( a,n, id);
	if(idx==-1) {
		printf("Not found");
	} else {
		printf("id=%d,name=%s,incentive=%f,target=%d\n",a[idx].id,a[idx].name,a[idx].incentive,a[idx].target);
	}
	int n1;
	printf("enter id you want to delete");
	scanf("%d",&n1);
	deletedetail(a,&n,n1);
	
	displaydetail(a,n);
}

void storedetail(sales * ptr,int size) {
	printf("enter id name incentive target");
	for(int i=0; i<size; i++) {
		scanf("%d",&ptr[i].id);
		scanf("%s",ptr[i].name);
		scanf("%f",&ptr[i].incentive);
		scanf("%d",&ptr[i].target);

	}
}
void displaydetail(sales* a,int size) {
	printf("display detail :");
	for(int i=0; i<size; i++) {
		printf("id=%d,name=%s,incentive=%f,target=%d\n",a[i].id,a[i].name,a[i].incentive,a[i].target);
	}
}
int displaysearch(sales* a,int s,int id) {

	for(int i=0; i<s; i++) {

		if(a[i].id==id) {
			return i;
		}
	}
	return -1;
}
void deletedetail(sales* a,int* s,int n1){
   int x=displaysearch(a,*s,n1);
	if(x==-1){
		printf("Not found");
	}
	else{
		for(int i=x;i < *s - 1;i++)
		{
			a[i]=a[i+1];

			}
		
		(*s)--;                     

	}
	printf("deletion successfully %d \n",n1);
}


