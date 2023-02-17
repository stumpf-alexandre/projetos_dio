package edu.alexandre.operadores;

import java.util.Date;

public class operadores {
    // Operadores
    // Símbolos especiais que tem um significado próprio
    // para a linguagem e estão associados a determinadas
    // operações.
    // Geralmente as primeiras palavras que ouvimos em um
    // curso de programação são: um programa é um
    // conjunto de instruções lógicas que, quando
    // executadas, produzem algum resultado. Com isso em
    // mente, ao começar a criar as primeiras linhas de
    // código, logo você notará que é comum receber dados
    // do usuário, prover alguma lógica para processá-los
    // e entãoapresentar resultados desse processamento.

    // ........Operador .......... Comparação
    // ...........== ................igual
    // ...........!=............... diferente
    // ...........<................. menor
    // ...........>................. maior
    // ...........<=.............. menor igual
    // ...........>=.............. maior igual

    // Classificação dos operadores
    // Atribuição
    // Representado pelo símbolo de igualdade =.
    // O operador de atribuição é utilizado para definir
    // o valor inicial ou sobrescrever o valor de uma
    // variáve. Em java definimos um tipo, nome e
    // opcionalmente atribuimos um valor à variável
    // através do operador de atribuição.
    // Exemplo:

    String nome = "Alexandre";
    int idade = 43;
    double peso = 120.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    // Aritméticos
    // O operador aritmético é utilizado para realizar
    // operações matemáticas entre valores numéricos,
    // podendo se tornar ou não uma expressão mais
    // complexa.
    // Os operadores aritméticos são: + (adição),
    // - (subtração), * (multiplicação), / (divisão).

    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    public static void main(String[] args) {
        // ATENÇÃO! O operador de adição (+), quando
        // utilizado em variáveis do tipo texto, realizará a
        // "concatenação de texto".

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        // qual o resultado das expressões abaixo?
        String concatenacao = "";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Unários
        // Esses operadores são aplicados juntamente com
        // um outro operador aritmético. Eles realizam
        // alguns trabalhos básicos como incrementar,
        // decrementar, inverter valores numéricos e
        // booleanos.
        // (+) Operador unário de valor positivo -
        // números são positivos sem esse operador
        // explicitamente;
        // (-) Operador unário de valor negativo - nega
        // um número ou expressão aritmética;
        // (++) Operador unário de incremento de valor -
        // incrementa o valor em 1 unidade;
        // (--) Operador unário de decremento de valor -
        // decrementa o valor em 1 unidade;
        // (!) Operador unário lógico de negação - nega
        // o valor de uma expressão booleana;
        // Exemplo abaixo:
        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);
        numero = -numero;// negativo
        System.out.println(numero);
        System.out.println(numero);
        numero = numero * -1;// positivo
        System.out.println(numero);
        numero = numero + 2;
        System.out.println(numero);
        numero = numero - 2;
        System.out.println(numero);

        // repetição
        System.out.println(numero++);// imprime primeiro e incrementa depois
        System.out.println(numero);
        System.out.println(++numero);// incrementa primeiro e imprime depois

        System.out.println(numero--);// imprime primeiro e decrementa depois
        System.out.println(numero);
        System.out.println(--numero);// decrementa primeiro e imprime depois

        // booleano
        boolean variavel = true;
        System.out.println(!variavel);// false
        System.out.println(variavel);// true
        variavel = !variavel;
        System.out.println(variavel);// false
        variavel = !variavel;
        System.out.println(variavel);// true

        // Ternário
        // O operador de condição ternária é uma forma
        // resumida para definir uma condição e escolher
        // por um dentre dois valores. Você deve pensar
        // numa condição ternária como se fosse uma
        // condição IF normal, porém, de uma forma em que
        // toda a sua estrutura estará escrita numa única
        // linha.
        // O operador ternário é representado pelos
        // símbolos ?; utilizados na seguinte estrutura de
        // sintaxe:
        // <expressão condicional> ? <caso condição seja true> : <caso condição seja
        // false>
        // exemplo:

        int a, b;
        a = 5;
        b = 6;
        String result = "";

        // exemplo utilizando IF/ELSE:
        if (a == b) {
            result = "verdadeiro";
        } else {
            result = "falso";
        }
        System.out.println(result);

        // mesma condição, utilizando operador condicional
        result = (a == b) ? "verdadeiro" : "falso";
        System.out.println(result);

        // Relacionais
        // Os operadores relacionais avaliam a relação
        // entre duas variáveis ou expressões. Neste
        // caso, mais precisamente, definem se o
        // operando à esquerda é igual, diferente, menor,
        // menor ou igual, maior ou maior ou igual ao da
        // direita, retornando um valor booleano como
        // resultado.
        // (==) Quando desejamos verificar se uma
        // variável é IGUAL A OUTRA.
        // (!=) Quando desejamos verificar se uma
        // variável é DIFERENTE DA OUTRA.
        // (>) Quando desejamos verificar se uma
        // variável é MAIOR QUE A OUTRA.
        // (>=) Quando desejamos verificar se uma
        // variável é MAIOR OU IGUAL A OUTRA.
        // (<) Quando desejamos verificar se uma
        // variável é MENOR QUE OUTRA.
        // (<=) Quando desejamos verificar se uma
        // variável é MENOR OU IGUAL A OUTRA.

        int num1 = 1;
        int num2 = 2;
        boolean simNao = false;

        if (num1 < num2) {
            simNao = true;
            System.out.println("Número 1 é menor que numero 2 " + simNao);
        } else if (num1 > num2) {
            simNao = true;
            System.out.println("Número 1 é maior que numero2 " + simNao);
        } else if (num1 == num2) {
            simNao = true;
            System.out.println("Número 1 é igual a numero 2 " + simNao);
        } else if (num1 != num2) {
            simNao = true;
            System.out.println("Número 1 é diferente a numero 2 " + simNao);
        }

        // Lógico
        // Os operadores lógicos representam o recurso
        // que nos permite criar expressões lógicas
        // maiores a partir da junção de duas ou mais
        // expressões.
        // (&&) Operador lógico "E".
        // (||) Operador lógico "OU".

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {// as duas condições tem que ser verdadeira
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {// apenas uma das condições precisa ser verdadeira
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
