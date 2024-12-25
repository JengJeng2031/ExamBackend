import java.util.Arrays;
import java.util.Scanner;

public class BattleScore {
    public static int[] battleScore(int[] aliceArray, int[] bobArray) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < aliceArray.length; i++) {
            if (aliceArray[i] > bobArray[i]) {
                aliceScore += 1;
            } else if (bobArray[i] > aliceArray[i]) {
                bobScore += 1;
            }
        }

        return new int[] { aliceScore, bobScore };
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("กรุณาใส่จำนวนตัวเลขที่ต้องการเปรียบเทียบ:");
        int n = kb.nextInt();
        
        int[] alice = new int[n];
        int[] bob = new int[n];
        
        System.out.println("กรุณาใส่คะแนนของ Alice " + n + " ตัว:");
        for(int i = 0; i < n; i++) {
            alice[i] = kb.nextInt();
        }
        
        System.out.println("กรุณาใส่คะแนนของ Bob " + n + " ตัว:");
        for(int i = 0; i < n; i++) {
            bob[i] = kb.nextInt();
        }

        int[] result = battleScore(alice, bob);
        System.out.println("ผลลัพธ์: " + Arrays.toString(result));
        
        kb.close();
    }
}
