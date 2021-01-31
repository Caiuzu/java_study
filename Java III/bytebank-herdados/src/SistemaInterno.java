public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autentica(senha);
        if (autenticou) {
            System.out.println("Autenticado com sucesso");
        } else {
            System.out.println("Não Autenticado");
        }
    }
}
