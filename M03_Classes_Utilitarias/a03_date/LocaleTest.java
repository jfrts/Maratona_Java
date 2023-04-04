package M03_Classes_Utilitarias.a03_date;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
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

        double valor = 1_000.2130;

        System.out.println("\nNumber Format");        
        for (NumberFormat numberFormat : nf) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        // Currency format
        
        NumberFormat[] cFormat = new NumberFormat[4];
        cFormat[0] = NumberFormat.getCurrencyInstance();
        cFormat[1] = NumberFormat.getCurrencyInstance(localeBR);
        cFormat[2] = NumberFormat.getCurrencyInstance(localeJP);
        cFormat[3] = NumberFormat.getCurrencyInstance(localeIT);
        
        System.out.println("\nCurrency Format");        
        for (NumberFormat currencyFormat : cFormat) {
            System.out.println(currencyFormat.format(valor));
        }

        
        System.out.println("\nParse");
        
        String valorString = "1000.2130";
        /*
         * String valorString = "1_000.2130"; => Return 1; Isso ocorre por conta da String conter um valor inválido '_'.
         * String valorString = "1000.2130"; => Return 1000.213;
         */
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
