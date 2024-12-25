function findMissingNumber(arr, n) {
    const expectedSum = (n * (n + 1)) / 2;
    console.log(expectedSum);
    const actualSum = arr.reduce((acc, num) => acc + num, 0);
    console.log(actualSum);
    return expectedSum - actualSum;
}

const arr = [1, 2, 4, 5, 6];
const n = arr.length+1;
console.log(findMissingNumber(arr, n)); 
