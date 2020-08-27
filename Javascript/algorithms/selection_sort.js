function selectionSort(array) {
    for (let i = 0; i < array.length; i++) {
       let min = i;
       for (let j = i + 1; j < array.length; j++) { 
          if (array[j] < array[min]) {
             min = j;
          }
       }
       if (i !== min) {
         [array[i], array[min]] = [array[min], array[i]];
       }
     }
   return array;
}


let arr = [6,3,5,2,4,1];

let b = selectionSort(arr);

console.log(b);