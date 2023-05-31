package Exercicios;

public class ContaCorrente extends BemTributavel {
    public ContaCorrente(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return this.valor * 0.01;
    }
}
