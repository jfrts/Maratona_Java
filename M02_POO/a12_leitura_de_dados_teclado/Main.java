package M02_POO.a12_leitura_de_dados_teclado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite M ou F para o sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.printf("Nome: %s | Idade: %d | Sexo: %c", nome, idade, sexo);
    }
}
