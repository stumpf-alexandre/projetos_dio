package exerccicios.arrays;

import java.util.Scanner;

/**
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes
 */

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int numeroConsoantes = 0;
        int cont = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"))) {
                consoantes[cont] = letra;
                numeroConsoantes++;
            }
            cont++;
        } while (cont < consoantes.length);

        System.out.print("Consoantes: ");
        // laço foreatch
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + numeroConsoantes);

    }
}
