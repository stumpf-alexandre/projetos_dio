import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        // metodo que adiciona um elemento na lista
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        // metodo que imprime a lista
        System.out.println(listCarros);

        // metodo que verifica se o elemento que esta sendo passado esta na lista,
        // passando true ou false
        System.out.println(listCarros.contains(new Carro("Ford")));

        // metodo que mostra o elemento no indice passado da lista
        System.out.println(listCarros.get(2));

        System.out.println(listCarros);

        // metodo que mostra em qual indice da lista esta o elemento que está sendo
        // passado como parametro
        System.out.println(listCarros.indexOf(new Carro("Fiat")));

        // metodo que remove o elemento do indice que é passado como parametro da lista
        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);
    }
}
