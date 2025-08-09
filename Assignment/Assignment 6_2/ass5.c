float salary();
void main() {
	int a,ts;
	a=salary();
	if(a==1) {
		printf("total is",ts);
	} else {
		printf("total is",ts);
	}

}
float salary() {

	double da,ta,hra;
	float ts=0;
	float bs;
	printf("enter salary");
	scanf("%f",bs);
	if(bs<=5000) {
		da=bs*0.10;
		ta=bs*0.15;
		hra=bs*0.20;
		ts=bs/(da+ta+hra);
		return ts;
	} else if(5000<bs) {
		da=bs*0.15;
		ta=bs*0.25;
		hra=bs*0.30;
		ts=da+ta+hra;
	}
	return ts;
}

