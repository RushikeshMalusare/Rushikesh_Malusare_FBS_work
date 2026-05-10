
function namwe(){
    console.log("y");
    console.log("A");
    console.log("s");
    console.log("h");

}
// namwe()
   
function addTwoNumber(num1,num2){   //isme jo pass kia hai o hai parameter
    // console.log(num1+num2);
    
}
// addTwoNumber()   //value not assign they can show NaN
  
// addTwoNumber(3,7)  
// addTwoNumber(3,"7")  //o/p =>37
// addTwoNumber(3,null)  //op =>3       //isme jo data pass kia hai use argument kahate hai
// addTwoNumber(3,a)  //3a  



function addTwoNumber(num1,num2){  //isme jo pass kia hai o hai parameter
    // const result = num1+num2;
    return num1+num2;
    // console.log(num1+num2);
}
    // const result =addTwoNumber(5,2)

    // console.log("Result Is:",result);
    
    function loginuser(username)
    {
        // if(username===undefined)
        if(!username){
            console.log("Enter the name");
            return ;
            
        }
        
        return `${username} just Loged in`
    }
    // console.log(loginuser("yash")); //=>yash just log in

    // console.log(loginuser("")); // op =>  just log in

    // console.log(loginuser());   //op => undefine jst log in
    
    // function calculatePrice(...num1){
    //     return num1
    // }

    // console.log(calculatePrice(200,210,1000,300));
    
    const user ={
        username:"raj",
        price:494
    }
    function handleobject(anyobject){
        console.log(`Username is ${anyobject.username} and  price is ${anyobject.price}`);
        
    }

    handleobject(user)

    // pass another user
     handleobject({
        username:"yash",
        price:898

     })

     const mynewArray =[200,300,400,500];
     function returnvalue(getArray){
        return  getArray[1]
     }
     console.log(returnvalue(mynewArray));
     