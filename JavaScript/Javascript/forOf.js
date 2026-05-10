// for of loop  array specific loop

["","",""]  //array me string

[{},{},{}]  //array me object

const arr = [1,2,3,4,5]

for(const num of arr){
    // console.log(num);
    
}

const str="Hello World"
for(const str1 of str){
    // console.log(`Char is ${str1}`);
    
}

// Maps  unique value ke lia use

// const map = new Map()
// map.set('In',"India")
// map.set('USA',"United state of America")
// map.set('FR',"France")

// // console.log(map);

// for(const [key,value] of map){
//     // console.log(key,':-',value);
    
// }
const demoobject ={
    'sub1':'java',
    'sub2':'sql'
}




const obj ={
    js:'javascript',
    cpp: 'c++',
    rb: 'ruby',
    sql: 'structure query language'
}
for(const key in obj){
    // console.log(`${key}shortcut is for ${obj[key]}`);
    
}

const language = ["java","c","sql","js","cpp"]
for(const key in language){
    //console.log(language[key]);//log(key) display only index     language[key] display value of that index
    
}

// const map = new Map()    //map is not iteratable
// map.set('In',"India")
// map.set('USA',"United state of America")
// map.set('FR',"France")

// for(const key in map){
//      console.log(key);
    
// }


// work on array use for Of loop

// work on Object use for in loop




// for Each loop
// this loop give you callbackfunction
// call back fn hai to fun ko name nhi hoga

const coding = ["c","java","sql","js","cpp","python"]

coding.forEach(function(val){  //array pe lagaya to param dete hai pr ye loop auto all value pe jayega means auto param lata hai
  //  console.log(val);
    
})

 coding.forEach((item) => {   // arrow function
    // console.log(item);
    
})

// function printMe(item){
//     console.log(item);
    
// 
// coding.forEach(printMe)

// coding.forEach((item,index,arr)=>{
//     console.log(item,iarr);
    
// })

const mycode=[
    {
        lang : "javascript",
        file: "js"
    },
    {
        lang : "java",
        file: "java"
    },
    {
        lang : "python",
        file: "py"
    },
    {
        lang : "c",
        file: "c"
    },
]

mycode.forEach((item)=>{
    console.log(item.file);
    
})