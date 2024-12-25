import java.util.Scanner;

public class Exam04 {
    public static int exam04() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่คะแนน:");
        int score = scanner.nextInt();
        
        System.out.println("\nกระบวนการปัดเศษ:");
        System.out.println("คะแนนเดิม: " + score);
        
        // กฎการปัดเศษ
        if (score < 38) {
            System.out.println("คะแนนน้อยกว่า 38 ไม่ต้องปัดเศษ");
            return score;
        }
        
        // หาเลขถัดไปที่หารด้วย 5 ลงตัว
        int nextMultipleOf5 = ((score + 4) / 5) * 5;
        
        System.out.println("เลขถัดไปที่หารด้วย 5 ลงตัว: " + nextMultipleOf5);
        System.out.println("ผลต่าง: " + (nextMultipleOf5 - score));
        
        // ถ้าผลต่างน้อยกว่า 3 ให้ปัดขึ้น
        if (nextMultipleOf5 - score < 3) {
            System.out.println("ผลต่างน้อยกว่า 3 ปัดขึ้นเป็น: " + nextMultipleOf5);
            return nextMultipleOf5;
        } else {
            System.out.println("ผลต่างมากกว่าหรือเท่ากับ 3 ไม่ต้องปัดเศษ");
            return score;
        }
    }

    public static void main(String[] args) {
        int result = exam04();
        System.out.println("\nคะแนนสุดท้าย: " + result);
    }
}
