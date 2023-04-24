import javax.swing.JOptionPane;

//fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                continueLooping = false; // Para sair do looping.
            } catch (NumberFormatException e) {
                // Menssagem para o programador.
                e.printStackTrace();
                // Menssagem personalizada para o usuário.
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro " + e.getMessage());
            } catch (ArithmeticException e) {
                // Menssagem para o programador.
                e.printStackTrace();
                // Menssagem personalizada para o usuário.
                JOptionPane.showMessageDialog(null, "Impossivel dividir um número por zero " + e.getMessage());
            } finally {
                System.out.println("Chegou ao finally");
            }
        } while (continueLooping);

        System.out.println("O código continua...");

    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}