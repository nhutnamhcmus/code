// Define 
function Set() {
    this.set = {};
    this.size = 0;
}

// isEmpty

// size
Set.prototype.sizeOfSet = function() { return Object.keys(this.set).length; };

// adding
Set.prototype.add = function(data) {
    if (!(this.set.hasOwnProperty(data))) {
      this.set[data] = 'true';
      this.size++;
    }
};

// removing
Set.prototype.remove = function(data) {
    if (this.set.hasOwnProperty(data)) {
      delete this.set[data];
      this.size--;
    }
};

// membership
Set.prototype.member = function(data) { return this.set.hasOwnProperty(data) ? true : false; };

// union of two sets
Set.prototype.union = function(secondset) {
    let unionset = new Set();
    for (let key in this.set) {
      if (this.set.hasOwnProperty(key)) {
        unionset.add(key);
      }
    }
    for (let key in secondset.set) {
      if (!unionset.set.hasOwnProperty(key)) {
        unionset.add(key);
      }
    }
    return unionset;
};


// intersection of two sets
Set.prototype.intersect = function(secondset) {
    let inter = new Set();
    for (let key in this.set) {
      if (secondset.set.hasOwnProperty(key)) {
        inter.add(key);
      }
    }
    return inter;
};

//  different two sets
Set.prototype.difference = function(secondset) {
    let diff = new Set();
    for (let key in this.set) {
        if (!secondset.set.hasOwnProperty(key)) {
            diff.add(key);
        }
    }
    return diff;
};


let A = new Set();
A.add(1);
A.add(2);
A.add(3);
A.add(4);
A.add(5);


let B = new Set();
B.add(3);
B.add(4);
B.add(5);
B.add(6);
B.add(7);

let C = A.difference(B);
console.log(C);