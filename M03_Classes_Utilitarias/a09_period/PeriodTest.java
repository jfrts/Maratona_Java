package M03_Classes_Utilitarias.a09_period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(20).plusWeeks(42);

        System.out.println(Period.between(date1, date2));

        Period p1 = Period.ofWeeks(58); 
        System.out.println(p1); // P406D
        System.out.println(p1.getMonths()); // 0. Não funciona pegarmos o número de mêses dessa forma. Precisamos da classe ChronoUnit.
    }
}
