var data = [];
var maxData;
var maxValue;


function setup() {
    createCanvas(800, 800);
    angleMode(DEGREES);
    rectMode(BOTTOM);
    for (var i = 0; i < 100; i = i + 1) {
        var randomNumber = random(20, 80);
        data.push(randomNumber);
    }
    maxData = max(data);
}

function draw() {
    background(43, 53, 63);
    fill(139, 171, 203);
    stroke(89, 86, 74);

    var angleSeparation = 360 / data.length;
    var padding = 10;

    if (frameCount <= 400) {
        maxValue = constrain(frameCount * 2, 0, 400);
    } else {
        maxValue = 400;
    }
    var offset = 200;
    var dataMultiplier = (height / 2 - offset - padding) / maxData;


    for (var i = 0; i < data.length; i = i + 1) {
        push();
        var currentData = data[i];
        var finalHeight = currentData * dataMultiplier;
        var animatedHeight = map(maxValue, 0, 400, 0, finalHeight);
        translate(width / 2, height / 2);
        rotate(angleSeparation * i);
        rect(0, offset, angleSeparation * 2, animatedHeight);
        text(Math.floor(currentData), offset - 20, 0);
        pop();
    }


}