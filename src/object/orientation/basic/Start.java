package object.orientation.basic;

/**
 *
 * @author User
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Diego Colli";
        pessoa.altura = 1.80;
        pessoa.andar();
        // Recebe um pagamento
        pessoa.receberPagamento(10100.00);
        System.out.println(pessoa.falar());
        // Cria uma conta
        Double conta = 10000.00;
        System.out.println("Saldo antes de pagar conta:");
        pessoa.mostraSaldoBanco();
        // "Tenta pagar a conta"
        pessoa.pagarConta(conta);
        System.out.println("Saldo após pagar conta:");
        pessoa.mostraSaldoBanco();

    }

}
