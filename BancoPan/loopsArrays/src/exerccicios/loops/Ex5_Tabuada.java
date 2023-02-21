package exerccicios.loops;

import java.util.Scanner;

/**
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer
 * número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicacao;

        while (true) {
            System.out.println("Digite um número entre 1 e 10 para gerar a tabuada do mesmo:");
            numero = scan.nextInt();
            if (numero <= 0 || numero > 10) {
                System.out.println("Número invalido");
            } else {
                System.out.println("Tabuada de " + numero);
                for (int i = 1; i <= 10; i++) {

                    multiplicacao = numero * i;
                    System.out.println(numero + " x " + i + " = " + multiplicacao);
                }
                break;
            }
        }
    }
}
