package M03_Classes_Utilitarias.a07_instant;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    public static void main(String[] args) {
        System.out.println(Instant.now()); // 2023-04-04T14:21:10.155973500Z (Zulu time)
        System.out.println(LocalDateTime.now()); // 2023-04-04T11:23:49.531572100 (UTC-03:00)
    }
}
