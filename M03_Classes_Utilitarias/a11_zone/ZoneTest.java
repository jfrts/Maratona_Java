package M03_Classes_Utilitarias.a11_zone;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
    
        System.out.println(shortIds);
        System.out.println(shortIds.get("BET")); // America/Sao_Paulo
        System.out.println(ZoneId.systemDefault()); // America/Sao_Paulo
        
        ZoneId zoneOfTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneOfTokyo); // Asia/Tokyo

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2023-04-05T10:11:02.128000600

        ZonedDateTime nowInTokyo = now.atZone(zoneOfTokyo);
        System.out.println(nowInTokyo); // 2023-04-05T10:11:02.128000600+09:00[Asia/Tokyo]

        System.out.println("\nInstant");
        Instant nowInstant = Instant.now();

        System.out.println(nowInstant); // 2023-04-05T13:12:33.901082Z (Zulu Time)
        System.out.println(nowInstant.atZone(zoneOfTokyo)); // 2023-04-05T22:13:18.626645400+09:00[Asia/Tokyo]

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime atOffset1 = now.atOffset(offsetManaus);

        OffsetDateTime ofInstant2 = OffsetDateTime.ofInstant(nowInstant, offsetManaus);
    }
}