public class TestaBanco {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João Roberval");
        cliente.setCpf("111.222.333-44");
        cliente.setProfissao("Pipoqueiro"); //

        cliente.getEndereco().setBairro("Jd.teste"); // A inicialização da propriedade endereco esta sendo realizada na própria classe Cliente
        cliente.getEndereco().setCep("11111111");

        System.out.println("Bairro:" + cliente.getEndereco().getBairro() + " Numero: " + cliente.getEndereco().getNumero()); // A propriedade número, começa com um valor null por ter sido inicializada

        Conta conta = new Conta(1337,15683);
        conta.deposita(100);

        conta.setTitular(cliente); // Estamos associando 'cliente' como 'titular' de uma 'conta'
        System.out.println(conta.getTitular().getNome());// conta -> titular -> cliente

        conta.getTitular().setProfissao("programador");

    }
}