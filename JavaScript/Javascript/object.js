
// const obj={}  //empty obj


const mysym = Symbol("key1")  //declare symbol

const obj={
    name:"raj" ,//name ak string hai
    "Full Name":"raj sharma",
    [mysym]:"mykey1", //imp symbols
    age:19,
    email:"abc@123",
    isLogin:false,
    lastLoginDate:["Mon","Sat"]
}

// console.log(obj.email);//or
//  console.log(obj["email"])



//  console.log(obj["Full Name"])

//  console.log(typeof obj.mysym)

// console.log(obj[mysym])

obj.email="xyz@123";

// console.log(obj["email"])

// Object.freeze(obj)  //object value not change
// obj.email="kjsdjk@123";

// console.log(obj["email"])

// console.log(obj)

obj.greet = function(){
    console.log("hello everyone");
    
}

obj.greet1 = function(){
    console.log(`hello everyone,${this.name}`);
    
}
// console.log(obj.greet());

// console.log(obj.greet1());

//object sigleton or constructor ke help se create

// const tinder = new Object()     //IMP   this is singleton Object
    // console.log(tinder);
    

 const tinder = {}   //this is not singlton object

 tinder.id = "123abc"
 tinder.name="raj"
 tinder.isLogin=false
//  console.log(tinder);

const regularusr = {
    email:"jhsa@123",
    fullname:{
        Userfullname:{
            firstname:"rajesh",
            lastname:"sharma"
        }
    }
}
// console.log(regularusr.fullname.Userfullname.firstname);

const obj1 ={1:"A",2:"B"}
const obj2  ={3:"C",4:"D"}

// const obj3={obj1,obj2}

// const obj3=Object.assign({},obj1,obj2)  //{}=> ye target not compulsory hai or baki ke source hai

const obj3={...obj1, ...obj2} //simple format  spred 
// console.log(obj3);

const users= [     //array of object hoge isme
    {
        id:1 ,
        email: "iodfskj@123"
    }, 
    {
        id:2 ,
        email: "kasskj@123"
    },
     {
        id:3 ,
        email: "wekj@123"
    },
     {
        id:4 ,
        email: "dfsskj@123"
    }
    
]

users[1].email


// console.log(tinder);

// console.log(Object.keys(tinder));

//  console.log(Object.values(tinder));

//   console.log(Object.entries(tinder));

//   console.log(tinder.hasOwnProperty('isLogin'));  //propery hai ya nhi apne array me

  const course ={

    coursename:"Javascript",
    price:"303",
    courseOwner:"happy"

  }

//   course.courseOwner

const {courseOwner:owner} = course  //one value access multiple time we use it :owern obj hai short me

console.log(owner);

// const navbar=()=>{

// } reat ka hai
// navbar(company="wipro")


