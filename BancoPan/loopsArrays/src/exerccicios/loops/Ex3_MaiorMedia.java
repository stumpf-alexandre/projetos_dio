package exerccicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maior número
 * e a média desses números.
 */

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int cont = 0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (maior < numero)
                maior = numero;

            media = media + numero;
            cont++;
        } while (cont < 5);
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("A média dos números é: " + media / 5);
    }
}
