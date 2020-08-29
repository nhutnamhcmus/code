function radixSort(array) {
    const max = Math.max(...array).toString().length;
    let digitBuckets = [];
    let index = 0;
    for (let i = 0; i < max + 1; i++) {
        digitBuckets = [];
        for (let j = 0; j < array.length; j++) {
            const digit = getDigit(array[j], i + 1);
            digitBuckets[digit] = digitBuckets[digit] || [];
            digitBuckets[digit].push(array[j]);
        }

        index = 0;
        for (let t = 0; t < digitBuckets.length; t++) {
            if (digitBuckets[t] && digitBuckets[t].length > 0) {
                for (let m = 0; m < digitBuckets[t].length; m++) {
                    array[idx++] = digitBuckets[t][m];
                }
            }
        }
    }
    return array;
}