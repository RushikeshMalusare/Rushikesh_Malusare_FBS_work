// Immediately Invoked function expression(IIFE)

// IIFE means immedialy execute hone vala function or global scope ke polutions se problem hota hai use hatane 
// ke lia hm iska use karte hai

(function txt(){  //txt is named IIFE
    console.log(`DB Connected`);
    
})();  //two IIfE at write kr sakte hai using semicolon

((name) => {  //unnamed IIFE
    console.log(`DB Connected two ${name}`);
    
})('yash') //as a param