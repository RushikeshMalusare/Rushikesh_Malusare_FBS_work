#include<stdio.h>
struct saleManager{
	int id;
	char name[20];
	int salary;
	int incentive;
	int target;
};
void main(){
	struct saleManager s1,s2;
	printf("enter id name salary incentive,target");
	scanf("%d",&s1.id);
	scanf("%s",&s1.name);
	scanf("%d",&s1.salary);
	scanf("%d",&s1.incentive);
	scanf("%d",&s1.target);
	printf("enter id name salary incentive,target");
	scanf("%d",&s2.id);
	scanf("%s",&s2.name);
	scanf("%d",&s2.salary);
	scanf("%d",&s2.incentive);
	scanf("%d",&s2.target);
	printf("id=%d,name=%s,salary=%d,incentive=%d,target=%d\n",s1.id,s1.name,s1.salary,s1.incentive,s1.target);
	printf("id=%d,name=%s,salary=%d,incentive=%d,target=%d",s2.id,s2.name,s2.salary,s2.incentive,s2.target);

}