package M03_Classes_Utilitarias.a09_period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(20).plusWeeks(42);

        System.out.println(Period.between(date1, date2));

        Period p1 = Period.ofWeeks(508);
        System.out.println(p1); // P406D
        System.out.println(p1.getMonths()); // 0. Não funciona pegarmos o número de mêses dessa forma. Precisamos da
                                            // classe ChronoUnit.

        // ChronoUnit
        System.out.println(
                date1.until(date1.plusDays(p1.getDays()), ChronoUnit.YEARS)); // se p1 = 58 retorna 1, se 508 retorna 9

        LocalDateTime aniversario = LocalDateTime.of(1994, 11, 21, 8, 15, 45);
        System.out.println(aniversario); // 1994-11-21T08:15:45

        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now())); // 10361 dias
    }
}
