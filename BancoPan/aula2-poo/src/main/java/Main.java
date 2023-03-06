public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast evitar na Orientação para Objetos pois da erro
        // Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
