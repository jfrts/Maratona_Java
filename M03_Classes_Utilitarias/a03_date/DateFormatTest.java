package M03_Classes_Utilitarias.a03_date;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormat = new DateFormat[7]; 
    
        dateFormat[0] = DateFormat.getInstance(); // 03/04/2023, 8:17 pm
        dateFormat[1] = DateFormat.getDateInstance(); // 3 Apr 2023 
        dateFormat[2] = DateFormat.getDateTimeInstance(); // 3 Apr 2023, 8:17:47 pm
        dateFormat[3] = DateFormat.getDateInstance(DateFormat.SHORT); // 03/04/2023
        dateFormat[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // 3 Apr 2023
        dateFormat[5] = DateFormat.getDateInstance(DateFormat.LONG); // 3 April 2023
        dateFormat[6] = DateFormat.getDateInstance(DateFormat.FULL); // Monday, 3 April 2023
    
        for (DateFormat df : dateFormat) {
            System.out.println(df.format(calendar.getTime()));
        }
    }
}
