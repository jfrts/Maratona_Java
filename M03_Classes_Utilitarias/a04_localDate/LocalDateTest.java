package M03_Classes_Utilitarias.a04_localDate;

import java.time.LocalDate;
import java.time.Month;

import M02_POO.a13_exercicios_associacao.Local;

/**
 * A versão mais nova para trabalhar com datas no Java. Disponível a partir do Java 8.
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, Month.APRIL, 04); 
    
        System.out.println(date);
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);

        // LocalDate date3 = new LocalDate(); => Erro: Não é possível instanciar a classe LocalDate;
        // Apesar da classe não ser abstrata, o construtor privado impede a criação da instância.
    }
}
