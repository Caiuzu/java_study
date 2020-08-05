public class TestaEscopo {
    public static void main(String[] args) {
        int quantidadePessoas = 3;
        boolean acompanhado; //Variaveis devem ser inicializadas antes de serem utilizadas

        if (quantidadePessoas >= 2) {
            //boolean acompanhado; // Variável não pode ser acessada em escopoos mais externos de onde for declarada
            acompanhado = true;
        } else {
            acompanhado = false;
        }
        System.out.println("Acompanhado: " + acompanhado);

    }
}
