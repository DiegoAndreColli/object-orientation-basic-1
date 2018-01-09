package object.orientation.basic;

/**
 *
 * @author User
 */
class Pessoa {
    /* Por favor ignore por enquanto as palavras "Double" e "String" nos atributos abaixo */
    Double altura;
    Double saldoBanco;
    String nome;
    /* Por favor ignore por enquanto as palavras "void", "String" e "Double"  nos métodos abaixo */
    String falar() {
        return "Estou falando";
    }
    void andar() {
        System.out.println("Estou andando.");
    }
    void pagarConta(Double valorPagar) {
        saldoBanco = saldoBanco - valorPagar;
    }
}