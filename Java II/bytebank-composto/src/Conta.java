public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(final double valor) {
        this.saldo += valor;
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
