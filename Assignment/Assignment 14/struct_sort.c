struct emp{
	int id;
	char name[20];
	int salary;
};
void main(){
	struct emp a[5];
	printf("enter 5 employee detail");
	for(int i=0;i<5;i++){
		scanf("%d",&a[i].id);
		scanf("%s",&a[i].name);
		scanf("%d",&a[i].salary);
	}
	for(int i=0;i<5;i++){
	
	printf("id=%d ",a[i].id);
	printf("name=%s ",a[i].name);
	printf("salary=%d\n ",a[i].salary);
	//printf("id=%d,name=%s,salary=%d\n");
}
}
displyadetail(){
	printf("enter 5 employee detail");
	for(int i=0;i<5;i++){
		scanf("%d",&a[i].id);
		scanf("%s",&a[i].name);
		scanf("%d",&a[i].salary);
	}
}