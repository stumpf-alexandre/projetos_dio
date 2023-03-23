package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPergunta {
    /**
     * Utilizando lista, faça um programa que faça 5 perguntas para uma pessoa sobre
     * um crime. As perguntação são:
     * 1 - "Telefonou para a vitima?"
     * 2 - "Esteve no local do crime?"
     * 3 - "Mora perto da vítima?"
     * 4 - "Devia para a vitima?"
     * 5 - "Já trabalhou com a vítima?"
     * 
     * Se a pessoa responder positivamente a 2 questões ela deve ser classificada
     * como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassina". Caso
     * contrário, ela será classificadaa como "Inocente".
     */
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int cont = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                cont++;
            }
        }

        switch (cont) {
            case 2:
                System.out.println(">>SUSPEITO<<");
                break;
            case 3:
            case 4:
                System.out.println(">>CÚMPLICE<<");
                break;
            case 5:
                System.out.println(">>ASSASSINO<<");
                break;
            default:
                System.out.println(">>INOCENTE<<");
                break;
        }
    }
}
