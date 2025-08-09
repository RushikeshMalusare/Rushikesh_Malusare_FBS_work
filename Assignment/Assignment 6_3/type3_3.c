#include<stdio.h>
void leap(int);
void main(){
	int year;
	printf("enter the year");
	 scanf("%d",&year);
	  leap(year);
	
}
    void leap(int year){
	if(year%4==0&&year%100!=0||year%400==0){
	printf("year is leap",year);
     }
	else{
		printf("year is not leap",year);
	}
}