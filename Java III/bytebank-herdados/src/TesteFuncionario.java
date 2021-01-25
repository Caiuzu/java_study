public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Gerente();
        funcionario.setName("Caio Souza");
        funcionario.setCpf("213213123-0");
        funcionario.setSalario(1200.0);

        System.out.println(funcionario.getName());
        System.out.println(funcionario.getBonificacao());

    }
}
