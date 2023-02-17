package edu.alexandre.anatomiaDasClasses;

public class MinhaClasse {
    public static void main(String[] args) {// metodo
        System.out.println("Olá Alexandre, seja bem vindo!");

        // Estrutura de uma variavel
        // Tipo NomeBemDefinido = Atribuição(opicional em alguns casos)

        // As variaveis final são declaradas quando precisamos lidar com dados que não
        // devem ser alterados durante a execução do programa. São declaradas dentro de
        // métodos.
        final String BR = "Brasil";
        final double PI = 3.14;
        final int ESTADOS_BRASILEIROS = 27;

        // Declaração invalida de variáveis
        // int numero&um = 1;//os únicos simbolos permitidos são _ e $
        // int 1numero = 1;//uma variavel não pode começar com numero
        // int numero um = 1//não pode ter espaço no nome da variavel
        // int long = 1//long faz parte das palavras reservadas da linguagem

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;

        String meuNome = "Alexandre";
        int anoFabricacao = 2022;
        boolean verdadeiraFalsa = false;
        verdadeiraFalsa = true;
        anoFabricacao = 2018;

        String primeiroNome = "Alexandre";
        String segundoNome = "Stumpf";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Declarando métodos
    // Estrutura
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

    // int somar(int numeroUm, int numero2);

    // String formatarCep(long cep);
}
