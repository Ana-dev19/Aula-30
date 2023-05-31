package Exercicios;

public abstract class BemTributavel implements Tributavel {
    protected double valor;
    public BemTributavel(double valor) {
        this.valor = valor;
    }
}
