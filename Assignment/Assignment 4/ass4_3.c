
void main(){
	int n,i,j;
	int sum=0;
	printf("enter upper limit n");
	scanf("%d",&n);
	printf("perfect num 1 and %d\n",n);
	for(i=1;i<=n;i++){
		sum=0;
		for(j=1;j<i;j++){
			if(i%j==0){
				sum=sum+j;
			}
		}
		if(sum==i){
			printf("%d\n",i);
		}
    }
}