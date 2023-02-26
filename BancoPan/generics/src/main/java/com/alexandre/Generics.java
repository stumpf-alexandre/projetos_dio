package com.alexandre;

public class Generics {
    /**
     * Lista<String> minhaLista = new Lista<>();
     * public class Lista<T> {
     * private T t;
     * .
     * .
     * .
     * 
     * }
     */

    /**
     * UpperBoundedWildcard
     * Imprime listas de pessoas e herdeiros "extends" de pessoas
     * 
     * public void imprimeLista(List<? extends Pessoa> listaPessoas) {
     * for (Pessoa p : listaPessoas) {
     * System.out.println(p);
     * }
     * }
     * List<Aluno> minhaLista = new List<Aluno>();
     * imprimeLista(minhaLista);
     */

    /**
     * LowerBoundedWildcard
     * Não aceita herdeiros da classe pessoa, só irá aceitar da classe pessoa para
     * cima
     * 
     * public void imprimeLista(List<? super Pessoa> listaPessoas) {
     * for (Pessoa p : listaPessoas) {
     * System.out.println(p);
     * }
     * }
     * List<Aluno> minhaLista = new List<Aluno>();
     * imprimeLista(minhaLista);
     */
}