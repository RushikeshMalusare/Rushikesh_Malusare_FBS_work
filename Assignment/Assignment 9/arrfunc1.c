void maxmin(int*,int,int);
void main() {
	int a[5],max,min;
	printf("enter the 5 element");
     maxmin(a,max,min);
}
void maxmin(int* a,int max,int min) {
	int i;
	for(int i=0; i<5; i++)
		scanf("%d",&a[i]);
	max=a[0];
	for( i=0; i<5; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}

	min=a[0];
	for( i=0; i<5; i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	printf("\nMaximum num is%d",max);
	printf("\nMinimum num is%d",min);

}



