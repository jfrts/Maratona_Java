package M03_Classes_Utilitarias.a06_localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow); // 2023-04-04T11:08:51.744458100
        LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDate parseDate = LocalDate.parse("2023-04-04");
    }
}
