package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        /**
         * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo = gol - consumo 14,4km/l
         * modelo = uno - consumo 15,6km/l
         * modelo = mobi - consumo 16,1km/l
         * modelo = hb20 - consumo 14,5km/l
         * modelo = kwid - consumo 15,6km/l
         */

        /**
         * Map carrosPopulares = new HashMap(); //antes do java 5
         * Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) -
         * HashMap<String, Double> carrosPopulares = new HashMap<>();
         * Map<String, Double> carrosPopulares = Map.of("gol", 14.4, "uno", 15.6,
         * "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);
         */

        System.out.println("Crie um dicionário que relacione os modelos e seus respactivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());
        System.out.println("----------------------------------");

        System.out.println("Substitua o consumo do gol por 15.2km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println("----------------------------------");

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("----------------------------------");

        System.out.println("Confira se o modelo uno está no dicionário: " + carrosPopulares.containsKey("uno"));
        System.out.println("----------------------------------");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("----------------------------------");

        System.out.println("Exiba o terceiro modelo adicionado: ");
        System.out.println("Não possui um metodo para mostrar um object especifico");
        System.out.println("----------------------------------");

        System.out.println("Exiba os modelos: ");
        Set<String> modelo = carrosPopulares.keySet(); // retorna um set
        System.out.println(modelo);
        System.out.println("----------------------------------");

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        System.out.println("----------------------------------");

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("----------------------------------");

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries2) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println("----------------------------------");

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma = soma + iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("----------------------------------");

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));
        System.out.println("----------------------------------");

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.6))
                iterator2.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("----------------------------------");

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares1.toString());
        System.out.println("----------------------------------");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("----------------------------------");

        System.out.println("Apague o dicionário de carros: ");
        System.out.println(carrosPopulares);
        System.out.println(carrosPopulares1);
        System.out.println(carrosPopulares2);
        carrosPopulares.clear();
        carrosPopulares1.clear();
        carrosPopulares2.clear();
        System.out.println(carrosPopulares);
        System.out.println(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println("----------------------------------");

        System.out.println("Confira se a lista está vazia: ");
        System.out.println("Lista 1 está vazia? " + carrosPopulares.isEmpty());
        System.out.println("Lista 2 está vazia? " + carrosPopulares1.isEmpty());
        System.out.println("Lista 3 está vazia? " + carrosPopulares2.isEmpty());
        System.out.println("----------------------------------");
    }
}
