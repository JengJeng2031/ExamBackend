function sumOfDigits(input) {
    // Split the input string into an array of numbers
    const digits = input.split(" ").map(Number);

    // Calculate the sum of all numbers
    const totalSum = digits.reduce((sum, num) => sum + num, 0);

    return totalSum;
}

// Example usage
const input = "1 2 3 4"; // Digits separated by spaces
console.log(sumOfDigits(input)); // Output: 10
