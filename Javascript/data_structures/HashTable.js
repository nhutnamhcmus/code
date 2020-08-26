function HashTable() {
    this._bucketSize = 23;
    this._buckets = [];
    this._buckets.length = this._bucketSize;
}

HashTable.prototype.computeHash = function(key) {

};

HashTable.prototype.put = function(key, value) {

};

// Collision Resolution in Hash Table
// Resolution 01: Separate Chaining
// Resolution 02: Open Addressing