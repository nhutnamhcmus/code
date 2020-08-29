
// Define const string
const string = 'Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.';
const truth = "JavaScript is a really fun language!";

// .startsWith method (String.prototype.startsWith)
console.log(string.match(/^Imagination/));

console.log(string.startsWith("Imagination"));

console.log(string.startsWith("knowledge"));

console.log(truth.match(/^JavaScript/));

console.log(truth.startsWith("JavaScript"));

console.log(truth.startsWith("fun"));

// .endsWith method (String.prototype.endsWith)
console.log(truth.endsWith('language!'));
console.log(string.endsWith('world.'));

// .includes method (String.prototype.includes)
console.log(truth.match(/fun/g));
console.log(string.includes(/Knowledge/g));

console.log(truth.includes('fun'));
console.log(truth.includes('go'));

console.log(truth.includes('J'));
console.log(truth.includes('J', 10));

// .repeat method (String.prototype.repeat)

// Unicode

// Regex