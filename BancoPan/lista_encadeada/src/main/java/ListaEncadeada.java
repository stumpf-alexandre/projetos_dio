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

    // metodo que retorna o tamanho da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    // metodo que adiciona um novo conteudo na lista
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    // metodo get para retornar o conteúdo
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    // metodo getNo para retornar um nó, vai auxiliar no metodo remove
    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    // metodo para ver se o indice da lista que está sendo passado é do mesmo
    // tamanho do indice da lista
    private void validaIndice(int index) {
        int ultimoIndice = size() - 1;
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index
                    + " desta lista! Esta lista só vai até ao indice " + ultimoIndice + ".");
        }
    }

    // metodo para remover conteúdo da lista
    public T remove(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    // metodo toString
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No{conteudo=" + noAux.getConteudo() + "}--->";
            noAux = noAux.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}