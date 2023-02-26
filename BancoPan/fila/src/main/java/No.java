public class No<T> { // public class No {
    private T obj; // private Object obj;
    private No<T> refNo; // private No refNo;

    public No() {
    }

    public No(T obj) { // public No(Object obj) {
        this.refNo = null;
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) { // public void setObj(Object obj) {
        this.obj = obj;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + obj +
                '}';
    }
}
