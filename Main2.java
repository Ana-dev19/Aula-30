package Exercicios;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {
        ContaPoupança contaPoupança = new ContaPoupança(1500);

        ContaCorrente contaCorrente = new ContaCorrente(2000);

        SeguroDeVida seguroDeVida = new SeguroDeVida(5000);

        HashMap<String, Double> tributos = new HashMap<String, Double>();
        tributos.put("Conta Poupança", contaPoupança.calcularTributo());
        tributos.put("Conta Corrente", contaCorrente.calcularTributo());
        tributos.put("Seguro de Vida", seguroDeVida.calcularTributo());

        double totalTributos = 0;

        for (Double tributo : tributos.values()) {
            totalTributos += tributo;
        }
        System.out.println("Total de tributos: " + totalTributos);
        System.out.println("----------------------------------------------------");
    }

}
