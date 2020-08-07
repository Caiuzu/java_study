public class CriaConta {
    public static void main(String[] args) {

        //primeira conta
        final Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Primeira Conta - Saldo: " + primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println("Primeira Conta - Saldo: " + primeiraConta.saldo);

        //segunda conta
        final Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("Segunda Conta - Saldo: " + segundaConta.saldo);

        //Valores default de atributos
        System.out.println("Segunda Conta - Agência: " + segundaConta.agencia);

    }
}
