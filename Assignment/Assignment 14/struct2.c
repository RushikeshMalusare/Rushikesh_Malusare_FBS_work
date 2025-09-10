#include<stdio.h>
struct employee{
	int id;
	char name[20];
	float salary;
};
void main(){
	struct employee e1,e2;
	printf("enter id,name,salary e1");
	//printf("enter rollno,name,marks s2");
	scanf("%d",&e1.id);
	scanf("%s",&e1.name);
	scanf("%f",&e1.salary);
	printf("enter id,name,salary e2");
	scanf("%d",&e2.id);
	scanf("%s",&e2.name);
	scanf("%f",&e2.salary);
	printf("id=%d,name=%s,salary=%f\n",e1.id,e1.name,e1.salary);
	printf("id==%d,name=%s,salary=%f",e2.id,e2.name,e2.salary);
}