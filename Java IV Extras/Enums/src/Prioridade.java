public enum Prioridade { //os objetos dentro da classe enum se comportam como se já tivessem sido instanciados (new)
    MIN(1),
    NORMAL(2),
    MAX(3);

    private final int valor;

    Prioridade(final int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
