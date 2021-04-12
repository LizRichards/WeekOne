package dayfive;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Liz Richards
 */
public class DateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testing for year 2000");
        monthLength(2000);

        System.out.println("Getting Mondays in June of this year");
        listMondays("june");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in dd/MM/yyyy format :");
        String in = input.next();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        Date date = null;
        try {
            date = dateFormat.parse(in);
        } catch (Exception e) {
            date = null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println("Is your date entered on friday the 13th: " + isFriday13(calendar));
    }

    public static void monthLength(int year) {
        for (int i = 1; i < 13; i++) {
            YearMonth yearMonthObject = YearMonth.of(year, i);
            System.out.println(yearMonthObject.lengthOfMonth());
        }
    }

    public static void listMondays(String mon) {
        Month month = Month.valueOf(mon.toUpperCase());
        LocalDate date = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); 
        Month mo = date.getMonth();
        while (mo == month) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mo = date.getMonth();
        }
    }

    public static boolean isFriday13(Calendar date) {
        return (date.get(Calendar.DAY_OF_WEEK) == 6 && date.get(Calendar.DAY_OF_MONTH) == 13);
    }
}
