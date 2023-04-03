package M03_Classes_Utilitarias.a03_date;

import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        // Essa classe está praticamente depreciada.
        Date date = new Date(0); // long ms desde 1/1/1970
        System.out.println(date); // Wed Dec 31 21:00:00 BRT 1969 (Fuso horário -03:00)
    }
}
