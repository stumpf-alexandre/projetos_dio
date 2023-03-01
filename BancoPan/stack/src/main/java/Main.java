import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // minha pilha do java
        Stack<Carro> stackCarro = new Stack<>();

        // metodo que introduz na pilha
        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Chevrolet"));
        stackCarro.push(new Carro("Fiat"));

        // metodo que mostra
        System.out.println(stackCarro);

        // metodo que retira do topo da pilha
        System.out.println(stackCarro.pop());

        // metodo que mostra
        System.out.println(stackCarro);

        // metodo que mostra o elemento no topo da pilha
        System.out.println(stackCarro.peek());

        // metodo que mostra
        System.out.println(stackCarro);

        // metodo que verifica se a pilha esta vazia
        System.out.println(stackCarro.empty());
    }
}
