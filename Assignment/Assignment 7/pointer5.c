#include<stdio.h>
void salary(float*);  // func declaration
void main() {
	float bs=2000;
	salary(&bs);   // func call

}
void salary(float* bs) { // func definetion
	double da,ta,hra;
	float b=*bs;
	float ts=0;
	if(b<=5000) {
		da=b*0.10;
		ta=b*0.15;
		hra=b*0.20;
		ts=da+ta+hra+b;
	} else {
		da=b*0.15;
		ta=b*0.25;
		hra=b*0.30;
		ts=da+ta+hra+b;
	}
	printf("%1f",ts);
}

