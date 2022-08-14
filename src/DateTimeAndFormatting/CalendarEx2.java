package DateTimeAndFormatting;

import java.util.Calendar;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class CalendarEx2 {

    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        // 0~11 월까지 있기 때문에 month는 -1을 해주어야함, 단 종료일은 11월일 때 12월 1일 이전까지 해줘야함 그래서 add -1을 해줌!!
        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1);

        //시작일이 무슨요일인지 맞추기
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        //종료일이 몇일인지 맞추기
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("     " + year + " 년 " + month + " 월" + "     ");
        System.out.println(" SU MO TU WE TH FR SA ");

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }
        for (int i = 1, n = START_DAY_OF_WEEK; i < END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if (n % 7 == 0) {
                System.out.println();
            }
        }

    }
}
