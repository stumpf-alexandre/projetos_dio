package edu.alexandre.anatomiaDasClasses;
//Identando o código

//classes
public class BoletinEstudantil {

    // métodos
    public static void main(String[] args) {

        // variavel
        int mediaFInal = 7;

        // fluxos
        if (mediaFInal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFInal == 6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
    }
}