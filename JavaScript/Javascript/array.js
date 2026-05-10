// array is resizable and mix the datatype
// associative array not in js array element not in arbitary string access any value using index
//ex access array log(myarr[0 inx])not myarr[one]
// index start with 0   
// Shallow copy := inqw
// allow different type array in single array

const myarr=[1,2,3,4,5,6]
//or
const hero = ["raj","yash","sai"]
//or
const myarr2 = new Array(1,2,3,4,5,6)

// console.log(myarr[0]);

// Array Method

// myarr.push(10)
// myarr.push(11)
// myarr.pop()
//console.log(myarr);

// myarr.unshift(9)
// myarr.shift()
// console.log(myarr.includes(8));

// console.log(myarr.indexOf(8));

// const newarr=myarr.join()
// console.log(myarr);
// console.log(newarr);

// slice , splice

// console.log("A",myarr);

// const myn1 = myarr.slice(1,3);

// console.log(myn1);

// console.log("B",myarr);
const myn2 = myarr.splice(1,3)
// console.log(myn2);

const vowel=["A","E","I","O","U"]

const consonent=["B","C","D","F","K"]

// consonent.push(vowel)
// console.log(consonent);

// console.log(consonent[5][1]);

// const allreturn= consonent.concat(vowel)
// console.log(allreturn);

// const newrec=[...consonent,...vowel]
// console.log(newrec);
 
const demo=[1,2,3,[4,5],6,7,[8,9,[11,22]]]

const holearr=demo.flat(Infinity)

// console.log(holearr);

// console.log(Array.isArray("Yash"));

// console.log(Array.from("Yash"));

// console.log({name:"raj"});
console.log(Array.from({name:"raj"}));

let scr1=100;
let scr2=200;
let scr3=300;

console.log(Array.of(scr1,scr2,scr3));
