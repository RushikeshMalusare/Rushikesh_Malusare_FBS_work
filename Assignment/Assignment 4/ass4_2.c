void main(){
	int n,i,j;
	int count;
	printf("enter upper limit n");
	scanf("%d",&n);
	printf("prime num 1 and %d\n",n);
	for(i=2;i<=n;i++){
        count=0;
		for(j=2;j<=i/2;j++){
			if(i%j==0){
			count++;
		
		}
	}
	 if(count==0){
		printf("%d\n",i);
		}
    }
}
    

