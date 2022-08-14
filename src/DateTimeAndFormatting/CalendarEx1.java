package DateTimeAndFormatting;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();

        System.out.println("today.get(Calendar.YEAR) = " + today.get(Calendar.YEAR));
        System.out.println("today.get(Calendar.MONTH) = " + today.get(Calendar.MONTH) + 1); // 월을 얻어올때는 0~11이다.
        System.out.println("today.get(Calendar.WEEK_OF_YEAR) = " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("today.get(Calendar.WEEK_OF_MONTH) = " + today.get(Calendar.WEEK_OF_MONTH));

        System.out.println("today.get(Calendar.DATE) = " + today.get(Calendar.DATE));
        System.out.println("today.get(Calendar.DAY_OF_MONTH) = " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("today.get(Calendar.DAY_OF_YEAR) = " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("today.get(Calendar.DAY_OF_WEEK) = " + today.get(Calendar.DAY_OF_WEEK));

        System.out.println("today.get(Calendar.AM_PM) = " + today.get(Calendar.AM_PM));
        System.out.println("today.get(Calendar.HOUR) = " + today.get(Calendar.HOUR));
        System.out.println("today.get(Calendar.HOUR_OF_DAY) = " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("today.get(Calendar.MONTH) = " + today.get(Calendar.MONTH));
        System.out.println("today.get(Calendar.SECOND) = " + today.get(Calendar.SECOND));

        System.out.println("today.get(Calendar.ZONE_OFFSET) = " + today.get(Calendar.ZONE_OFFSET));
        System.out.println("today.getActualMaximum(Calendar.DATE) = " + today.getActualMaximum(Calendar.DATE));
    }
}
