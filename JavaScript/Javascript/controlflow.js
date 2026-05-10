//hole code run on conditional base logi  pe alag code or logout pe alag code run hona chaiea this is
//called as control flow 

// if is control flow
if(3 !== 3){
    // console.log("executed sucessfully");
    
}else{
    // console.log("executed failed");
}

//  <,>,>=,<=,==,!=,=== check type,!==

const score =200

if(score < 100){
    const power = "fly"    //var write kia to outside scope access ho sakta hai
    // console.log(`power:${power}`);
    
}

//short hand notation
const bal=200
// if(bal < 40) console.log("execute1"),console.log("execute2");



// if(bal < 30){
//     console.log("less than 30");
    
// }else if(bal < 90){
//       console.log("less than 90");
  
// }else if(bal < 150){
//       console.log("less than 150");
  
// }else{
//       console.log("less than 250");
  
// }

const userlogedIn = true
const password = true
const role = false

if(userlogedIn && password && 2==2){
    // console.log("login sucessfully");
    
}

if(userlogedIn || password ){  //example hai
    console.log("login sucessfully");
    
}