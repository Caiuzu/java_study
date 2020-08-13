public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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