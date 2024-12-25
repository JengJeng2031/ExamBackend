import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class ExamFindDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (yyyy/mm/dd): ");
        String dateStr = scanner.nextLine();
        System.out.println(findThaiDay(dateStr));
        scanner.close();
    }

    public static String findThaiDay(String dateStr) {
        String[] parts = dateStr.split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return findThaiDay(year, month, day);
    }

    public static String findThaiDay(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
        
        switch (dayOfWeek) {
            case MONDAY: return "วันจันทร์";
            case TUESDAY: return "วันอังคาร";
            case WEDNESDAY: return "วันพุธ";
            case THURSDAY: return "วันพฤหัสบดี";
            case FRIDAY: return "วันศุกร์";
            case SATURDAY: return "วันเสาร์";
            case SUNDAY: return "วันอาทิตย์";
            default: return "ไม่สามารถระบุวันได้";
        }
    }
}
