public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "João Roberval";
        cliente.cpf = "111.222.333-44";
        cliente.profissao = "Pipoqueiro";

        cliente.endereco.bairro="Jd.teste"; // A inicialização da propriedade endereco esta sendo realizada na própria classe Cliente
        cliente.endereco.cep = "11111111";

        System.out.println("Bairro:"+ cliente.endereco.bairro + " Numero: " + cliente.endereco.numero); // A propriedade número, começa com um valor null por ter sido inicializada

        Conta conta = new Conta();
        conta.deposita(100);

        conta.titular = cliente; // Estamos associando 'cliente' como 'titular' de uma 'conta'
        System.out.println(conta.titular.nome);// conta -> titular -> cliente


    }
}
