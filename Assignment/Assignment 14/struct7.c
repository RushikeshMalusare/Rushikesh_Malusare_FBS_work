struct date{
	int day;
	int month;
	int year;
	
};
void main(){
	struct date d1,d2;
	printf("enter the day month year d1");
	scanf("%d",&d1.day);
	scanf("%d",&d1.month);
	scanf("%d",&d1.year);
	printf("enter the day month year d2");
	scanf("%d",&d2.day);
	scanf("%d",&d2.month);
	scanf("%d",&d2.year);
	printf("%d/%d/%d \n",d1.day,d1.month,d1.year);
	printf("%d/%d/%d \n",d2.day,d2.month,d2.year);
}