const user=""

if(user){
    // console.log("sucessfully execute");
    
}
else{
    // console.log("Failed");
    
}


// falcy value = : false, 0 , -0 , BigInt 0n , "" , null , undefine , NaN

// truthy value = : "0" , 'false' , " space" , [] ,{} , function(){}


const student=[]

// if(student.length === 0){
//     console.log("Array is empty");
    
// }

const obj ={}   //empty object

if(Object.keys(obj).length===0){
//  console.log("Array is empty");
 
}

// false == 0   op=> true
// false == ''  op=>true
//0 == ''      op=>true


// Nullish coalecing Operetor (??): Null Undefined

let val;
  val=3 ?? 10
//  val=null ?? 20
// val= undefined ?? 10
// val = null ?? 10 ?? 19  //null ke baad jo value hai use print karta hai4r41
 console.log(val);
 

//Ternary Operator
// condition  ? true : fakse

const balance = 500

// balance <= 300 ? console.log("less than 300"): console.log("Greater than 300");

