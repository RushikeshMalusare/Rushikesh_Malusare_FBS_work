// const coding = ["js","java","cpp"]

// const value =coding.forEach((item) =>{  //foreach not any value

//     console.log(item);
    
// })
// console.log(value);

// const number=[2,4,6,8,10]
// // filter me bhe ak callback fun hai
// const newnum = number.filter((num) => num > 4)  //paranthesis lia to apne app return hota hai
// console.log(newnum);


const number=[2,4,6,8,10]
// filter me bhe ak callback fun hai
const newnum = number.filter((num) =>{  // curly brases lagaya hai to use ak scope me laye to hame return karna padega compolsory

    return  num > 4
    })
//console.log(newnum);

const newarr=[]

// const num=number.filter((num1)=>{
//     if(num1 > 4){
//         // return newarr;
//         newarr.push(num1)
        
//     }
// })
// console.log(newarr);


const student  =[
    {id:"one",name:"yash",marks:89,add:"pune"},
    {id:"two",name:"raj",marks:78,add:"mumbai"},
    {id:"three",name:"sai",marks:69,add:"nagar"},
    {id:"four",name:"rajesh",marks:90,add:"nagpur"},
    {id:"five",name:"raj",marks:98,add:"amravati"},
    {id:"six",name:"jaysh",marks:79,add:"sinnar"},
    {id:"seven",name:"saurav",marks:77,add:"nashik"},
];

// const studentdetail = student.filter((std) => std.name ==="raj")  //scope nhi hai
const studentdetail = student.filter((std) => {return std.marks <=80})  //scope hai to return keyword use

//console.log(studentdetail);



const demo = [1,2,3,4,5,6,7,8,9,10]

//const added= demo.map((num)=> num+10)

// const added= demo.map((num)=> {return num+10})

const added= demo
        .map((num)=>  num * 10)
        .map((num) => num+1)
        .map((num) => num+5)
        .filter((num)=>num >50)




//console.log(added);


// Reduce   => 

    const arr=[1,2,3]

    // const myarr = arr.reduce(function(acc,currval){
    //     console.log(`acc:${acc}and curval:${currval}`);
        
    //     return acc + currval
    // },3)
    // console.log(myarr);


    const mytotal = arr.reduce((acc,curval) => acc+curval,0)

    //console.log(mytotal);


    const shoppingCart =[

        {
            itemName:"java cource",
            price: 4300
        },
        {
            itemName:"c cource",
            price: 4000
        },
        {
            itemName:"python cource",
            price: 4900
        },
        {
            itemName:"Data science cource",
            price: 5300
        },
    ]
    
    const price=shoppingCart.reduce((acc,item)=>acc + item.price,0)
        console.log(price);
        
