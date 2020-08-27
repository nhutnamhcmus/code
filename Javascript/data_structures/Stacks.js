// Stack time complexity
// Get, Search: average case O(n)
// Insertion, Deletion: average case O(1)
// Space: O(n)

// Define 
function Stack() {
    this._top = -1;
    this._values = [];
}

// is empty
Stack.prototype.isEmpty = function() {
    return (this._values === undefined || this._values.length == 0);
};

// get size
Stack.prototype.size = function() {
    return this._values.length;
};

// Pushing
Stack.prototype.push = function(data) {
    this._top++;
    this._values[this._top] = data;
};


// Popping
Stack.prototype.pop = function() {
    if (this._top < 0) {
      return null;
    }
    
    var topElement = this._values[this._top];
    this._top--;
    this._values.length--;
  
    return topElement;
};

// Peeking
Stack.prototype.peek = function() {
    if (this._top < 0) {
      return null;
    }
    
    return this._values[this._top];
};


let stack = new Stack();

for (let i = 0; i <= 10; i++) {
  console.log('Pushing on stack: ' + i); 
  stack.push(i);
}

console.log('Top of the stack using Peek: ' + stack.peek());
console.log('Pop from stack. Popped element = ' + stack.pop());
console.log('Pop from stack. Popped element = ' + stack.pop());


class _Stack {
  constructor() {
    this.stack = [];
  }

  push(data) { this.stack.push(data); }

  pop() { this.stack.pop(); }

  isEmpty() {return this.stack === undefined || this.stack.length == 0; }

  size() { return this.stack.length; }
}

let myStack = new _Stack();
myStack.push(1);
console.log(myStack.size());