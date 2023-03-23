package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioArcoIris {
    public static void main(String[] args) {
        /**
         * Crie um conjunto contendo as cores do arco-íris e:
         * 1 - Exiba todas as cores
         * 2 - A quantidade de cores que o arco-íris tem
         * 3 - Exiba as cores em ordem alfabética
         * 4 - Exiba as cores na ordem inversa da que foi informada
         * 5 - Exiba todas as cores que começam com a letra "v"
         * 6 - Remova todas as cores que não começam com a letra "v"
         * 7 - Limpe o conjunto
         * 8 - Confira se o conjunto está vazio
         */

        Set<String> minhasCores = new HashSet<>();
        minhasCores.add("vermelho");
        minhasCores.add("laranja");
        minhasCores.add("amarelo");
        minhasCores.add("verde");
        minhasCores.add("azul");
        minhasCores.add("anil");
        minhasCores.add("violeta");

        System.out.println("1 - Exiba todas as cores: ");
        for (String cor : minhasCores)
            System.out.println(cor);

        System.out.println("2 - A quantidade de cores que o arco-íris tem: ");
        System.out.println("O arco-íris possui " + minhasCores.size() + " cores.");

        System.out.println("3 - Exiba as cores em ordem alfabética: ");
        Set<String> minhasCores1 = new TreeSet<>(minhasCores);
        System.out.println(minhasCores1);

        System.out.println("4 - Exiba as cores na ordem inversa da que foi informada: ");
        System.out.println(minhasCores);
        List<String> minhasCoresList = new ArrayList<>(minhasCores);
        Collections.reverse(minhasCoresList);
        System.out.println(minhasCoresList);

        System.out.println("5 - Exiba todas as cores que começam com a letra v: ");
        Iterator<String> cor = minhasCores.iterator();
        while (cor.hasNext()) {
            String resp = cor.next();
            if (resp.contains("v")) {
                System.out.println(resp);
            }
        }

        System.out.println("6 - Remova todas as cores que não começam com a letra v: ");
        Iterator<String> cor1 = minhasCores.iterator();
        while (cor1.hasNext()) {
            String resp = cor1.next();
            if (!resp.contains("v")) {
                cor1.remove();
            }
        }
        System.out.println(minhasCores);

        System.out.println("7 - Limpe o conjunto");
        System.out.println("Lista 1");
        System.out.println(minhasCores);
        System.out.println("Lista 2");
        System.out.println(minhasCores1);
        minhasCores.clear();
        minhasCores1.clear();
        System.out.println("8 - Confira se o conjunto está vazio: ");
        System.out.println("Lista 1 limpa? " + minhasCores.isEmpty());
        System.out.println("Lista 2 limpa? " + minhasCores1.isEmpty());
    }
}

/**
 * public class ExercicioProposto01 {
 * public static void main(String[] args) {
 * System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
 * Set<String> coresArcoIris = new HashSet<>();
 * coresArcoIris.add("violeta");
 * coresArcoIris.add("anil");
 * coresArcoIris.add("azul");
 * coresArcoIris.add("verde");
 * coresArcoIris.add("amarelo");
 * coresArcoIris.add("laranja");
 * coresArcoIris.add("vermelho");
 * System.out.println(coresArcoIris);
 * 
 * System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
 * for (String cor : coresArcoIris) {
 * System.out.println(cor);
 * }
 * 
 * System.out.println("A quantidade de cores que o arco-íris tem: " +
 * coresArcoIris.size());
 * 
 * System.out.println("Exiba as cores em ordem alfabética: ");
 * Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
 * System.out.println(coresArcoIris2);
 * 
 * System.out.println("Exiba as cores na ordem inversa da que foi informada ");
 * Set<String> coresArcoIris3 = new LinkedHashSet<>(
 * Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja",
 * "vermelho"));
 * System.out.println(coresArcoIris3);
 * List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
 * Collections.reverse(coresArcoIrisList);
 * System.out.println(coresArcoIrisList);
 * 
 * System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
 * for (String cor: coresArcoIris) {
 * if(cor.startsWith("v")) System.out.println(cor);
 * }
 * 
 * System.out.println("Remova todas as cores que não começam com a letra “v”:
 * ");
 * Iterator<String> iterator2 = coresArcoIris.iterator();
 * while (iterator2.hasNext()) {
 * if (!iterator2.next().startsWith("v")) iterator2.remove();
 * }
 * System.out.println(coresArcoIris);
 * 
 * System.out.println("Limpe o conjunto: ");
 * coresArcoIris.clear();
 * 
 * System.out.println("Confira se o conjunto está vazio: " +
 * coresArcoIris.isEmpty());
 * }
 * }
 */
