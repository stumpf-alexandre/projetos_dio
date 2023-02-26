package com.alexandre;

//Encadeamento de nó
public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo no1"); // estanciando no1
        No no2 = new No("Conteúdo no2"); // estanciando no2
        no1.setProximoNo(no2); // encadeamento do no1 para no2, no1 aponta para no2
        No no3 = new No("Conteúdo no3"); // estanciando no3
        no2.setProximoNo(no3); // encadeamento do no2 para o no3
        No no4 = new No("Conteúdo no4"); // estanciando no4
        no3.setProximoNo(no4);// encadeamento do no3 para no4

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("---------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
