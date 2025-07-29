void main(){
	int year;
	printf("enter the year");
	scanf("%d",&year);
	if(year%4==0&&year%100!=0||year%400==0){
	printf("year is leap%d",year);
     }
	else{
		printf("year is not leap",year);
	}
}