public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

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
    }
}
