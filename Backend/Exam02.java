import java.util.Scanner;

public class Exam02 {
    public static char[] exam02() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ข้อความ:");
        String input = scanner.nextLine();
        
        char[] result = new char[2];  // เก็บผลลัพธ์สูงสุด 2 ตัว
        int maxCount = 1;             // จำนวนที่ซ้ำมากที่สุด
        int currentCount = 1;         // ตัวนับปัจจุบัน
        int resultCount = 0;          // จำนวนตัวอักษรในผลลัพธ์
        
        System.out.println("\nกระบวนการนับ:");
        
        // วนลูปตรวจสอบทีละตัวอักษร
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i-1)) {
                currentCount++;
                System.out.println("พบ '" + input.charAt(i) + "' ซ้ำ " + currentCount + " ครั้ง");
            } else {
                // เมื่อเจอตัวอักษรที่ไม่เหมือนกัน
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    resultCount = 1;
                    result[0] = input.charAt(i-1);
                    System.out.println("พบตัวที่ซ้ำมากที่สุดใหม่: '" + result[0] + "' ซ้ำ " + maxCount + " ครั้ง");
                } else if (currentCount == maxCount) {
                    if (resultCount < 2) {
                        result[resultCount] = input.charAt(i-1);
                        resultCount++;
                        System.out.println("พบตัวที่ซ้ำมากที่สุดเท่ากัน: '" + input.charAt(i-1) + "' ซ้ำ " + maxCount + " ครั้ง");
                    }
                }
                currentCount = 1;
            }
        }
        
        // ตรวจสอบคัวสุดท้าย
        if (currentCount > maxCount) {
            maxCount = currentCount;
            resultCount = 1;
            result[0] = input.charAt(input.length()-1);
            System.out.println("พบตัวที่ซ้ำมากที่สุดใหม่: '" + result[0] + "' ซ้ำ " + maxCount + " ครั้ง");
        } else if (currentCount == maxCount && resultCount < 2) {
            result[resultCount] = input.charAt(input.length()-1);
            resultCount++;
            System.out.println("พบตัวที่ซ้ำมากที่สุดเท่ากัน: '" + input.charAt(input.length()-1) + "' ซ้ำ " + maxCount + " ครั้ง");
        }
        
        // สร้าง array ผลลัพธ์ขนาดที่เหมาะสม
        char[] finalResult = new char[resultCount];
        for (int i = 0; i < resultCount; i++) {
            finalResult[i] = result[i];
        }
        
        return finalResult;
    }

    public static void main(String[] args) {
        char[] result = exam02();
        System.out.print("\nผลลัพธ์: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
