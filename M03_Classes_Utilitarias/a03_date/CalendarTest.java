package M03_Classes_Utilitarias.a03_date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar foi a segunda classe criado pela equipe do Java, ela veio para corrigir os problemas da classe Date.
 * Esse problemas, em sua grande maioria, eram por conta de internacionalização.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getFirstDayOfWeek() == Calendar.MONDAY);
        
        calendar.add(Calendar.HOUR, 2);
        
        Date date = calendar.getTime();
        System.out.println(date);

        // Em projetos legados é provável encontrar DATE ou CALENDAR.
    }
}
