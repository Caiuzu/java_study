public class TestaPontoFlutuante {
    public static void main(String[] args) {

        double salario = 1250.70;
        double divisao = 3.14 / 2;

        // há arredondamento para flutuantes em um int
        int segundaDivisaoInt = 5 / 2;
        double segundaDivisaoDouble = 5.0 / 2;

        System.out.println("O salário é " + salario);
        System.out.println("O resultado da divisao é " + divisao);

        System.out.println("O resultado da segunda divisao é " + segundaDivisaoInt);
        System.out.println("O resultado da segunda divisao é " + segundaDivisaoDouble);

    }
}
