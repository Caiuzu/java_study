public class TesteDeReferencias {
    public static void main(String[] args) {


        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Primeira conta - Saldo: " + primeiraConta.saldo);

        //Referências vs Objetos
        Conta segundaConta = primeiraConta;

        System.out.println("Segunda conta - Saldo: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        // Os números de referência são iguais, portanto, são a mesma conta, fazem referência ao mesmo objeto neste código.
        if (primeiraConta == segundaConta) {
            System.out.println("Mesma conta!");

        } else {
            System.out.println("Contas diferentes!");
        }

        //O resultado da execução dessa aplicação será contas diferentes. O sinal == irá comparar referências, e não objetos.
        Conta terceiraConta = new Conta();

        if (primeiraConta == terceiraConta) {
            System.out.println("Mesma conta!");

        } else {
            System.out.println("Contas diferentes!");
        }

        //Endereços de memórias
        System.out.println("Primeira conta: " + primeiraConta);
        System.out.println("Segunda conta: " + segundaConta);
        System.out.println("Terceira conta: " + terceiraConta);

    }
}
