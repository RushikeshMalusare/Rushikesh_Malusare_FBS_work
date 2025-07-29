void main(){
	double da,ta,hra;
	float ts=0;
	float bs=9000;
	if(bs<=5000){
	  da=bs*0.10;
	  ta=bs*0.15;
	  hra=bs*0.20;
	  ts=da+ta+hra;
	  printf("%1f%1f%1f",ts=da+ta+hra+bs);
    }
     else if(5000<bs){
        	da=bs*0.15;
        	ta=bs*0.25;
        	hra=bs*0.30;
        	ts=da+ta+hra;
	}
		printf("%1f%1f%1f",ts=da+ta+hra+bs);
}	

