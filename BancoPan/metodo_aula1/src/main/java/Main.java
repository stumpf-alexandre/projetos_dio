public class Main {
    public static void main(String[] args) {
        // calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicação(7, 8);
        Calculadora.divisao(5, 2.5);

        // menssagem
        System.out.println("Exercício menssagem");
        Menssagem.obterMenssagem(9);
        Menssagem.obterMenssagem(14);
        Menssagem.obterMenssagem(1);
        Menssagem.obterMenssagem(23);
        Menssagem.obterMenssagem(25);

        // emprestimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, 1);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
