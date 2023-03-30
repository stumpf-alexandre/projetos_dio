package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 * Dada a população estimada de alguns estados do Nordeste brasileiro faça:
 * Estado = PE - População = 9616621
 * Estado = AL - População = 3351543
 * Estado = CE - População = 9187103
 * Estado = RN - População = 3534265
 * 
 * Crie um dicionário e relacione os estados e sua populações;
 * Substitua a população do estado do RN por 3534165;
 * Confira se o estado PB está no dicionário, caso não adicione: PB - 4039277;
 * Exiba a população PE;
 * Exiba todos os estados e suas populações na ordem que foi informado;
 * Exiba os estados e suas populações em ordem alfabética;
 * Exiba o estado com o menor população e sua quantidade;
 * Exiba o estado com o maior população e sua quantidade;
 * Exiba a soma da população desses estados;
 * Exiba a média da população deste dicionário de estados;
 * Remova os estados com a população menor que 4000000;
 * Apague o dicionário de estados;
 * Confira se o dicionário está vazio.
 */
public class ExercicioPopulacaoEstimada {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e sua populações");
        Map<String, Integer> minhaPopulacao = new LinkedHashMap<String, Integer>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        for (Map.Entry<String, Integer> populacao : minhaPopulacao.entrySet())
            System.out.println("Estado: " + populacao.getKey() + " - população: " + populacao.getValue());
        System.out.println("----------------------------------");

        System.out.println("Substitua a população do estado do RN por 3534165");
        minhaPopulacao.put("RN", 3534165);
        for (Map.Entry<String, Integer> populacao : minhaPopulacao.entrySet())
            System.out.println("Estado: " + populacao.getKey() + " - população: " + populacao.getValue());
        System.out.println("----------------------------------");

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4039277");
        System.out.println("O estado PB está no dicionário: " + minhaPopulacao.containsKey("PB"));
        System.out.println("----------------------------------");

        minhaPopulacao.put("PB", 4039277);
        for (Map.Entry<String, Integer> populacao : minhaPopulacao.entrySet())
            System.out.println("Estado: " + populacao.getKey() + " - população: " + populacao.getValue());
        System.out.println("----------------------------------");

        System.out.println("Exiba a população PE: " + minhaPopulacao.get("PE"));
        System.out.println("----------------------------------");

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> minhaPopulacao1 = new LinkedHashMap<String, Integer>(minhaPopulacao);
        for (Map.Entry<String, Integer> populacao : minhaPopulacao1.entrySet())
            System.out.println("Estado: " + populacao.getKey() + " - população: " + populacao.getValue());
        System.out.println("----------------------------------");

        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> minhaPopulacao2 = new TreeMap<String, Integer>(minhaPopulacao);
        for (Map.Entry<String, Integer> populacao : minhaPopulacao2.entrySet())
            System.out
                    .println("Estado: " + populacao.getKey() + " - população: " + populacao.getValue());
        System.out.println("----------------------------------");

        Collection<Integer> populacao = minhaPopulacao.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : minhaPopulacao.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao)))
                estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao)))
                estadoMenorPopulacao = entry.getKey();
        }
        System.out.println("Exiba o estado com o menor população e sua quantidade: " + estadoMenorPopulacao
                + ", população: " + Collections.min(populacao));
        System.out.println("----------------------------------");

        System.out.println("Exiba o estado com o maior população e sua quantidade: " + estadoMaiorPopulacao
                + ", população: " + Collections.max(populacao));
        System.out.println("----------------------------------");

        int soma = 0;
        for (Map.Entry<String, Integer> entry : minhaPopulacao.entrySet()) {
            soma += entry.getValue();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println("----------------------------------");

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / minhaPopulacao.size()));
        System.out.println("----------------------------------");

        System.out.println("Remova os estados com a população menor que 4000000");
        System.out.println(minhaPopulacao);
        Iterator<Integer> iterator = minhaPopulacao.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4000000)
                iterator.remove();
        }
        System.out.println(minhaPopulacao);
        System.out.println("----------------------------------");

        System.out.println("Apague o dicionário de estados");
        minhaPopulacao.clear();
        minhaPopulacao1.clear();
        minhaPopulacao2.clear();
        System.out.println("Dicionário 1: " + minhaPopulacao);
        System.out.println("Dicionário 2: " + minhaPopulacao1);
        System.out.println("Dicionário 3: " + minhaPopulacao2);
        System.out.println("----------------------------------");

        System.out.println("Confira se o dicionário está vazio");
        System.out.println("Dicionário 1 está vazio? " + minhaPopulacao.isEmpty());
        System.out.println("Dicionário 2 está vazio? " + minhaPopulacao1.isEmpty());
        System.out.println("Dicionário 3 está vazio? " + minhaPopulacao2.isEmpty());
        System.out.println("----------------------------------");
    }

}

