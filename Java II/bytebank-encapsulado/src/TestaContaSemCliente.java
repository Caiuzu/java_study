public class TestaContaSemCliente {
    public static void main(String[] args) {

        Conta contaDaMarcela = new Conta(121231, 12312313);
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        System.out.println(contaDaMarcela.getTitular());

        contaDaMarcela.getTitular().setNome("Marcela");
        System.out.println(contaDaMarcela.getTitular().getNome());

    }
}
