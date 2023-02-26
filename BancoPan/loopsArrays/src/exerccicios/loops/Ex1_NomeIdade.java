package exerccicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia conjuntos de dois valores, o primeiro
 * representa o nome do aluno e o segundo representando a sua idade.
 * (Pare inserindo o valor 0 no campo nome)
 */

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;

            while (true) {
                System.out.println("DIGITE ZERO PARA ENCERRAR O LOOP");
                System.out.println("Digite o nome do aluno: ");
                nome = scan.next();

                if (nome.equals("0"))
                    break;

                System.out.println("Digite a idade do aluno: ");
                idade = scan.nextInt();
            }
        }
    }
}
