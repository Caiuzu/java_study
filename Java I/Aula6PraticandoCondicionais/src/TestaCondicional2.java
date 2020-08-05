public class TestaCondicional2 {
    public static void main(String[] args) {
        int idade = 10;
        int quantidadePessoas = 3;
        boolean acompanhado = false;

        acompanhado = quantidadePessoas >=2;

        if (idade >= 18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Acesso não autorizado");
        }

    }
}
