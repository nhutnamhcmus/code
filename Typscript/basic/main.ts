function log(message) {
    console.log(message);
}

var message = 'Hello, world.!';

log(message);

// Declare variables
// var number = 1;

// let count = 2;


function doSomething() {
    // for (var i = 0; i < 5; i++)
    for (let i = 0; i < 5; i++){
        console.log(i);
    }

    // console.log('Finally: ' + i);
}

doSomething();

let a: number;
let b: boolean;
let c: string;
let d: any;
let e: number[] = [1, 3, 2, 4, 5];
let f: any[] = [1, true, 'b', false];


const ColorRed = 0;
const ColorGreen = 1;
const ColorBlue = 2;

enum Color {Red, Green, Blue};
let backgroundColor = Color.Blue;

let mess;

mess = 'abc';

let endWithC = (<string>mess).endsWith('c');
let alternativeWay = (mess as string).endsWith('c');



// arrow function
let log_message = function(message) {
    console.log(message);
}

let doLogMessage = (message) => console.log(message);


// custom type
/*
let drawPoint = (x, y) => {
    // do something here
}*/

class Point {
    x: number;
    y: number;
    // draw: (point: Point) => void

    draw() {
        // ...
    }

    getDistance(another: Point){
        // ...
    }
}

let drawpoint = (point: {x: number, y: number}) => {
    // do something here
};


let getDistance = (pointA: Point, pointB: Point) => {
    // do something here
}

drawpoint(
    {
        x: 1,
        y: 2
    }
)