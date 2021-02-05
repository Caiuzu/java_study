public class Administrador extends Funcionario implements Autenticavel{

    private int senha;
    private final AutenticacaoUtil util;

    public Administrador() {
        this.util = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
