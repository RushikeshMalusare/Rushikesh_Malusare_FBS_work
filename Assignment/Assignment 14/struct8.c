struct time{
	int hour;
	int min;
	int sec;
	
};
void main(){
	struct time t1,t2;
	printf("enter hour min sec t1");
	 scanf("%d",&t1.hour);
	 scanf("%d",&t1.min);
	 scanf("%d",&t1.sec);
	 printf("enter hour min sec t2");
	 scanf("%d",&t2.hour);
	 scanf("%d",&t2.min);
	 scanf("%d",&t2.sec);
	 printf("%d:%d:%d\n",t1.hour,t1.min,t1.sec);
	 printf("%d:%d:%d",t2.hour,t2.min,t2.sec);
}