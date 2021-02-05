public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private double tributos;

    public double getTributos() {
        return tributos;
    }

    public void setTributos(double tributos) {
        this.tributos = tributos;
    }

    public Conta(int agencia, int numero) {
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

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
        if (agencia <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        this.numero = numero;
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
