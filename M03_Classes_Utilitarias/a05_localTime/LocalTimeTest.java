package M03_Classes_Utilitarias.a05_localTime;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);

        LocalTime localTime = LocalTime.of(11, 03, 25);
        System.out.println(localTime);
    }
}
