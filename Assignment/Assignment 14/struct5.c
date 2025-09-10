#include<stdio.h>
struct head{
	int id;
	char name[20];
	float salary;
	int commition;
};
void main(){
	struct head h1,h2;
	printf("enter id,name,salary,commition e1");
	//printf("enter rollno,name,marks s2");
	scanf("%d",&h1.id);
	scanf("%s",&h1.name);
	scanf("%f",&h1.salary);
	scanf("%d",&h1.commition);
	printf("enter id,name,salary,commition e2");
	scanf("%d",&h2.id);
	scanf("%s",&h2.name);
	scanf("%f",&h2.salary);
	scanf("%d",&h2.commition);
	printf("id=%d,name=%s,salary=%f,commition=%d\n",h1.id,h1.name,h1.salary,h1.commition);
	printf("id=%d,name=%s,salary=%f,commition=%d",h2.id,h2.name,h2.salary,h2.commition);
}