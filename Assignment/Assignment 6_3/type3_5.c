#include<stdio.h>
void salary(float);  // func declaration
void main(){
	float b=3000;
	
	salary(b);   // func call
	
}
    void salary(float b){  // func definetion
	double da,ta,hra;

     float ts;
	if(b<=5000){
	  da=b*0.10;
	  ta=b*0.15;
	  hra=b*0.20;
	  ts=da+ta+hra+b;
    }
       if(b>=5000){
        	da=b*0.15;
        	ta=b*0.25;
        	hra=b*0.30;
        	ts=da+ta+hra+b;
	}
		printf("%f",ts);
}	

