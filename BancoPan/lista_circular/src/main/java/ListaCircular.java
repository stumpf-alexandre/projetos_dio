public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    // metodo que retorna o tamanho da lista
    public int size() {
        return this.tamanhoLista;
    }

    // metodo que ve se a lista esta vazia
    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    // metodo que implementa o metodo get
    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");
        if (index == 0) {
            return this.cauda;
        }
        No<T> noAux = this.cauda;
        for (int i = 0; i < index; i++) {
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }

    // metodo para implantar um elemento na lista, dependente de sua posição
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    // metodo para remover elemento, dependendo de sua posição, da lista
    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista!");
        No<T> noAux = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux = noAux.getNoProximo();
            }
            noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    // metodo para implementar um elemento na cabeça da lista
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    // metodo toString
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAux.getConteudo() + "}]--->";
            noAux = noAux.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }
}
