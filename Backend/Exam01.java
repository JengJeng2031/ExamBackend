import java.util.Scanner;

public class Exam01 {
    public static int exam01() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ข้อความ:");
        String input = scanner.nextLine();
        
        int sum = 0;
        System.out.print("กระบวนการคำนวณ: ");
        
        // วนลูปทีละตัวอักษรในข้อความ
        for (int i = 0; i < input.length(); i++) {
            // ตรวจสอบว่าเป็นตัวเลขหรือไม่
            if (Character.isDigit(input.charAt(i))) {
                // แปดงกระบวนการคำนวณ
                System.out.println(Character.isDigit(input.charAt(i)));
                System.out.print(input.charAt(i));
                
                // แปลงตัวอักษรเป็นตัวเลขและบวกเข้ากับผลรวม
                sum += Character.getNumericValue(input.charAt(i));
            }
        }
        
        System.out.println(" = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        exam01();
    }
}
