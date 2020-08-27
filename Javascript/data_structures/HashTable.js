function HashTable() {
  this._bucketSize = 256;
  this._buckets = [];
  this._buckets.length = this._bucketSize;
}

HashTable.prototype.computeHash = function (key) {
  let total = 0;
  for (let i = 0; i < data.length; ++i) {
    total += data.charCodeAt(i);
  }

  return total % this._bucketSize;
};

HashTable.prototype.put = function (key, value) {
  let hash = this.computeHash(key);

  if (this._buckets[hash] != undefined) {
    throw 'We are not handling collisions yet';
  }
  this._buckets[hash] = value;
};

// Collision Resolution in Hash Table
// Resolution 01: Separate Chaining
HashTable.prototype.sc_put = function (key, value) {
  let keyType = typeof (key);
  if (keyType !== 'string' && keyType !== 'number') {
    throw 'Only string or number keys are supported.';
  }

  let hash = this.computeHash(key);

  if (this._buckets[hash] === undefined) {
    this._buckets[hash] = {};
  }

  let chain = this._buckets[hash];

  if (chain.hasOwnProperty(key)) {
    throw 'Duplicate key is not allowed.';
  }

  chain[key] = value;
};

HashTable.prototype.sc_get = function (key) {
  let keyType = typeof (key);
  if (keyType !== 'string' && keyType !== 'number') {
    return undefined;
  }

  let hash = this.computeHash(key);

  if (this._buckets[hash] === undefined) {
    return undefined;
  }

  let chain = this._buckets[hash];

  if (chain.hasOwnProperty(key)) {
    return chain[key];
  }

  return undefined;
};

// Resolution 02: Open Addressing
HashTable.prototype.oa_put = function (key, value) {
  let keyType = typeof (key);
  if (keyType !== 'string' && keyType !== 'number') {
    throw 'Only string or number keys are supported';
  }

  let hash = this.computeHash(key);

  if (this._buckets[hash] === undefined) {
    // Yay No collision found
    this._buckets[hash] = {};
    this._buckets[hash][key] = value;
    return;
  } else if (this._buckets[hash].hasOwnProperty(key)) {
    // Duplicate Key
    throw 'Duplicate Key is not allowed';
  }

  // Collision found.
  // Let's probe for the next available slot
  let bucketId = hash + 1;

  do {
    if (bucketId >= this._bucketSize) {
      // Reached the end. 
      // Start from the beginning
      bucketId = 0;
    }

    if (this._buckets[bucketId] === undefined) {
      // Found an empty slot
      this._buckets[bucketId] = {};
      this._buckets[bucketId][key] = value;
      return;
    }

    bucketId++;
  } while (bucketId != hash);

  // Couldn't find any free slots.
  throw 'Hash Table is full. Rehashing needed.';
};

HashTable.prototype.oa_get = function (key) {
  let keyType = typeof (key);
  if (keyType !== 'string' && keyType !== 'number') {
    return undefined;
  }

  let hash = this.computeHash(key);

  if (this._buckets[hash] === undefined) {
    return undefined;
  } else if (this._buckets[hash].hasOwnProperty(key)) {
    // Key found. Return value
    return this._buckets[hash][key];
  }

  // Possible Collision.
  // Iterate through the table using the 
  // probing sequence used by the put function
  let bucketId = hash + 1;

  do {
    if (bucketId >= this._bucketSize) {
      // Reached the end. 
      // Start from the beginning
      bucketId = 0;
    }

    if (this._buckets[bucketId] === undefined) {
      // Found an empty slot
      return undefined;
    } else if (this._bucekts[bucketId].hasOwnProperty(key)) {
      // Key found. Return value
      return this._buckets[hash][key];
    }

    bucketId++;
  } while (bucketId != hash);

  // Couldn't find the key and exhausted the
  // whole hash table.
  return undefined;
};

class _HashTable {
  constructor() {
    this.values = {};
    this.length = 0;
    this.size = 0;
  }

  computeHash(key) { return key.toString().length % this.size; }

  add(key, value) {
    const hash = this.computeHash(key);
    if (!this.values.hasOwnProperty(hash)) {
      this.values[hash] = {};
    }
    if (!this.values[hash].hasOwnProperty(key)) {
      this.length++;
    }
    this.values[hash][key] = value;
  }

  search(key) {
    const hash = this.computeHash(key);
    if (this.values.hasOwnProperty(hash) && this.values[hash].hasOwnProperty(key)) {
      return this.values[hash][key];
    } else {
      return null;
    }
  }
}