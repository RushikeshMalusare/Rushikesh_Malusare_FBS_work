// for loop syntax

for(let indx=0 ; indx < 5 ; indx++){
  const element = indx;
  if(indx == 3){
    //  console.log("3 is available");
     
  }
//   console.log(element);
  
}


for(let indx=1 ; indx <=5; indx++){
    console.log(`Outer Loop: ${indx}`);
    
    for(j= 1; j <=10; j++){
        //   console.log(`Inner Loop:${j} and Inner Loop${indx}`);
       // console.log(indx + "*" + j + "=" + indx*j);
    }   
    
}

let myarr = ["raj","yash","sai","jay","ajay"]

for(let i=0; i< myarr.length; i++){
  const element = myarr[i];
  // console.log(element);
  
}

//break and continue

// for(let i=1; i<=10; i++){
//   if(i==5){
//     console.log(`show five`);
//     break;
    
//   }
//   console.log(`value of i is ${i}`);
  
// }


for(let i=1; i<=10; i++){
  if(i==5){
    console.log(`show five`);
    continue;
    
  }
  console.log(`value of i is ${i}`);
  
}