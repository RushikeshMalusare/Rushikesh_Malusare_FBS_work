void main() {
	int a[5];
	printf("enter the 5 element");
	for(int i=0; i<5; i++) {
		scanf("%d",&a[i]);
	}
	for(int i=0; i<5; i++) {
		if(a[i]%2==0) {
			printf("%d is even\n",a[i]);
		} else if(a[i]%2==1) {

			printf("%d is odd\n",a[i]);
		}
	}
}


























































