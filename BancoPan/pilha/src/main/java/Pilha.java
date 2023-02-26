public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // função quando não tem nada na pilha
    public boolean isEmpty() {
        /**
         * if (refNoEntradaPilha == null) {
         * return true;
         * }
         * return false;
         * 
         * refatorando o codigo em uma linha
         */
        return refNoEntradaPilha == null ? true : false;
    }

    // função que mostra qual elemento esta na pilha
    public No top() {
        return refNoEntradaPilha;
    }

    // função que introduz um novo elemento na pilha
    public void push(No novoNo) {
        No aux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(aux);
    }

    // função que tira um elemento da pilha
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------------\n";
        stringRetorno += "                Pilha\n";
        stringRetorno += "--------------------------\n";

        No noAux = refNoEntradaPilha;

        while (true) {
            if (noAux != null) {
                stringRetorno += "[No{dado=" + noAux.getDado() + "}]\n";
                noAux = noAux.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "==========================\n";
        return stringRetorno;
    }
}
