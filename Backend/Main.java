import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input numbers
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();

        // Convert input to an array of integers
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Step 2: Find the unique numbers and their frequencies
        int[] uniqueNumbers = new int[numbers.length];
        int[] frequencies = new int[numbers.length];
        int uniqueCount = 0;

        for (int num : numbers) {
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNumbers[j] == num) {
                    frequencies[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueNumbers[uniqueCount] = num;
                frequencies[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Step 3: Sort unique numbers by frequency (descending)
        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (frequencies[i] < frequencies[j]) {
                    // Swap frequencies
                    int tempFreq = frequencies[i];
                    frequencies[i] = frequencies[j];
                    frequencies[j] = tempFreq;

                    // Swap corresponding numbers
                    int tempNum = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = tempNum;
                }
            }
        }

        // Step 4: Print the top 1, 2, and 3 numbers by frequency
        System.out.println("Top elements by frequency:");
        for (int i = 0; i < Math.min(3, uniqueCount); i++) {
            System.out.println((i + 1) + ". Number: " + uniqueNumbers[i] + ", Frequency: " + frequencies[i]);
        }

        scanner.close();
    }
