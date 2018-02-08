package object.orientation.basic;

/**
 *
 * @author User
 */
class Pessoa {

    String nome;
    Double altura;
    private Double saldoBanco;

    public Pessoa() {
        saldoBanco = 0.0;
    }

    String falar() {
        return "Estou falando";
    }

    void andar() {
        System.out.println("Estou andando.");
    }

    void receberPagamento(Double pagamento) {
        this.saldoBanco = this.saldoBanco + pagamento;
    }

    public void pagarConta(Double valorPagar) {
        if (saldoBanco >= valorPagar) {
            saldoBanco = saldoBanco - valorPagar;
        } else {
            System.out.println("Saldo insuficiente para pagar a conta.");
        }
    }

    public void mostraSaldoBanco() {
        System.out.println("Saldo em banco: " + saldoBanco);
    }
}
