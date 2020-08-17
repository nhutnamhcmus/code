// this function will add two number x and y
function add(x, y){
    return x + y;
}

// test add function
console.log(add(2, 3)); // Output: 5

console.log(add(0.1, 0.2)); // Output: 0.30000000000000004

// imperative function
function _sum(i){
    let result = 0;
    for(let count = 0; count <= i; ++count){
        result += count;
    }
    return result;
}

// test _sum function
console.log(_sum(10));

function sum(number) {
    return number <= 0 ? 0 : number + sum(number - 1);
}

// test sum function
console.log(sum(10));

function _add(a) {
    return function(b){
        return a + b;
    };
}

console.log(_add (2) (2));


let pair = (first) => (second) => {
    return {
        first: first,
        second: second
    };
};

console.log(pair (10) (20));

let fst = (p) => p.first;

let nd = (p) => p.second;

console.log(fst (pair (69) (96)));
console.log(nd (pair (69) (96)));

console.log(pair (3) (pair (2) (pair (1) (null))));

let ecc = pair (3) (pair (2) (pair (1) (null)));

console.log(fst (ecc));

console.log(nd (ecc));

let head = fst;
let tail = nd;

function listToArray(list){
    let result = [];

    while (list != null){
        result.push(head(list));
        list = tail(list);
    }
    return result;
}

console.log(listToArray(ecc));


function arrayToList(array){
    let result = null;

    array = Array.from(array).reverse();

    for (let i = 0; i < array.length; ++i){
        result = pair (array[i]) (result);
    }

    return result;
}

console.log(arrayToList([1, 2, 3]));


let range = (low) => (high) => low > high ? null : pair (low) (range (low + 1) (high));

console.log(range (1) (3));

let map = (f) => (xs) => xs == null ? null : pair (f (head(xs))) (map (f) (tail(xs)));

console.log(listToArray(map ((x) => x * x) (range (1) (10))));

let fizzbuzz = (n) => ((n % 3 == 0 ? 'fizz' : '') + (n % 5 ? 'buzz' : '')) || n;

console.log(listToArray(map (fizzbuzz) (range (1) (100))));