import java.util.Scanner;

public class Exam04 {
    public static double exam04() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่คะแนน:");
        double score = scanner.nextDouble();
        
        System.out.println("\nกระบวนการปัดเศษ:");
        System.out.println("คะแนนเดิม: " + score);
        
        // กัดเศษ 2 ตำแหน่ง
        double roundedScore = Math.round(score * 100.0) / 100.0;
        System.out.println("ปัดเศษทศนิยม 2 ตำแหน่ง: " + roundedScore);
        
        // ถ้าเป็นจำนวนเต็ม ให้แสดงเป็นจำนวนเต็ม
        if (roundedScore == Math.floor(roundedScore)) {
            System.out.println("แปลงเป็นจำนวนเต็ม: " + (int)roundedScore);
            return (int)roundedScore;
        }
        
        return roundedScore;
    }
    
    public static int roundUp(double number) {
        System.out.println("\nกระบวนการปัดเศษขึ้น:");
        System.out.println("ตัวเลขเดิม: " + number);
        int result = (int)Math.ceil(number);
        System.out.println("ปัดขึ้นเป็น: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("เลือกฟังก์ชัน (1: ปัดเศษปกติ, 2: ปัดขึ้น):");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            double result = exam04();
            System.out.println("\nคะแนนสุดท้าย: " + result);
        } else {
            System.out.println("กรุณาใส่ตัวเลข:");
            double number = scanner.nextDouble();
            int result = roundUp(number);
            System.out.println("\nผลลัพธ์: " + result);
        }
    }
}
