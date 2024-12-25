/**
 * ID: 65160089
 * NAME: Jirachart Kongwaja
 * TEAM: 2
 */
import java.util.Scanner;

public class TewExam03 {
    public static int[] exam03() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่จำนวนตัวเลขที่ต้องการเปรียบเทียบ:");
        int n = scanner.nextInt();
        
        // สร้าง array สำหรับเก็บคะแนนทั้ง 2 ชุด
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        
        // รับค่า array แรก
        System.out.println("กรุณาใส่ตัวเลขชุดที่ 1:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        
        // รับค่า array ที่สอง
        System.out.println("กรุณาใส่ตัวเลขชุดที่ 2:");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // เปรียบเทียบและนับคะแนน
        int score1 = 0;
        int score2 = 0;
        
        System.out.println("\nกระบวนการเปรียบเทียบ:");
        for (int i = 0; i < n; i++) {
            System.out.print("ตำแหน่งที่ " + (i+1) + ": " + array1[i] + " กับ " + array2[i] + " -> ");
            if (array1[i] > array2[i]) {
                score1++;
                System.out.println("ชุดที่ 1 ได้คะแนน");
            } else if (array2[i] > array1[i]) {
                score2++;
                System.out.println("ชุดที่ 2 ได้คะแนน");
            } else {
                System.out.println("เท่ากัน ไม่ได้คะแนน");
            }
        }
        
        int[] result = {score1, score2};
        System.out.println("\nผลลัพธ์: [" + score1 + ", " + score2 + "]");
        return result;
    }

    public static void main(String[] args) {
        exam03();
    }
}
