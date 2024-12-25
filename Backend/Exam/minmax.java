import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        
        // รับค่าตัวเลขเข้า array
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // หาค่า min และ max
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // แสดงผลลัพธ์
        System.out.println("{ min: " + min + ", max: " + max + " }");
        
        scanner.close();
    }
}
