let myDate = new Date()

// console.log(myDate.toString());

//  console.log(myDate.toDateString());

//  console.log(myDate.toLocaleString())

//  console.log(myDate.toLocaleDateString())

//  console.log(typeof myDate)

// let todayDate = new Date(2026, 0 ,4)  // O/P  2026-01-03

// let todayDate = new Date(2026, 0 ,4, 5, 3)  

// let todayDate = new Date("2026-01-04")   // o/P = 1/4/2026  YYYY-MM-DD
let todayDate = new Date("01-4-2026")
// console.log(todayDate.toLocaleString());

let myTimeStamp = Date.now()

// console.log(myTimeStamp);  o/P =>1767546628093
// console.log(todayDate.getTime()); => 1767465000000  melisecond

// console.log(Math.floor(Date.now()/1000));

let newDat = new Date()

console.log(newDat);

console.log(newDat.getDay())
console.log(newDat.getMonth());

newDat.toLocaleDateString('default',{
    weekday :"long",
    timeZone: ''
})

