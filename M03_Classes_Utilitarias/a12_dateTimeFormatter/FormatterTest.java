package M03_Classes_Utilitarias.a12_dateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Format = Objeto -> String
 * Parse = String -> Objeto
 */
public class FormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String formattedDate = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String formattedDate1 = date.format(DateTimeFormatter.ISO_DATE);
        String formattedDate2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    
        System.out.println(formattedDate); // 20230405
        System.out.println(formattedDate1); // 2023-04-05 (ISO_DATE também traz o offset, caso o tenha)
        System.out.println(formattedDate2); // 2023-04-05

        System.out.println("\nParse:");
        LocalDate parse1 = LocalDate.parse("20230405", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1); // 2023-04-05

        System.out.println("\nFormat German");
        DateTimeFormatter formatterGerman = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(formatterGerman); // Value(DayOfMonth,2)'.'Text(MonthOfYear)'.'Value(YearOfEra,4,19,EXCEEDS_PAD)

        String nowFormattedToGerman = LocalDate.now().format(formatterGerman);
        System.out.println(nowFormattedToGerman); // 05.April.2023

        //                                                        (05.April.2023)
        LocalDate nowParsedFromGermanPattern = LocalDate.parse(nowFormattedToGerman, formatterGerman);
        System.out.println(nowParsedFromGermanPattern); // 2023-04-05
    }
}
