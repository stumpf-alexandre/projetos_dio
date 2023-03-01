import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        // metodo para adicionar um elemento na fila
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        // mostra true ou false quando o elemento é adicionado na fila
        System.out.println(queueCarros.add(new Carro("Peugeot")));

        // metodo para mostrar a fila
        System.out.println(queueCarros);

        // metodo que adiciona na fila, mas com o diferencial de mostrar true quando
        // adicionar na fila ou false se der algum problema, ja o add vai dar erro
        System.out.println(queueCarros.offer(new Carro("Renault")));

        System.out.println(queueCarros);

        // metodo que vai mostrar a cabeça da fila mas não vai retira-la
        System.out.println(queueCarros.peek());

        System.out.println(queueCarros);

        // metodo que retira o elemento da cabeça da fila
        System.out.println(queueCarros.poll());

        System.out.println(queueCarros);

        // metodo que mostra se a fila esta vazia
        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros);

        // metodo que mostra o tamanho da fila
        System.out.println(queueCarros.size());

        System.out.println(queueCarros);
    }
}