public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.5;
        int valor = (int) salario; //(int) Type Casting -> transforma o valor double em int

        System.out.println("O valor '(int) salario' é " + valor);

        //Tipos primitivos de variaveis
        float pontoFlutuanteFloat = 3.14f;
        long numeroGrande = 32432423523L;
        short valorPequeno = 2131;
        byte b = 127;

        //Nunca utilizar double para somar dinheiro por conta do 0.30000000000000004, utilizar BigDecimal
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);

    }
}
