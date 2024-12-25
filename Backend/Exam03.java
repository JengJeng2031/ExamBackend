/**
 * ID: 65160089
 * NAME: Jirachart Kongwaja
 * TEAM: 2
 */
import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {
    public static int[] exam03() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่จำนวนตัวเลข:");
        int count = scanner.nextInt();
        int[] num = new int[count];
        
        System.out.println("กรุณาใส่ตัวเลข " + count + " จำนวน:");
        for (int i = 0; i < count; i++) {
            num[i] = scanner.nextInt();
        }
        
        System.out.println("กรุณาระบุวิธีการเรียง (ASC หรือ DESC):");
        String type = scanner.next();
        
        if (type.equals("ASC")) {
            Arrays.sort(num);
        } 
        else if (type.equals("DESC")) {
            Arrays.sort(num);
            for (int i = 0; i < num.length/2; i++) {
                int temp = num[i];
                num[i] = num[num.length - i - 1];
                num[num.length - i - 1] = temp;
            }
        }
        
        return num;
    }

    public static void main(String[] args) {
        int[] result = exam03();
        System.out.println(Arrays.toString(result));
    }
}
