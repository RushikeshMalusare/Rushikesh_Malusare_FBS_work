void main() {
   int max=0,min=0;
	int *a=(int*)malloc(sizeof(int)*5);
	printf("enter the 5 element");
	for(int i=0; i<5; i++)
		scanf("%d",&a[i]);
	max=a[0];
	for( int i=0; i<5; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	min=a[0];
	for( int i=0; i<5; i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	printf("\nMaximum num is%d",max);
	printf("\nMinimum num is%d",min);
    free(a);
}



