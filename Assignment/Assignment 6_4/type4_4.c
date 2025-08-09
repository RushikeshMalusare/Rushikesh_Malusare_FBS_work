#include<stdio.h>
float salary(float);  //func declaration
void main(){
	float bs=9700;
	float ts;
	float a=salary(bs);    //func call
	if(a==ts){
		printf("%f",ts);
	}
	else{
		printf("%f",ts);
	}
}
    float salary(float bs){  //func definetion
    float b=bs;
    double da,ta,hra,ts=0;
	if(b<=5000){
	  da=b*0.10;
	   ta=b*0.15;
	  hra=b*0.20;
	  ts=da+ta+hra+b;
	  return ts;
    }
     else if(b>=5000){
        	da=b*0.15;
        	ta=b*0.25;
        	hra=b*0.30;
        	ts=da+ta+hra+b;
        
	}
		return ts;
}	

