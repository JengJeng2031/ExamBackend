import java.util.Scanner;

public class TewExam01 {
    public static String exam01() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ขัวเลข:");
        String input = scanner.nextLine();
        
        // แปลงเป็นตัวเลข
        int number = Integer.parseInt(input);
        String result = convertToThaiWord(number);
        
        System.out.println("ผลลัพธ์: " + result);
        return result;
    }
    
    public static String convertToThaiWord(int number) {
        if (number == 0) return "ศูนย์";
        
        String[] units = {"", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า"};
        
        // กรณีเลขหลักเดียว
        if (number < 10) {
            return units[number];
        }
        
        // กรณีเลขสองหลัก
        if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            
            if (tens == 1) {
                return "สิบ" + (ones == 1 ? "เอ็ด" : (ones > 0 ? units[ones] : ""));
            } else if (tens == 2) {
                return "ยี่สิบ" + (ones > 0 ? units[ones] : "");
            } else {
                return units[tens] + "สิบ" + (ones > 0 ? units[ones] : "");
            }
        }
        
        // กรณีเลขสามหลัก
        if (number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            
            String hundredsText = units[hundreds] + "ร้อย";
            if (remainder == 0) {
                return hundredsText;
            }
            
            return hundredsText + convertToThaiWord(remainder);
        }
        if (number < 10000) {
            int thousands = number / 1000;
            int remainder = number % 1000;
            
            String thousandsText = units[thousands] + "พัน";
            if (remainder == 0) {
                return thousandsText;
            }
            
            return thousandsText + convertToThaiWord(remainder);
        }
        
        return "รองรับเฉพาะเลข 0-9999";
    }

    public static void main(String[] args) {
        exam01();
    }
}
