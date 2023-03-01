import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswaagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));

        Carro carro3 = new Carro("Ford");
        Carro carro4 = new Carro("Ford");

        System.out.println(carro3.equals(carro4));
    }
}
