public class Main {
    public static void main(String[] args) {
        // quadrilátero
        System.out.println("Exercícios dos quadriláteros");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d); // deve ser passado o tipo de dado para ser identificado qual sobrecarga deve
                                   // ser chamada
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f); // deve ser passado o tipo de dado para ser identificado qual sobrecarga deve
                                   // ser chamada
        // para saber qual metodo chamar na sobrecarga é atravez dos parametros
    }
}