class Populacao {
    private Integer populacao;

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Populacao(Integer populacao) {
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Populacao popul = (Populacao) o;
        return populacao.equals(popul.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(populacao);
    }

    @Override
    public String toString() {
        return "{" +
                "população='" + populacao + '\'' +
                '}';
    }
}

/**
 * public class ExercicioProposto01 {
 * public static void main(String[] args) {
 * System.out.println("Crie um dicionário que relacione os estados e suas
 * respectivas populações: ");
 * Map<String, Integer> populaçãoEstadosNE = new HashMap<>() {{
 * put("PE", 9616621);
 * put("AL", 3351543);
 * put("CE", 9187103);
 * put("RN", 3534265);
 * }};
 * System.out.println(populaçãoEstadosNE);
 * 
 * System.out.println("Substitua a população do estado RN por : 3.534.165");
 * populaçãoEstadosNE.put("RN", 3534165);
 * System.out.println(populaçãoEstadosNE);
 * 
 * System.out.println("Confira se o estado da Paraíba (PB) tucson está no
 * dicionário, caso não, adicione " +
 * "PB - 4.039.277: ");
 * populaçãoEstadosNE.put("PB", 4039277);
 * System.out.println(populaçãoEstadosNE);
 * 
 * System.out.println("Exiba a população do estado PE: " +
 * populaçãoEstadosNE.get("PE"));
 * 
 * System.out.println("Exiba todos os estados e suas populaçãos na ordem em que
 * foram informados: ");
 * Map<String, Integer> populaçãoEstadosNE2 = new LinkedHashMap<>() {{
 * put("PE", 9616621);
 * put("AL", 3351543);
 * put("CE", 9187103);
 * put("RN", 3534265);
 * put("PB", 4039277);
 * }};
 * System.out.println(populaçãoEstadosNE2);
 * 
 * System.out.println("Exiba todos os estados e suas populações na ordem
 * alfabética: ");
 * Map<String, Integer> populaçãoEstadosNE3 = new TreeMap<>(populaçãoEstadosNE);
 * System.out.println(populaçãoEstadosNE3);
 * 
 * Collection<Integer> populacao = populaçãoEstadosNE.values();
 * String estadoMaiorPopulacao = "";
 * String estadoMenorPopulacao = "";
 * for (Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
 * if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao
 * = entry.getKey();
 * if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao
 * = entry.getKey();
 * }
 * System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo
 * valor (%d)\n",
 * estadoMenorPopulacao, Collections.min(populacao));
 * System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo
 * valor (%d)\n",
 * estadoMaiorPopulacao, Collections.max(populacao));
 * 
 * int soma = 0;
 * Iterator<Integer> iterator = populaçãoEstadosNE.values().iterator();
 * while (iterator.hasNext()) {
 * soma += iterator.next();
 * }
 * System.out.println("Exiba a soma da população desses estados: " + soma);
 * int soma2 = 0;
 * for(Map.Entry<String, Integer> entry : populaçãoEstadosNE.entrySet()) {
 * soma2 += entry.getValue();
 * }
 * 
 * 
 * System.out.println("Exiba a média da população deste dicionário de estados: "
 * + (soma / populaçãoEstadosNE.size()));
 * System.out.println("Remova os estados com a população menor que 4.000.000:
 * ");
 * Iterator<Integer> iterator1 = populaçãoEstadosNE.values().iterator();
 * while (iterator1.hasNext()) {
 * if (iterator1.next() <= 4000000) iterator1.remove();
 * }
 * System.out.println(populaçãoEstadosNE);
 * 
 * System.out.println("Apague o dicionario de estados com suas respectivas
 * populações estimadas: ");
 * populaçãoEstadosNE.clear();
 * System.out.println(populaçãoEstadosNE);
 * 
 * System.out.println("Confira se a lista está vazia: " +
 * populaçãoEstadosNE.isEmpty());
 * 
 * }
 * }
 */