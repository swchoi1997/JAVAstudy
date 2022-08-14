package DateTimeAndFormatting;

import java.util.Calendar;
import java.util.Date;

class CalendarAndDate {
    public static void main(String[] args) {
        //Calendar는 추상 클래스이기때문에 직접 객체를 생성할 수 없음
        Calendar calendar = Calendar.getInstance();

        //Date와 Calendar간의 변환
        //1. Calender to Date
        Calendar cal1 = Calendar.getInstance();
        Date d1 = new Date(cal1.getTimeInMillis());

        //2. Date to Calendar
        Date d2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);

    }
}
