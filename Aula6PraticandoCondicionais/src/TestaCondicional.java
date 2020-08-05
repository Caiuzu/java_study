public class TestaCondicional {
    public static void main(String[] args) {
        int idade = 10;
        int quantidadeDePessoas = 3;

        if (idade >= 18) {
            System.out.println("Mais de 18 anos"); // Digitando 'sout' e realizando o auto-complete, temos System.out.println();
        } else if (quantidadeDePessoas >= 2){
            System.out.println("Menos de 18 anos, acompanhado");
        }else{
            System.out.println("Menos de 18 anos");
        }
    }
}
