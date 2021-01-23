/*
    Polimorfismo: objeto que pode ser referenciado por uma referência de mesmo tipo, ou genérica.
    Ou seja, se temos um objeto Gerente(), a referência pode ser tanto do tipo Gerente, quanto do tipo Funcionario.
    É possível comunicarmos com o Gerente a partir de uma referência genérica, como Funcionario.
    Temos apenas um método genérico e, mesmo assim, o método genérico será chamado. É esta a vantagem do polimorfismo.
    Instancia um objeto de tipo específico com um tipo mais genérico.
*/

public class TesteReferencias {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente();
        gerente.setName("José");
        gerente.setSalario(5000.0);

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Jailson");
        funcionario.setSalario(2000.0);

        Funcionario editorVideo = new EditorVideo();
        editorVideo.setName("Ediltor Devide");
        editorVideo.setSalario(2000.0);

        Funcionario motorista = new Motorista();
        motorista.setSalario(1500);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(gerente);
        controleBonificacao.registra(funcionario);
        controleBonificacao.registra(editorVideo);
        controleBonificacao.registra(motorista);

        /*
         quando ele for chamar o "funcionario.getBonificacao()" em controleBonificação, ele vai pegar a do tipo do objeto instanciado:

             controleBonificacao.registra(editorVideo); -> aqui ele vai chamar o do editor de vídeo
             controleBonificacao.registra(motorista); -> aqui ele vai chamar a genérica, pois motorista não possui uma bonificação específica

         */

        System.out.println(controleBonificacao.getSoma());
    }
}
