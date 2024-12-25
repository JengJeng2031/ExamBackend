import java.util.Scanner;

public class TewExam02 {
    public static String exam02() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("กรุณาใส่ขี (ค.ศ.):");
        int year = scanner.nextInt();
        
        System.out.println("กรุณาใส่วันที่ต้องการ (1-365):");
        int dayOfYear = scanner.nextInt();
        
        // จำนวนวันในแต่ละเดือน
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", 
                             "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
        
        // ตรวจสอบปีอธิกสุรทิน (Leap Year)
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        // หาเดือนและวัน
        int month = 0;
        int dayOfMonth = dayOfYear;
        
        System.out.println("\nกระบวนการคำนวณ:");
        for (int i = 0; i < daysInMonth.length; i++) {
            if (dayOfMonth <= daysInMonth[i]) {
                month = i;
                break;
            }
            System.out.println("หักจำนวนวันของเดือน" + monthNames[i] + ": " + dayOfMonth + " - " + daysInMonth[i]);
            dayOfMonth -= daysInMonth[i];
        }
        
        String result = "วันที่ " + dayOfMonth + " " + monthNames[month] + " " + year;
        System.out.println("\nผลลัพธ์: " + result);
        return result;
    }
    
    // ตรวจสอบปีอธิกสุรทิน
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        exam02();
    }
}
