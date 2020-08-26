// Utils
function show(object){
    console.log(object);
}
// Initializing the array
var myNumberArray = [1, 2, 3, 4, 5];

let myGirlFriendsArray = [];

let topics = [];

// Adding elements to an existing array
topics.push("Array");
topics.push("Stack");

console.log("Show the topics: ");
show(topics);

// Length of the array
console.log('We have some topics for today. Just ' +  topics.length + ' topics');

// Accessing Array Elements
for (let i = 0; i < topics.length; i++) {
    console.log(topics[i]);
}

// The 'new' Array Syntax
var primes = new Array(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
show(primes);

// Removing elements from an array
var tutorials = ['Arrays', 'Stacks', 'Queues'];
console.log('Before Splice: ' + tutorials);
tutorials.splice(1,1);
console.log('After Splice: ' + tutorials);