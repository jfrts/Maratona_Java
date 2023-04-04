package M03_Classes_Utilitarias.a03_date;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        // Locale locale = new Locale("IT", "IT");
        // Locale locale2 = new Locale("IT", "CH");

        // Calendar calendar = Calendar.getInstance();

        // DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        // DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);

        // System.out.println("Itália: " + df1.format(calendar.getTime()));
        // System.out.println("Suíça: " + df2.format(calendar.getTime()));

        // Aula 116
        // System.out.println(Locale.getDefault()); // en_US

        // Number format
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(localeBR);
        nf[2] = NumberFormat.getInstance(localeJP);
        nf[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
