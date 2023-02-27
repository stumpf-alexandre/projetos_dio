public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    // construtor
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    // metodo para ver o tamanho da lista
    public int size() {
        return this.tamanhoLista;
    }

    // metodo que mostra todos os elementos da lista
    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }

    // metodo que mostra o elemento especifico
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    // metodo para adicionar um elemento na extremidade da lista
    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevious(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    // metodo para adicionar um elemento em uma determinada posição da lista
    public void add(int index, T elemento) {
        NoDuplo<T> noAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAux);
        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevious(noAux.getNoPrevious());
            novoNo.getNoProximo().setNoPrevious(novoNo);
            ;
        } else {
            novoNo.setNoPrevious(ultimoNo);
            ultimoNo = novoNo;
        }
        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevious().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    // metodo para remover um elemento, independente da posição na lista
    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPrevious(null);
            }
        } else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoPrevious().setNoProximo(noAux.getNoProximo());
            if (noAux != ultimoNo) {
                noAux.getNoProximo().setNoPrevious(noAux.getNoPrevious());
            } else {
                ultimoNo = noAux;
            }
        }
        this.tamanhoLista--;
    }

    //metodo toString
    @Override
    public String toString() {
        String stgRetorno = "";
        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < size(); i++) {
            stgRetorno += "[No{conteudo=" + noAux.getConteudo() + "}]--->";
            noAux = noAux.getNoProximo();
        }
        stgRetorno += "null";
        return stgRetorno;
    }
}