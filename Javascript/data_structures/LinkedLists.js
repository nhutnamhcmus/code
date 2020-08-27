function Node(data) {
  this.data = data;
  this.next = null;
}

function LinkedList() {
  this._length = 0;
  this._head = null;
}

LinkedList.prototype.size = function () { return this._length; };

LinkedList.prototype.push = function (data) {
  let node = new Node(data);

  // We are inserting the first node in the list
  if (this._head === null) {
    this._head = node;
  } else {
    // Find the last node
    let current = this._head;

    while (current.next) {
      current = current.next;
    }

    current.next = node;
  }

  // Increment the length
  this._length++;
};

LinkedList.prototype.itemAt = function (index) {
  // Ensure that the index is within bounds
  if (index < 0 || index >= this._length) {
    // Return Null when index is out of bounds
    return null;
  }

  let current = this._head;
  let counter = 0;

  while (counter < index) {
    current = current.next;
    counter++;
  }

  return current.data;
};

LinkedList.prototype.remove = function (index) {
  if (index < 0 || index >= this._length) {
    return null;
  }

  let current = this._head;

  if (index === 0) {
    // Special case for removing the head node.
    this._head = current.next;
  } else {
    // Track previous element
    let previous = null;
    let counter = 0;

    while (counter < index) {
      previous = current;
      current = current.next;
      counter++;
    }

    // Set previous node's next
    // to the node after the deleted node
    previous.next = current.next;
  }

  this._length--;
  return current.data;
};

LinkedList.prototype.search = function (data) {

};


class SinglyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
  }

  addNode(data) {
    const node = new Node(data);
    if (!this.head) {
      this.tail = node;
      this.head = node;
    } else {
      this.tail.next = node;
      this.tail = node;
    }
  }

  insertAfter(data, toNodeData) {
    let current = this.head;
    while (current) {
      if (current.data === toNodeData) {
        const node = new Node(data);
        if (current === this.tail) {
          this.tail.next = node;
          this.tail = node;
        } else {
          node.next = current.next;
          current.next = node;
          break;
        }
      }
      current = current.next;
    }
  }

  removeNode(data) {
    let previous = this.head;
    let current = this.head;
    while (current) {
      if (current.data === data) {
        if (current === this.head) {
          this.head = this.head.next;
        }
        if (current === this.tail) {
          this.tail = previous;
        }
        previous.next = current.next;
      } else {
        previous = current;
      }
      current = current.next;
    }
  }
}

function _node(data) {
  this.data = data;
  this.next = null;
  this.previous = null;
}

class DoublyLinkedList {
  constructor() {
    this.head = null; 
    this.tail = null; 
    this.length = 0; 
  }

  addNode(data) {
    const node = new _node(data);
    if (!this.head) {
      this.tail = node;
      this.head = node;
    } else {
      node.previous = this.tail;
      this.tail.next = node;
      this.tail = node;
    }
    this.length++;
  }

  insertAfter(data, toNodeData) {
    let current = this.head;
    while (current) {
      if (current.data === toNodeData) {
        const node = new _node(data);
        if (current === this.tail) {
          this.addNode(data);
        } else {
          current.next.previous = node;
          node.previous = current; 
          node.next = current.next;
          current.next = node;
          this.length++;
        }
      }
      current = current.next;
    }
  }

  removeNode(data) {
    let current = this.head;
    while (current) {
      if (current.data === data) {
        if (current === this.head && current === this.tail) {
          this.head = null;
          this.tail = null;
        } else if (current === this.head) {
          this.head = this.head.next;
          this.head.previous = null;
        } else if (current === this.tail) {
          this.tail = this.tail.previous;
          this.tail.next = null;
        } else {
          current.previous.next = current.next;
          current.next.previous = current.previous;
        }
        this.length--;
      }
      current = current.next;
    }
  }
}