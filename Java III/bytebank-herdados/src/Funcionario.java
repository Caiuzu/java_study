public abstract class Funcionario {
    private String name;
    private String cpg;
    private double salario;

    public Funcionario() {
    }

    public abstract double getBonificacao();

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
