// Node tree
function Node(data) {
    this.data = data;
    this.left = null;
    this.right = null;
}

// BST
function BST() {
    this._root = null;
}

// Inserting
BST.prototype.insert = function(data) {
    let node = new Node(data);
    
    // If it's the first node
    if (this._root === null) {
      this._root = node;
      return;
    }
    
    let current = this._root;
    
    while (current) {
      if (data < current.data) {
        if (current.left === null) {
          current.left = node;
          return;
        }
        current = current.left;
      } else if (data > current.data) {
        if (current.right === null) {
          current.right = node;
          return;
        }
        current = current.right;
      } else {
        // Duplicates are not supported
        return;
      }
    }
};

BST.prototype.contains = function(data) {
    let current = this._root;
    
    while (current) {
      if (data === current.data) {
          return true;
      }
      
      if (data < current.data) {
        current = current.left;
      } else {
        current = current.right;
      }
    }
    
    return false;
};

// Pre-Order Traversal
BST.prototype.preOrder = function() {
    let output = [];
    
    function preOrderImpl(node) {
      if (node === null) {
        return;
      }

      output.push(node.data);
  
      preOrderImpl(node.left);

      preOrderImpl(node.right);
    }

    preOrderImpl(this._root);
    
    return output;
};

// In-Order Traversal
BST.prototype.inOrder = function () {
    let output = [];
    
    function preOrderImpl(node) {
      if (node === null) {
        return;
      }

      output.push(node.left);
  
      preOrderImpl(node.data);

      preOrderImpl(node.right);
    }

    preOrderImpl(this._root);
    
    return output;
};

// Post-Order Traversal
BST.prototype.postOrder = function () {
    let output = [];
    
    function preOrderImpl(node) {
      if (node === null) {
        return;
      }

      output.push(node.left);
  
      preOrderImpl(node.right);

      preOrderImpl(node.data);
    }

    preOrderImpl(this._root);
    
    return output;   
};