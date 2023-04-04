package M03_Classes_Utilitarias.a08_duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime future = LocalDateTime.of(2023, 05, 04, 11, 37, 0);

        System.out.println(Duration.between(now, future)); // PT719H59M20.6273458S => ISO 8601
    
        System.out.println(Duration.ofDays(5)); // PT120H
        System.out.println(Duration.ofMinutes(550878)); // PT9181H18M
    }
}
