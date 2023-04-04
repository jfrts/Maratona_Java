package M03_Classes_Utilitarias.a10_temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate day20April = LocalDate.now().withDayOfMonth(20);

        System.out.println(now);
        System.out.println(day20April);
        System.out.println(day20April.getDayOfWeek());

        // TemporalAdjusters
        System.out.println("\nTemporal Adjusters");
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)); // 2023-04-04
        System.out.println(now);
        
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)); // 2023-04-11
        System.out.println(now);
    }
}
