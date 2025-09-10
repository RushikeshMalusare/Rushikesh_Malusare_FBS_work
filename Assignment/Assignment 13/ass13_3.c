void main() {
	int *a=(int*)malloc(sizeof(int)*5);
	printf("enter the 5 element");
	for(int i=0; i<5; i++) {
		scanf("%d",&a[i]);
	}
	for(int i=0; i<5; i++) {
		printf("%d ",a[i]);
	}
	int sum=0;
	for(int i=0; i<5; i++) {
		if(a[i]>0) {
			sum=sum+a[i];
		}
	}
	printf("\n sum of total array is %d ",sum);
	free(a);
}