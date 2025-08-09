void main() {
	int a[5];

	int alt=0;
	printf("enter the 5 element");
	for(int i=0; i<5; i++)
		scanf("%d",&a[i]);

	for(int i=0; i<5; i=i+2)

		printf("alternate number is %d\n",a[i]);

}