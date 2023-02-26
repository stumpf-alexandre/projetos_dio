public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    // construtor padrão
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    // metodo para ver se a lista esta vazia ou não
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

}