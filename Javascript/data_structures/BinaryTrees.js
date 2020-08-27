function Node(data) {
    this.data = data;
    this.left = null;
    this.right = null;
}

class Tree {
    constructor() {
        this.root = null;
    }

    addNode(data) {
        const newNode = new Node(data);
        if (!this.root) {
            this.root = newNode;
        } else {
            this.insertNode(this.root, newNode);
        }
    }

    insertNode(node, newNode) {
        if (newNode.data < node.data) {
            if (!node.left) {
                node.left = newNode;
            } else {
                this.insertNode(node.left, newNode);
            }
        } else {
            if (!node.right) {
                node.right = newNode;
            } else {
                this.insertNode(node.right, newNode);
            }
        }
    }

    remove(data) {
        this.root = this.removeNode(this.root, data);
    }

    removeNode(node, data) {
        if (!node) {
            return null;
        }
        if (data < node.data) {
            node.left = this.removeNode(node.left, data);
            return node;
        } else if (data > node.data) {
            node.right = this.removeNode(node.right, data);
            return node;
        } else {
            if (!node.left && !node.right) {
                node = null;
                return node;
            }
            if (!node.left) {
                node = node.right;
                return node;
            }
            if (!node.right) {
                node = node.left;
                return node;
            }

            let min = this.findMinNode(node.right);
            node.data = min.data;
            node.right = this.removeNode(node.right, min.data);
            return node;
        }
    }

    inOrder(node) {
        if (node) {
            this.inOrder(node.left);
            console.log(node.data);
            this.inOrder(node.right);
        }
    }

    preOrder(node) {
        if (node) {
            console.log(node.data);
            this.preOrder(node.left);
            this.preOrder(node.right);
        }
    }

    postOrder(node) {
        if (node) {
            this.postOrder(node.left);
            this.postOrder(node.right);
            console.log(node.data);
        }
    }

    DFS() {

    }

    BFS() {

    }
}