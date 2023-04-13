package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Scanner;

public class ExercicioTemperatura {
    /**
     * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano
     * e armazene-as em uma lista.
     * Após isto, calcule a média semestral das temperaturas e mostre todas as
     * temperaturas acima desta média, e em que mês elas ocorreram
     */

    public static void main(String[] args) {
        // add as temperaturas e nos seus respectivos meses
        List<TemperaturaMes> tempo = new ArrayList<TemperaturaMes>() {
            {

                add(new TemperaturaMes(38, "Janeiro"));
                add(new TemperaturaMes(37, "Fevereiro"));
                add(new TemperaturaMes(39, "Março"));
                add(new TemperaturaMes(34, "Abril"));
                add(new TemperaturaMes(32, "Maio"));
                add(new TemperaturaMes(29, "Junho"));
            }
        };

        // calculando média de temperatura do semestre
        Iterator<TemperaturaMes> iterator = tempo.iterator();
        int soma = 0;
        int cont = 0;
        int media = 0;
        while (iterator.hasNext()) {
            int next = iterator.next().getTemperatura();
            soma += next;
            cont++;
        }
        media = soma / cont;
        System.out.println("Média de temperatura do semestre " + media + "ºC");

        // comparando e mostrando as temperatturas e seus respectiuvos meses acima da
        // temperatura média semestral
        Iterator<TemperaturaMes> iterator1 = tempo.iterator();
        Iterator<TemperaturaMes> iterator2 = tempo.iterator();
        while (iterator1.hasNext()) {
            int next = iterator1.next().getTemperatura();
            String nextMes = iterator2.next().getMes();
            if (next > media) {
                System.out.println("Temperatura " + next + "ºC, registrado no mês de " +
                        nextMes);
            }
        }
        System.out.println("Todas essas temperaturas foram mais alta que a média semestral " +
                media + "ºC");
    }
}

// classe das temperaturas e dos meses
class TemperaturaMes {
    private int temperatura;
    private String mes;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public TemperaturaMes(int temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "{" +
                "Temperatura=" + temperatura + '\'' +
                ", no mês=" + mes +
                '}';
    }

    // Resposta do professor
    /**
     * public static void main(String[] args) {
     * Scanner scan = new Scanner(System.in);
     * List<Double> temperaturas = new ArrayList<Double>();
     * 
     * // Adiciona as temperaturas na lista.
     * int cont = 0;
     * while (true) {
     * if (cont == 6)
     * break;
     * 
     * System.out.print("Digite a temperatura: ");
     * double temp = scan.nextDouble();
     * temperaturas.add(temp);
     * cont++;
     * }
     * System.out.println("--------------------------------");
     * 
     * // Exibindo todas as temperaturas.
     * System.out.print("Todas as temperaturas: ");
     * temperaturas.forEach(t -> System.out.print(t + " "));
     * 
     * // Calculando e exibindo a média das temperaturas.
     * double media = temperaturas.stream()
     * .mapToDouble(Double::doubleValue)
     * .average()
     * .orElse(0d);
     * System.out.printf("\nMédia das temperaturas: %.1f\n", media);
     * 
     * // Exibindo as temperaturas acima da média.
     * System.out.print("Temperaturas acima da média");
     * temperaturas.stream()
     * .filter(t -> t > media)
     * .forEach(t -> System.out.printf("%.1f", t));
     * 
     * // Exibindo o mês das temperaturas acima da média por extenso.
     * System.out.println("\n\nMeses das temperaturas acima da média: ");
     * Iterator<Double> iterator = temperaturas.iterator();
     * 
     * cont = 0;
     * while (iterator.hasNext()) {
     * Double temp = iterator.next();
     * if (temp > media) {
     * switch (cont) {
     * case (0):
     * System.out.printf("1 - Janeiro: %.1f\n ", temp);
     * break;
     * case (1):
     * System.out.printf("2 - Fevereiro: %.1f\n ", temp);
     * break;
     * case (2):
     * System.out.printf("3 - Março: %.1f\n ", temp);
     * break;
     * case (3):
     * System.out.printf("4 - Abril: %.1f\n ", temp);
     * break;
     * case (4):
     * System.out.printf("5 - Maio: %.1f\n ", temp);
     * break;
     * case (5):
     * System.out.printf("6 - Junho: %.1f\n ", temp);
     * break;
     * default:
     * System.out.println("Não houve temperatura acima da média");
     * break;
     * }
     * }
     * cont++;
     * }
     * }
     */
}