
if(true){
    let a=10;

    const b=20

    // var c=30;
}

// console.log(a);
// console.log(b);
// console.log(c);


function one(){
    const username = "yash"
    function two(){
        const website = "google.com"
        // console.log(username);
        
    }
    two()
}
// one()

if(true){
    const username ="yash"
    if(username === "yash"){
        const website = " youtube"
       // console.log(username + website);
        
    }
}
  

console.log(addone(5))
function addone(num){  //basic function

    return num+1
}


//  Cannot access 'addtwo' before initialization  => is error ka matlab asa hai ke func declaration ke pahele access ho raha hai
addtwo(5)  //function ko variable me store karna called as hosting
const addtwo=function(num){   //function hai pr js me variable kuch bhi store kr sakte hai  isko expression bhi kahate hai
    //they can store json ,function etc 
    returnnum +2
}
//addtwo(5)

