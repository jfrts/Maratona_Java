package M03_Classes_Utilitarias.a10_temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        int dayOfWeekValue = temporal.get(ChronoField.DAY_OF_WEEK); 
        DayOfWeek dayOfWeek = DayOfWeek.of(dayOfWeekValue);

        switch (dayOfWeek) {
            case FRIDAY:
            case SATURDAY:
                return temporal.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            default:
                return temporal.plus(1, ChronoUnit.DAYS);
        }    
    }
}

public class TemporalAdjusterExerc {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        
        ObterProximoDiaUtil proxDiaUtil = new ObterProximoDiaUtil();
        System.out.println(proxDiaUtil.adjustInto(now));
    }
}
