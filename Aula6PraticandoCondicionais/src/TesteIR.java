public class TesteIR {
    public static void main(String[] args) {

        double aliquotaBaixa = 0.75;
        double aliquotaMedia = 0.15;
        double aliquotaAlta = 0.225;

        double salario = 3300.0;
        double valorDeduzido = salario;

        if ((1900.0 <= salario) && (salario <= 2800.0)) {
            valorDeduzido *= aliquotaBaixa;
        } else if ((2800 <= salario) && (salario <= 3751.0)) {
            valorDeduzido *= aliquotaMedia;
        } else {
            valorDeduzido *= aliquotaAlta;
        }

        System.out.println("Pode deduzir: R$" + valorDeduzido);

    }
}
