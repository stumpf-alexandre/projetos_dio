package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /**
         * numerosAleatorios.stream().forEach(new Consumer<String>() {
         * 
         * @Override
         *           public void accept(String s) {
         *           System.out.println(s);
         *           }
         *           });
         */

        // trabalhando com lambda e simplificando o método a cima
        /**
         * numerosAleatorios.stream().forEach(s -> System.out.println(s));
         */

        /**
         * numerosAleatorios.forEach(s -> System.out.println(s));
         */

        numerosAleatorios.forEach(System.out::println);

        System.out.println();

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.err.println("Um set não imprime números repetidos por isso que só aparece 4");

        // copiando os cinco primeiros números para uma variavel
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println();

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        /**
         * numerosAleatorios.stream().map(new Function<String, Integer>() {
         * 
         * @Override
         *           public Integer apply(String s) {
         *           return Integer.parseInt(s);
         *           }
         *           });
         */

        // simplificando o método a cima
        /**
         * numerosAleatorios.stream().map(s -> Integer.parseInt(s));
         */
        // ou
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);

        // ou colocando os números inteiros em uma variavel
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println();

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        /**
         * List<Integer> listParesMaiorQue2 =
         * numerosAleatorios.stream().map(Integer::parseInt)
         * .filter(new Predicate<Integer>() {
         * 
         * @Override
         *           public boolean test(Integer i) {
         *           if (i % 2 == 0 && i > 2) {
         *           return true;
         *           }
         *           return false;
         *           }
         *           }).collect(Collectors.toList());
         */

        // simplificando a variavel a cima
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(listParesMaiorQue2);

        System.out.println();

        System.out.println("Mostre a média dos números: ");
        /**
         * numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
         * 
         * @Override
         *           public int applyAsInt(String s) {
         *           return Integer.parseInt(s).average().ifPresent(new DoubleConsumer()
         *           {
         * @Override
         *           public void accept(double v) {
         *           System.out.println(v);
         *           }
         *           });
         *           }
         *           });
         */

        // simplificando o método
        /**
         * numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(v
         * -> System.out.println(v));
         */
        // ou
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println();

        System.out.println("Remova os valores impares: ");
        /**
         * collectList.removeIf(new Predicate<Integer>() {
         * 
         * @Override
         *           public boolean test(Integer i) {
         *           if (i % 2 != 0)
         *           return true;
         *           return false;
         *           }
         *           });
         */
        // simplificando o código a cima
        collectList.removeIf(i -> i % 2 != 0);
        System.out.println(collectList);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream().skip(3).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        int listNumeros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toSet()).size();
        System.out.println(listNumeros);

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatorios.stream().map(Integer::parseInt).min(Comparator.naturalOrder()).ifPresent(System.out::println);

        System.out.println("Mostre o maior valor da lista: ");
        numerosAleatorios.stream().map(Integer::parseInt).max(Comparator.naturalOrder()).ifPresent(System.out::println);

        System.out.println("Pegue apenas os números impares e some: ");
        int num = numerosAleatorios.stream().map(Integer::parseInt).filter(n -> n % 2 != 0).reduce(0, Integer::sum);
        System.out.println(num);

        System.out.println("Mostre a lista na ordem númerica: ");
        numerosAleatorios.stream().map(Integer::parseInt).sorted(Comparator.naturalOrder()).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Agrupe os valores impares multiplos de 3 e de 5: ");
        numerosAleatorios.stream().map(Integer::parseInt).filter(n -> n % 3 == 0 || n % 5 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}