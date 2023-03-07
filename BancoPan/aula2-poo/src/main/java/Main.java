public class Main {
    /**
     * Associação possibilita um relacionamento entre classes/ objetos
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast evitar na Orientação para Objetos pois da erro
        // Vendedor vendedor = (Vendedor) new Funcionario();

        Funcionario[] classes = new Funcionario[] { new Vendedor(), new Gerente(), new Funcionario(), new Faxineiro() };
        for (Funcionario classe : classes) { // sobrescrita com polimorfismo
            classe.metodo1();
        }
        System.out.println("");

        for (Funcionario classe : classes) { // sobrescrita com polimorfism
            classe.metodo2();
        }
        System.out.println("");

        Gerente classeFilho2 = new Gerente();
        classeFilho2.metodo2();// sobrescrita pura
    }
}
