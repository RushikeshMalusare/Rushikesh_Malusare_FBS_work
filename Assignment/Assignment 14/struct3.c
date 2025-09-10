#include<stdio.h>
struct admin{
	int id;
	char name[20];
	float salary;
	float allowance;
};
void main(){
	struct admin a1,a2,a3,a4;
	printf("enter id,name,salary,allowance a1");
	//printf("enter rollno,name,marks s2");
	scanf("%d",&a1.id);
	scanf("%s",&a1.name);
	scanf("%f",&a1.salary);
	scanf("%f",&a1.allowance);
	printf("enter id,name,salary,allowance a2");
	scanf("%d",&a2.id);
	scanf("%s",&a2.name);
	scanf("%f",&a2.salary);
	scanf("%f",&a2.allowance);
	printf("id=%d,name=%s,salary=%f,allowance=%f\n",a1.id,a1.name,a1.salary,a1.allowance);
	printf("id==%d,name=%s,salary=%f,allowance=%f",a2.id,a2.name,a2.salary,a2.allowance);
}