package edu.alexandre.tiposEVariaveis;

public class TiposVariaveis {
    // Declaração de Variaveis
    // Variável é uma identificação de um espaço em
    // memória utilizado pelo nosso programa. Seguindo as
    // convenções em linguagem de programação, toda variável
    // é composta por: tipo de dados + identificação + valor
    // atribuído.
    // A estrutura padrão para se declarar uma variável
    // sempre é:
    // <Tipo> <nomeVariavel> <atribuiçãoDeValorOpicional>
    // Exemplo abaixo:

    int idade;// tipo "int", nome "idade, com nenhum valor atribuido"
    int anoFabricacao = 2021;// tipo "int", nome "anoFabricacao", com valor 2021
    double salarioMinimo = 2500;// tipo "double", nome "salarioMinimo", valor 2500

    // Atenção: existe algumas peculiaridades a trabalhar
    // com alguns tipos específicos. Observe no exemplo
    // abaixo:
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;// se começar com zero, talvez tenha que ser de outro tipo
        long cpf = 98765432100L;// se começar com zero, talvez tenha que ser de outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        // Observe que o tipo long precisa terminar com L,
        // o tipo float precisa terminar com F e alguns
        // cenários do dia-a-dia podem estimular uma
        // alteração de tipo de dados convencional.
        // Muitas das vezes criamos uma variável, definimos
        // um valor correspondente, manipulamos esta
        // variável e temos consciência de seu valor na
        // aplicação. Mas cuidado!!!
        // Java é fortemente tipado.
        // Veja o cenario abaixo:

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Variaveis e Constante
        // Uma variável é uma área de memória, associada a
        // um nome, que pode armazenar valores de um
        // determinado tipo. Um tipo de dado define um
        // conjunto de valores e um conjunto de operações.
        // Java é uma linguagem com rigidez de tipos,
        // diferente de linguagens como JavaScript, onde
        // declarar o tipo da variável não é obrigatório.
        // No Java utilizamos identificadores que
        // representam uma referência (ponteiro) a um valor
        // em memória, e esta referência pode ser
        // redirecionada a outro valor, sendo portanto esta
        // a causa do nome "variável", pois o valor pode
        // variar.
        // Ja as Constantes são valores armazenados em
        // memória que não podem ser modificadas depois de
        // declarados. Em java, esses valores são
        // representados pela palavra reservada "final",
        // seguida do tipo.
        // Por convenção, COnstantes são sempre escritas em
        // CAIXA ALTA.
        // Abaixo temos um exemplo explicativo sobre uso de
        // variáveis e constante:

        // Variável
        String meuNome = "Alexandre";
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //Constante
        final double VALOR_DE_PI = 3.14;
        //Compreendemos que para declarar uma variável como 
        //uma constante, utilizamos a palavra final, mas por 
        //convenção, esta variável deverá ser escrita em caixa 
        //alta.
    }
}
