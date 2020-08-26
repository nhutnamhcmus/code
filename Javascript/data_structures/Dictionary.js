// Define
function Dictionary() {
    this._data = {};
    this._length = 0;
}

// get size
Dictionary.prototype.size = function () { return Object.keys(this._data).length; };

// Adding
Dictionary.prototype.add = function(key, value) {
    var keyType = typeof(key);
    
    if (keyType !== 'string'  && keyType !== 'number') {
      throw 'Key type can only be string or a number.';
    }
    
    if (this._data.hasOwnProperty(key)) {
      throw 'Duplicate keys are not supported.';
    }
    
    this._data[key] = value;
    this._length++;
};

// Looking
Dictionary.prototype.find = function(key) {
    if (key === null) {
      return undefined;
    }
    
    var keyType = typeof(key);
    if (keyType !== 'string'  && keyType !== 'number') {
      return undefined;
    }
    
    if (this._data.hasOwnProperty(key)) {
      return this._data[key];
    }
    
    return undefined;
};

// Removing
Dictionary.prototype.remove = function(key) {
    if (this._data.hasOwnProperty(key)) { 
        delete this._data[key];
        this._length--;
    }
};
