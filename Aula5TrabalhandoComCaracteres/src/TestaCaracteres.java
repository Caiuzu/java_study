public class TestaCaracteres {
    public static void main(String[] args) {
        char letra = 'A';
        char codigoASCII = 65;

        System.out.println("O caractere '" + codigoASCII + "' é equivalente ao numero '65' na tabela ASCII");

        codigoASCII = (char) (codigoASCII + 1);
        System.out.println("Próxima letra " + codigoASCII);

        String palavra = "Minha frase " + 2020;
        System.out.println(palavra);
    }
}
