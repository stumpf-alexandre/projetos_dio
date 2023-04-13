package edu.alexandre.escopo;

public class Conta {

    double saldo = 10.0;

    public void sacar(Double valor) {
        // variável local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // disponivel em toda classe
        System.out.println(saldo);
        // somente o método sacar conhece esta variável
        // System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        // variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;// começando a variável
        for (int x = 1; x <= 5; x++) {
            // x variável de escopo
            // esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // escopo de fluxo
        // x e valorCalculado nunca estarão disponíveis fora desse bloco

        return valorMontante;
    }
}
