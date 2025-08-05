void main(){
  int num;
  printf("enter total marks");
  scanf("%d",&num);
  if(num>=75){
  	 printf("Distinction");
     }else if(num>=65){
     	printf("Firt Class");
       }
	     else if(num>=55){
	     	printf("Second Class");
	       }
	     	else if(num>=40){
	     		printf("Pass Class");
	     	 }
    else{
    	printf("Failed");
	}
}