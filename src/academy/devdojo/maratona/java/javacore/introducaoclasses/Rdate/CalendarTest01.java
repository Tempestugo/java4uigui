package academy.devdojo.maratona.java.javacore.introducaoclasses.Rdate;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        if(cal.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));

        cal.add(Calendar.DAY_OF_MONTH,2);
        cal.add(Calendar.HOUR_OF_DAY,200);
        Date date2 = cal.getTime();
        System.out.println(date2);
    }
}
