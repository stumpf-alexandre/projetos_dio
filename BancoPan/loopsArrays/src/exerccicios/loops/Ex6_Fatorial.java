package exerccicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro
 * fornecido pelo usuário.
 * Ex.: 5! = 120
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long fatorial;
        long multiplicacao = 1;

        while (true) {
            System.out.println("Digite um número: ");
            fatorial = scan.nextLong();
            if (fatorial < 0 || fatorial > 20) {
                System.out.println("Numero inválido!!!");
            } else {
                for (long i = 1; i <= fatorial; i++) {
                    multiplicacao = multiplicacao * i;
                }
                System.out.println("Fatorial " + fatorial + "! = " + multiplicacao);
                break;
            }
        }
        /**
         * System.out.print(fatorial + "! = ");
         * 
         * for (int i = fatorial; i <= 1; i++) {
         * multiplicacao = multiplicacao * i;
         * }
         * System.out.println(multiplicacao);
         */
    }
}
