#include<stdio.h>
typedef struct emp {
	int id;
	char name[20];
	int salary;
}emp;
void storedetail( emp*, int );
void displaydetail(emp*, int );
void searchdetail(emp*, int,int );
void main() {
	emp a[3];
	storedetail(a,3);
	displaydetail(a,3);


	int idx;
	printf("enter the id you want to search");
	scanf("%d",&idx);
	searchdetail(a,3,idx);


}
void storedetail( emp* a,int s) {

	printf("enter 3 employee detail");
	for(int i=0; i<s; i++) {
		scanf("%d",&a[i].id);
		scanf("%s",&a[i].name);
		scanf("%d",&a[i].salary);
	}
}
void displaydetail( emp* a,int s) {
	for(int i=0; i<s; i++) {

		printf("id=%d ",a[i].id);
		printf("name=%s ",a[i].name);
		printf("salary=%d\n ",a[i].salary);

	}
}
void searchdetail(emp* a,int s,int idx) {

    
	
	if(idx >= 0-1 && idx < s) {
		printf("detail of %d",idx);
		printf("id=%d,name=%s,salary=%d\n",a[idx].id,a[idx].name,a[idx].salary);
	} else {
		printf("not found");
	}
}








