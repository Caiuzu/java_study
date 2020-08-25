public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337,1010);

        conta.setAgencia(123123132);

        Conta contaDois = new Conta(1337,16485);
        Conta contaTres = new Conta(1337,16477);

        System.out.println(Conta.getTotal());

        //valores inconsistentes pois são inicializados de uma forma errada com o valor default
        //conta.setAgencia(-10);
        //conta.setNumero(-20);

    }
}
