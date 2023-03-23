package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 8, 3.6], faça:

        /**
         * List notas = new ArrayList(); //antes do java 5
         * List<Double> notas = new ArrayList<>(); //generics(jdk 5) - Diamont
         * Operator(jdk 7)
         * List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d,
         * 3.6));
         * List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //desta
         * forma não se pode implementar mais nem um elemento para dentro da list, nem
         * retirar, ela é limitada
         * notas.add(10d);//vai dar um erro
         * System.out.println(notas);
         * 
         * 
         * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);//transforma a
         * lista imutavel, não se pode adicionar e nem remover
         * notas.add(1d);
         * notas.remove(5d);
         * System.out.println(notas);
         */

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // imprimindo passando a variavel
        System.out.println(notas);

        // imprimindo passando o toString
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        System.out.println(notas);
        notas.set(3, 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores da lista: " + soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0");
        System.out.println(notas);
        notas.remove(0d); // remove tanto da posição indicada, quanto do elemento indicado
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println("Resolva esses exercícios utilizando os métodos da implementação LinkedList:");

        System.out.println("Crie uma lista chamada lista2 "
                + " e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> lista2 = new LinkedList<Double>();
        lista2.add(7d);
        lista2.add(8.5);
        lista2.add(9.3);
        lista2.add(5d);
        lista2.add(7d);
        lista2.add(0d);
        lista2.add(3.6);

        System.out.println("LinkedList: " + lista2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + lista2.getFirst());
        System.out.println("LinkedList: " + lista2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + lista2.removeFirst());
        System.out.println("LinkedList: " + lista2);
    }
}
