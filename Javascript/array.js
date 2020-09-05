// forEach method
const numbers = [1, 2, 15, 4, 5, 6, 7];

numbers.forEach((item, index, array) => {
    console.log('a[' + index + '] = ' + item);
});


let sum = (array) => {
   var result = 0;
   array.forEach((item) => {
        result += item;
   });
   return result;
};

console.log(sum(numbers));


const letters = ['a', 'a', 'b', 'c', 'b', 'd', 'e'];

let counting_letter = (array) => {
    var count = {};
    array.forEach((item) => {
        if(count[item]){
            count[item]++;
        } else {
            count[item] = 1;
        }
    });
    return count;
};

console.log(counting_letter(letters));
console.log(counting_letter(numbers));

// map
let double_value = (array) => {
    return array.map((item, index, arr) => {
        return item * 2;
    });
};

console.log(double_value(numbers));

const products = [
    {
        name: 'laptop',
        price: 3000,
        count: 5
    }, 
    {
        name: 'desktop',
        price: 4000,
        count: 4
    },
    {
        name: 'phone',
        price: 1200,
        count: 10
    }
];

let total_products = (array) => { return array.map(item => item.price * item.count);};

console.log(total_products(products));