package tratamentoExecoesErros.src.main.java;

import javax.swing.JOptionPane;

public class ExceptionCustomizada2 {
    public static void main(String[] args) {
        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não podemos dividir um número por zero, " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "Não possuimos um número para ser dividido com outro, " + e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}
