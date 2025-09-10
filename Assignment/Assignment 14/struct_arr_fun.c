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
void main() {
	sales arr[2],arr1[3];
	printf("enter salesmanager 1 detail\n");
	storedetail(arr,2);

	printf("enter salesmanager 2 detail\n");
	storedetail(arr1,3);

	printf("display detail of sales 1\n");
	displaysales(arr,2);

	printf("display detail of sales 2 \n");
	displaysales(arr1,3);

}
void storedetail(sales * ptr,int size) {

	for(int i=0; i<size; i++) {
		scanf("%d",&ptr[i].id);
		scanf("%s",&ptr[i].name);
		scanf("%f",&ptr[i].incentive);
		scanf("%d",&ptr[i].target);

	}
}
void displaysales(sales* a,int size) {

	for(int i=0; i<size; i++) {
		printf("id=%d,name=%s,incentive=%f,target=%d\n",a[i].id,a[i].name,a[i].incentive,a[i].target);
	}
}