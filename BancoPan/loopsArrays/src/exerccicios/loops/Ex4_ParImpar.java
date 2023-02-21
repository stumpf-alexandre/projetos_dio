package exerccicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros, calcule e mostre
 * a quantidade de números pares e a quantidade de números impares.
 */

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd;
        int numero;
        int cont = 0;
        int contPar = 0;
        int contImpar = 0;

        System.out.println("Digite a quantidade de números para ser digitado");
        qtd = scan.nextInt();
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                contPar++;
            else
                contImpar++;

            cont++;
        } while (cont < qtd);
        System.out.println("Quantidade de números pares " + contPar);
        System.out.println("Quantidade de números impares " + contImpar);
        System.out.println("Programa encerrado!!!");
    }
}
