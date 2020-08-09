public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 100;

        conta.deposita(50); // nomeDaReferencia.nomeDoMetodo();
        System.out.println(conta.saldo);

        boolean conseguiRetirar = conta.saca(20);
        System.out.println("Saque de: " + conta.saldo + "; Status: " + conseguiRetirar);

        Conta contaSecundaria = new Conta();
        contaSecundaria.deposita(1000);

        contaSecundaria.transfere(300, conta);

        System.out.println("Saque de: " + conta.saldo);
        System.out.println("Saque de: " + contaSecundaria.saldo + "; Status: " + conseguiRetirar);
    }
}
