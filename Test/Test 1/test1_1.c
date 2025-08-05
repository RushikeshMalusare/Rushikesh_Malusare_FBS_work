void main(){
	int hh,min,sec,total,a,b;
	printf("enter the hh,min,sec");
	scanf("%d%d%d",&hh,&min,&sec);
	 a=min*60;
	 b=hh*3600;
	total=a+b+sec;
	printf("total sec is%d",total);
	
}