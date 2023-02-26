public class Main {
    public static void main(String[] args) {
        // especificando uma fila de strings
        Fila<String> minhaFila = new Fila<>(); // Fila minhaFila = new Fila();

        /**
         * minhaFila.enqueue(new No("primeiro"));
         * minhaFila.enqueue(new No("segundo"));
         * minhaFila.enqueue(new No("terceiro"));
         * minhaFila.enqueue(new No("quarto"));
         */

        // refatoração de código
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        // minhaFila.enqueue(new No("primeiro"));

        minhaFila.enqueue("primeiro");

        System.out.println(minhaFila);

        minhaFila.dequeue();

        System.out.println(minhaFila);

        // aqui apresenta um erro pq foi refatorado para generics para aceitar apenas
        // strings
        // minhaFila.enqueue(1);
    }
}
