function Node(data) {
    this.data = data;
    this.next = null;
}
  
function LinkedList() {
    this._length = 0;
    this._head = null;
}

LinkedList.prototype.size = function () { return this._length; };

LinkedList.prototype.push = function(data) {
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

LinkedList.prototype.itemAt = function(index) {
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

LinkedList.prototype.remove = function(index) {
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

LinkedList.prototype.search = function(data) {
    
};