public class Conta {
    double saldo; // atributo
    int agencia;
    int numero;
    String titular;

    public void deposita(final double valor) { // método - Por convenção, o nome do método no mundo Java deve começar com letra minúscula.
        this.saldo += valor; // 'this.' é utilizado somente em atributos da classe
    }

    public boolean saca(double valor) {
        if (verificaSaldo(valor)) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (verificaSaldo(valor)) {
            destino.deposita(valor);
            this.saca(valor);
            return true;
        }
        return false;
    }

    public boolean verificaSaldo(double valor) {
        return this.saldo >= valor;
    }
}
