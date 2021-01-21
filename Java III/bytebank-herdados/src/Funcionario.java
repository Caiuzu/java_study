public class Funcionario {
    private String name;
    private String cpg;
    private double salario;

    public Funcionario() {
    }

    public double getBonificacao() {
        return this.salario * 0.1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpg;
    }

    public void setCpf(String cpf) {
        this.cpg = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
