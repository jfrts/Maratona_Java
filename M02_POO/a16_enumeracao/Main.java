package M02_POO.a16_enumeracao;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Julio", "PESSOA_FÍSICA");
        Cliente cliente2 = new Cliente("Freitas", "PESSOA_JURÍDICA");
        Cliente cliente3 = new Cliente("Julio", "PESSOA-JURÍDICA");
        Cliente cliente4 = new Cliente("Freitas", "pessoa_Física");
        // Vai gerar inconsistência de dados.

        // Método correto
        Cliente clienteCorreto = new Cliente("Julio", TipoDeCliente.PESSOA_FISICA);
    }
}
