public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplamenteEncadeada.add("c1");
        minhaListaDuplamenteEncadeada.add("c2");
        minhaListaDuplamenteEncadeada.add("c3");
        minhaListaDuplamenteEncadeada.add("c4");
        minhaListaDuplamenteEncadeada.add("c5");
        minhaListaDuplamenteEncadeada.add("c6");
        minhaListaDuplamenteEncadeada.add("c7");

        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.remove(3);

        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.add(3, "novoC");

        System.out.println(minhaListaDuplamenteEncadeada);

        minhaListaDuplamenteEncadeada.remove(6);

        System.out.println(minhaListaDuplamenteEncadeada);
    }
}