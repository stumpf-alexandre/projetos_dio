public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // função quando não tem nada na fila
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    // função que introduz um novo elemento na fila
    public void enqueue(Object obj) { // (public void No novoNo) {
        No novoNo = new No(obj); // nova refatoração
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // função que mostra qual o primeiro elemento na fila
    public Object first() { // public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObj(); // return primeiroNo;
        }
        return null;
    }

    // função que tira um elemento da fila
    public Object dequeue() { // public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAux = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAux.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObj(); // return primeiroNo;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAux = refNoEntradaFila;
        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAux.getObj() + "}]--->";
                if (noAux.getRefNo() != null) {
                    noAux = noAux.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}