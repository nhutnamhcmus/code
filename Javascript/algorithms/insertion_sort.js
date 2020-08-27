function insertionSort(array) {
    for (let i = 0; i < array.length; i++) {
      let temp = array[i];
      let j = i - 1;
      while (j >= 0 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;
     }
   return array;
}


let arr = [6,3,5,2,4,1];

let b = insertionSort(arr);

console.log(b);