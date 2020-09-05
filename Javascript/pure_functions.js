const add = (x, y) => x + y;
console.log(add(2, 3));

let sum = (x) => (y) => { return x + y; };

console.log(sum (2) (3));


const impureDouble = (x) => {
    console.log('doubling', x);
    
    return x * 2;
  };
  
  const result = impureDouble(4);
  
  console.log({ result });


