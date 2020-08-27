function Graph() {
  this._vertices = {};
  this._vertexCount = 0;
}

// Adding a Vertex
Graph.prototype.addVertex = function (v) {
  let vertexType = typeof (v);

  if (vertexType != 'number' &&
    vertexType != 'string') {
    throw 'Vertex can only be a string or number.';
  }

  if (this._vertices.hasOwnProperty(v)) {
    throw 'Duplicate Vertex is not allowed.';
  }

  this._vertices[v] = {};
  this._vertexCount++;
};

// Adding Edges
Graph.prototype.addEdges = function (v, edges) {
  if (!this._vertices.hasOwnProperty(v)) {
    throw 'Vertex not found.';
  }

  let edgesObj = this._vertices[v];

  for (let i = 0; i < edges.length; i++) {
    var edge = edges[i];

    if (this._vertices.hasOwnProperty(v)) {
      throw 'Invalid vertex cannot be added as edge.';
    }

    edgesObj[edge] = true;
  }
};

// Getters for Vertices
Graph.prototype.getVertices = function () {
  let vertices = [];
  for (let v in this._vertices) {
    vertices.push(v);
  }

  return vertices;
};

// Getters for Edges
Graph.prototype.getEdges = function (v) {
  if (!this._vertices.hasOwnProperty(v)) {
    throw 'Vertex not found.';
  }

  let edgesObj = this._vertices[v];
  let edges = [];

  for (let e in edgesObj) {
    edges.push(e);
  }

  return edges;
};

// Depth First Search
let DFS = function (graph) {
  let vertices = graph.getVertices();
  if (vertices.length === 0) {
    return;
  }

  // Mark all vertices as NOT VISITED at start
  let visited = {};
  for (let i = 0; i < vertices.length; i++) {
    visited[vertices[i]] = false;
  }

  // Define our DFS impl method
  function DFSImpl(v) {
    visited[v] = true;
    console.log('Visiting Vertex: ' + v);

    let edges = graph.getEdges(v);
    for (let j = 0; j < edges.length; j++) {
      let edge = edges[j];
      if (!visited[edge]) {
        DFSImpl(edge);
      }
    }
  }

  // Start DFS
  for (let i = 0; i < vertices.length; i++) {
    let vertex = vertices[i];
    if (!visited[vertex]) {
      DFSImpl(vertex);
    }
  }
};

// Breadth First Search
let BFS = function (graph) {
  let vertices = graph.getVertices();
  if (vertices.length === 0) {
    return;
  }

  // Mark all vertices as NOT VISITED at start
  let visited = {};
  for (let i = 0; i < vertices.length; i++) {
    visited[vertices[i]] = false;
  }

  let queue = [];
  let startV = vertices[0];
  queue.push(startV);
  visited[startV] = true;

  while (queue.length > 0) {
    let v = queue.shift();
    console.log('Visited: ' + v);
    let edges = graph.getEdges(v);

    for (let i = 0; i < edges.length; i++) {
      let e = edges[i];
      if (!visited[e]) {
        queue.push(e);
        visited[e] = true;
      }
    }
  }
};

class _Graph {
  constructor() {
    this.numberOfVertices = 0;
    this.adjList = new Map();
  }

  addVertex(vertex) {
    this.adjList.set(vertex, []);
    this.numberOfVertices++;
  }

  addEdge(vertex1, vertex2) {
    this.adjList.get(vertex1).push(vertex2);
    this.adjList.get(vertex2).push(vertex1);
  }

  print() {
    const keys = this.adjList.keys();
    for (let i of keys) {
      const values = this.adjList.get(i);
      let value = "";
      for (let j of values) {
        value += j + " ";
      }
      console.log(`${i} => ${value}`);
    }
  }
}