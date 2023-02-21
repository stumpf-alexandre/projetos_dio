package exerccicios.arrays;

/**
 * Crie um vetor de 6 números inteiros e mostre-os
 * na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 0, -5, 15, 50, 8, 4 };
        int cont = 0;
        // ordem crescente
        System.out.print("Vetor em ordem crescente: ");
        while (cont < vetor.length) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        // ordem decrescente
        System.out.print("\nVetor em ordem decrescente: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
