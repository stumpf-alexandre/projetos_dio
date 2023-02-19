package edu.alexandre.docJava;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Alexandre Stumpf
 * @version 1.0
 * @since 19/02/2023
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste métodoé a soma dos dois números
     */
    public int soma(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    /**
     * Este método foi elaborado as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade de somar ou multiplicar
     * dois números
     */
    // CÓDIGO ILEGIVEL E TENTAM AMENIZAR COM OS COMENTÁRIOS
    public int somaMultiplica(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") { // M = multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

    /**
     * Criando nossa documentação no formato html para disponibilizar via web
     * 
     * No terminal execute o comando abaixo
     * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
     *
     * No terminal, dentro da pasta que está o projeto, é só copiar o código para
     * fazer a documentação do projeto
     */
}