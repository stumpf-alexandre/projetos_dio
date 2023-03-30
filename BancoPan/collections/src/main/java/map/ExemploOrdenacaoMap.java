package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Dadas as seguintes informações sobre livros favoritos e seus autores, crie um
 * dicionário e ordene este dicionário:
 * exibindo(Nome Autor - Nome Livro);
 * 
 * Autor = Hawking, Stephen - Livro = nome: Uma Breve História do Tempo.
 * páginas: 256
 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito. páginas: 408
 * Autor = Harari, Yuval Noah - Livro = nome: 21 Lições Para o século 21.
 * páginas: 432
 */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem inserção\t--");
        Map<String, Livro> meusLivros = new LinkedHashMap<String, Livro>() {
            {
                put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
                put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições Para o século 21", 432));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println("Autor: " + livro.getKey() + " - Nome do Livro: " + livro.getValue().getNome()
                    + ", páginas: " + livro.getValue().getPaginas());

        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros1 = new HashMap<String, Livro>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println("Autor: " + livro.getKey() + " - Nome do Livro: " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println("Autor: " + livro.getKey());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println("Nome do livro: " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println("Número de páginas: " + livro.getValue().getPaginas());
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}