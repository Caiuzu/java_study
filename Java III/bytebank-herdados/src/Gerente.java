public class Gerente extends Funcionario implements Autenticavel {

    private final AutenticacaoUtil util;

    public Gerente() {
        this.util = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }
}