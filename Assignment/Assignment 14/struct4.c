#include<stdio.h>
struct student{
	int rollno;
	char name[20];
	int marks;
};
struct student storeStudent();
void  displayStudent();
void main(){
	struct student s1,s2,s3;
	s1=storeStudent();
    s2=storeStudent();
	s3=storeStudent();	
	
	displayStudent(s1);
	displayStudent(s2);
	displayStudent(s3);
}
void displayStudent(struct student n){
 	printf("rollno=%d,name=%s,marks=%d\n",n.rollno,n.name,n.marks);
 }
 struct student storeStudent(){
 	   struct student temp;
 	    printf("enter the rollno name marks");
 	    scanf("%d",&temp.rollno);
		 scanf("%s",&temp.name);
 	    scanf("%d",&temp.marks);
 	    return temp;
 }