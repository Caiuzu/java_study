public class Gerente extends Funcionario {

    private int senha;

    public Gerente() {
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

//    public double getBonificacao() {
//        return this.salario;
//    }
}