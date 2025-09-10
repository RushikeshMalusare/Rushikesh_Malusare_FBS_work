void main() {
	int *n=(int*)malloc(sizeof(int)*5);
	printf("enter the 5 element");
	for(int i=0; i<5; i++)
		scanf("%d",&n[i]);
	printf("you can search number");
	int a;
	scanf("%d",&a);
	for(int i=0; i<n; i++)
		if(n[i]==a) {
			printf("index is %d",i);
			break;
		}
    free(n);

}
