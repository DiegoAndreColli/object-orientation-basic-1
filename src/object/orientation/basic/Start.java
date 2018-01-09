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
        pessoa.altura = 1.80;
        pessoa.saldoBanco = 1500.5;
        pessoa.nome = "Diego Colli";
        System.out.println(pessoa.falar());
        pessoa.andar();
        System.out.println("Saldo antes de pagar conta:");
        System.out.println(pessoa.saldoBanco);
        pessoa.pagarConta(1500.0);
        System.out.println("Saldo após pagar conta:");
        System.out.println(pessoa.saldoBanco);
        
    }
    
}
