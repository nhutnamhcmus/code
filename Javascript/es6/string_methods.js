const string = 'Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.';

console.log(string.match(/^Imagination/));

console.log(string.startsWith("Imagination"));

console.log(string.startsWith("knowledge"));

const truth = "JavaScript is a really fun language!";

console.log(truth.match(/^JavaScript/));

console.log(truth.startsWith("JavaScript"));

console.log(truth.startsWith("fun"));