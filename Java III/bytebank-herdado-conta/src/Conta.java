public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
        //System.out.println("estou criando uma conta, total de contas: " + Conta.total);
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
        if (agencia <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract void deposita(final double valor);

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

    public static int getTotal() {
        return Conta.total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }

}