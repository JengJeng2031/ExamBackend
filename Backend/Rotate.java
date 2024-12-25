import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ตัวเลขที่ต้องการหมุน:");
        String input = kb.nextLine();
        int[] numbers = new int[input.length()];
        
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Character.getNumericValue(input.charAt(i));
        }
        
        System.out.println("กรุณาระบุทิศทาง (L = ซ้าย, R = ขวา):");
        char direction = kb.next().charAt(0);
        
        System.out.println("กรุณาใส่จำนวนครั้งที่ต้องการหมุน:");
        int rotateCount = kb.nextInt();
        
        if (direction == 'R') {
            for (int i = 0; i < rotateCount; i++) {
                int temp = numbers[numbers.length - 1];
                for (int j = numbers.length - 1; j > 0; j--) {
                    numbers[j] = numbers[j - 1];
                }
                numbers[0] = temp;
            }
        } else if (direction == 'L') {
            for (int i = 0; i < rotateCount; i++) {
                int temp = numbers[0];
                for (int j = 0; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                numbers[numbers.length - 1] = temp;
            }
        }
        
        System.out.print("ผลลัพธ์: ");
        for (int num : numbers) {
            System.out.print(num);
        }
        
        kb.close();
    }
}