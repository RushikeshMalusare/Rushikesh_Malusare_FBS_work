struct student{
	int rollno;
	char name[20];
	int marks;
};
void main(){
	struct student s1,s2;
	printf("enter rollno,name,marks s1");
	printf("enter rollno,name,marks s2");
	scanf("%d",&s1.rollno);
	scanf("%s",&s1.name);
	scanf("%d",&s1.marks);
	
	printf("rollno=%d,name=%s,marks=%d\n",s1.rollno,s1.name,s1.marks);
	

	scanf("%d",&s2.rollno);
	scanf("%s",&s2.name);
	scanf("%d",&s1.marks);
	printf("rollno=%d,name=%s,marks=%d",s2.rollno,s2.name,s.marks); 