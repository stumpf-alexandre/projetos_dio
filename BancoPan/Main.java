import java.util.Stack;

import estruturaDeDadosJavaDio.projetos.Aula8.Etapa2.stack.src.main.java.Carro;

public class Main {

    public static void main(String args[]) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());

    }

}
