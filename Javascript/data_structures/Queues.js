// Define 
function Queue() {
    this._head = 0;
    this._data = []; 
}

// isEmpty
Queue.prototype.isEmpty = function() { return this._data === undefined || this._data.length == 0; };

// getSize
Queue.prototype.size = function() { return this._data.length; };

// Enqueue
Queue.prototype.enqueue = function(data) { this._data.push(data); };

// Dequeue
Queue.prototype.dequeue = function() {
    if (this._head < 0 || 
        this._head >= this._data.length) {
      return null;
    }
    
    var dequeuedItem = this._data[this._head];
    this._head++;
    
    return dequeuedItem;
};

// Peek
Queue.prototype.peek = function() {
    if (this._head < 0 || 
        this._head >= this._data.length) {
      return null;
    }
    
    return this._data[this._head];
};

let queue = new Queue();


class _Queue {
  constructor() {
    this.queue = [];
  }

  enqueue(data) { this.queue.push(data); }

  dequeue() { this.queue.shift(); }

  isEmpty() { return this.queue === undefined || this.queue.length == 0; }

  size() { return this.queue.length; }
}
