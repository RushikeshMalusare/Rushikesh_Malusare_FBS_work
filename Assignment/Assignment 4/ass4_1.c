#include<stdio.h>
void main() {
	int n,i,j;
	int res=0,rem,a;
	printf("enter upper limit n");
	scanf("%d",&n);
	printf("arm num 1 and %d\n",n);
	a=n;
	for(i=1; i<n; i++) {
		while(a>0) {
			rem=a%10;
			res=res+rem*rem*rem;
			a=a/10;
		}

		for(i=0; i<n; i++) {

			if(res==a) {
				printf("%d",a);
			}
		}
	}
}




