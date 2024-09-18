package domain;

public enum Servico {
    CORTE(30), BARBA(15);

    private final double valor;

    Servico(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
