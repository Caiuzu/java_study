public class TestaGerente {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setName("João");
        gerente.setCpf("1234321");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getName());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autentica(2222);
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());

    }
}
