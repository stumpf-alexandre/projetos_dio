public class ArvoreBinaria<T extends Comparable<T>> {
    private NoBinario<T> raiz;

    // metodo construtor
    public ArvoreBinaria() {
        this.raiz = null;
    }

    // parte do metodo de inserção, verifica se o nó é maior ou menor, e o grava no
    // nó direito ou no nó esquerdo
    private NoBinario<T> inserir(NoBinario<T> atual, NoBinario<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    // metodo para inserção de um elemento novo
    public void inserir(T conteudo) {
        NoBinario<T> novoNo = new NoBinario<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    // metodo que exibe os elementos da arvore InOrdem
    public void exibirInOrdem() {
        System.out.println("\nExibir InOrdem");
        exibirInOrdem(this.raiz);
    }

    // metodo que verifica se a arvore esta vazia no metodo InOrdem
    private void exibirInOrdem(NoBinario<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    // metodo que exibe os elementos da arvore PosOrdem
    public void exibirPosOrdem() {
        System.out.println("\nExibir PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    // metodo que verifica se a arvore esta vazia no metodo PosOrdem
    private void exibirPosOrdem(NoBinario<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    // metodo que exibe os elementos da arvore PreOrdem
    public void exibirPreOrdem() {
        System.out.println("\nExibir PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    // metodo que verifica se a arvore esta vazia no metodo PreOrdem
    private void exibirPreOrdem(NoBinario<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    // metodo para remover um elemento
    public void remove(T conteudo) {
        try {
            NoBinario<T> atual = this.raiz;
            NoBinario<T> pai = null;
            NoBinario<T> filho = null;
            NoBinario<T> temporario = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    // vai para o lado esquerdo da arvore
                    atual = atual.getNoEsq();
                } else {
                    // vai para o lado direito da arvore
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                // caso a lista esteja vazia
                System.out.println("Conteudo não encontrado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) { // pega o nó do lado esquerdo
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) { // pega o nó do lado direito
                    this.raiz = atual.getNoDir();
                } else {
                    // percorre os nós na lista
                    for (temporario = atual, filho = atual.getNoEsq(); filho
                            .getNoDir() != null; temporario = filho, filho = filho.getNoEsq()) {
                        if (filho != atual.getNoEsq()) { // reorganiza os nós descendentes do nó retirado da árvore
                            temporario.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) { // se o nó a direita do nó que eu estou for nula
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) { // se o nó a esquerda do nó que eu estou for nula
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (temporario = atual, filho = atual.getNoEsq(); filho
                        .getNoDir() != null; temporario = filho, filho = filho.getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temporario.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }
        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco Catch");
        }
    }
}