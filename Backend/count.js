const readline = require("readline");

// Create an interface for reading input from the terminal
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// Ask the user to enter numbers
rl.question("Enter numbers separated by spaces: ", (input) => {
  // Convert input into an array of integers
  const numbers = input.split(" ").map(Number);

  // Step 2: Find unique numbers and their frequencies
  const uniqueNumbers = [];
  const frequencies = [];

  numbers.forEach((num) => {
    const index = uniqueNumbers.indexOf(num); // Check if the number already exists
    if (index === -1) {
      // If not found, add to uniqueNumbers and set its frequency to 1
      uniqueNumbers.push(num);
      frequencies.push(1);
    } else {
      // If found, increment its frequency
      frequencies[index]++;
    }
  });

  // Step 3: Sort unique numbers by frequency in descending order
  for (let i = 0; i < frequencies.length - 1; i++) {
    for (let j = i + 1; j < frequencies.length; j++) {
      if (frequencies[i] < frequencies[j]) {
        // Swap frequencies
        const tempFreq = frequencies[i];
        frequencies[i] = frequencies[j];
        frequencies[j] = tempFreq;

        // Swap corresponding numbers
        const tempNum = uniqueNumbers[i];
        uniqueNumbers[i] = uniqueNumbers[j];
        uniqueNumbers[j] = tempNum;
      }
    }
  }

  // Step 4: Display the top 1, 2, and 3 numbers by frequency
  console.log("Top elements by frequency:");
  for (let i = 0; i < Math.min(3, uniqueNumbers.length); i++) {
    console.log(`${i + 1}. Number: ${uniqueNumbers[i]}, Frequency: ${frequencies[i]}`);
  }

  rl.close();
});
