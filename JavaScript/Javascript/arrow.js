const user = {

    username:"yash",
    price:9898,

    welcomeMeg:function(){

        console.log(`${this.username},welcome To website `); //this means ourrent context access  contect=>value
            //arrow func me this nhi hota hai
// console.log(this);  //this work on current value
        //brower ke ander ka global obj ak window object hai
        
    }
}
// user.welcomeMeg()
// user.username="raj"
// user.welcomeMeg()

// console.log(this); // => op is {}




// function demo(){
//     let username="abc"  //context work on object not use in function
//     console.log(this.username); =>op undefined
    
// }
// demo()

// const demo = function () {

//      let username="abc"           //op=> undefined
//     console.log(this.username);
// }
// demo()


const demo=() =>  {

      let username="abc"           
     console.log(this);  //op => undefined
 }
//  demo()

// const addTwo=(n1,n2) =>{
//     return n1+n2;
// }
// console.log(addTwo(3,2));


// const addTwo=(n1,n2) =>  n1+n2   //one liner  {} arrow ke baad ye kia to return keyword mendatory other wise no
// console.log(addTwo(3,2));

const addTwo =() =>({username:"raj"})   //obj ko return karne ke lia hame (parenthesis) dena padege

console.log(addTwo(3,2));