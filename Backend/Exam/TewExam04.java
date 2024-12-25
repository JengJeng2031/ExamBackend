import java.util.Scanner;

public class TewExam04 {
    public static int exam04() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่คะแนน:");
        int score = scanner.nextInt();
        
        System.out.println("\nกระบวนการปัดเศษ:");
        System.out.println("คะแนนเดิม: " + score);
        
        // กาเลขถัดไปที่หารด้วย 5 ลงตัว
        int nextMultipleOf5 = ((score + 4) / 5) * 5;
        
        System.out.println("เลขถัดไปที่หารด้วย 5 ลงตัว: " + nextMultipleOf5);
        System.out.println("ผัดขึ้นเป็น: " + nextMultipleOf5);
        
        return nextMultipleOf5;
    }

    public static void main(String[] args) {
        int result = exam04();
        System.out.println("\nคะแนนสุดท้าย: " + result);
    }
}
