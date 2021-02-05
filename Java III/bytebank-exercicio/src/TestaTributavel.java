public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0001,123);
        contaCorrente.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroDeVida);

        System.out.println(calculadorImposto.getTotalImposto());
    }
}
