function bucketSort(array) {
    const n = array.length;
    const allBuckets = new Array(n);
    const sortedArray = [];

    if (n < 2) return array;

    for (let i = 0; i < n; i++) {
        allBuckets[i] = [];
    }

    for (let i = 0; i < n; i++) {
        const index = Math.floor(n * array[i] / 10);
        allBuckets[index].push(array[i]);
    };

    allBuckets.forEach(bucket => {
        insertionSort(bucket);
        bucket.forEach(element => sortedArray.push(element))
    });

    return sortedArray;
}