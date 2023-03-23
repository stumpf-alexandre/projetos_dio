package set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioLinguagemFavorita {
    public static void main(String[] args) {
        /**
         * Crie uma classe LinguagemFavorita que posua os atributos nome, anoDeCriação e
         * ide. Em seguida, crie um conjunto com 3 linguagens e faça um programa que
         * ordene esse conjunto por:
         * 1 - Ordem de inserção
         * 2 - Ordem natural (nome)
         * 3 - IDE
         * 4 - Ano de criação e nome
         * 5 - Nome, ano de criação e IDE
         * Ao final, exiba as linguagens no console, um abaixo da outra
         */

        System.out.println("1 - Ordem de inserção: ");
        Set<Linguagem> minhasLinguagens = new LinkedHashSet<Linguagem>() {
            {
                add(new Linguagem("java", 1991, "inteliJ"));
                add(new Linguagem("python", 1991, "pycharm"));
                add(new Linguagem("php", 1994, "vscode"));
            }
        };
        for (Linguagem linguagem : minhasLinguagens)
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("2 - Ordem natural (nome): ");
        Set<Linguagem> minhasLinguagens1 = new TreeSet<Linguagem>();
        minhasLinguagens1.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens1)
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("3 - IDE");
        Set<Linguagem> minhasLinguagens2 = new TreeSet(new ComparatorIde());
        minhasLinguagens2.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens2)
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("4 - Ano de criação e nome: ");
        Set<Linguagem> minhasLinguagens3 = new TreeSet(new ComparatorAnoNome());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens3)
            System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("5 - Nome, ano de criação e IDE: ");
        Set<Linguagem> minhasLinguagens4 = new TreeSet(new ComparatorNomeAnoIde());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens4)
            System.out.println(linguagem);
    }
}

class Linguagem implements Comparable<Linguagem> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Linguagem(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                "ano de criação='" + anoDeCriacao + '\'' +
                "IDE='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.getNome().compareTo(linguagem.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0)
            return ano;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0)
            return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0)
            return ano;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

/**
 * public class ExercicioProposto02 {
 * public static void main(String[] args) {
 * Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
 * minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991,
 * "Pycharm"));
 * minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995,
 * "IntelliJ"));
 * minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual
 * Studio Code"));
 * 
 * System.out.println("--------\tOrdem de Inserção\t--------");
 * Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
 * Arrays.asList(
 * new LinguagemFavorita("Python", 1991, "Pycharm"),
 * new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
 * new LinguagemFavorita("Java", 1991, "Visual Studio Code")
 * )
 * );
 * for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1)
 * System.out.println(linguagem);
 * 
 * System.out.println("--------\tOrdem Natural: Nome\t--------");
 * Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new
 * TreeSet<>(minhasLinguagensFavoritas);
 * for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2)
 * System.out.println(linguagem);
 * 
 * System.out.println("--------\tOrdem IDE\t--------");
 * Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new
 * TreeSet<LinguagemFavorita>(new ComparatorIde());
 * minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
 * for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3)
 * System.out.println(linguagem);
 * 
 * System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
 * Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new
 * TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
 * minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
 * for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4)
 * System.out.println(linguagem);
 * 
 * System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
 * Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new
 * TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
 * minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
 * for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5)
 * System.out.println(linguagem);
 * 
 * }
 * }
 * 
 * class LinguagemFavorita implements Comparable<LinguagemFavorita> {
 * public String nome;
 * public Integer anoDeCriacao;
 * public String ide;
 * 
 * public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
 * this.nome = nome;
 * this.anoDeCriacao = anoDeCriacao;
 * this.ide = ide;
 * }
 * 
 * @Override
 *           public String toString() {
 *           return "{" +
 *           "nome='" + nome + '\'' +
 *           ", anoDeCriacao=" + anoDeCriacao +
 *           ", ide='" + ide + '\'' +
 *           '}';
 *           }
 * 
 * @Override
 *           public int compareTo(LinguagemFavorita linguagemFavorita) {
 *           return this.nome.compareTo(linguagemFavorita.nome);
 *           }
 * 
 * @Override
 *           public boolean equals(Object o) {
 *           if (this == o) return true;
 *           if (o == null || getClass() != o.getClass()) return false;
 *           LinguagemFavorita that = (LinguagemFavorita) o;
 *           return nome.equals(that.nome);
 *           }
 * 
 * @Override
 *           public int hashCode() {
 *           return Objects.hash(nome);
 *           }
 *           }
 * 
 *           class ComparatorIde implements Comparator<LinguagemFavorita>{
 * 
 * @Override
 *           public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
 *           return lf1.ide.compareToIgnoreCase(lf2.ide);
 *           }
 *           }
 * 
 *           class ComparatorAnoDeCriacaoENome implements
 *           Comparator<LinguagemFavorita>{
 * 
 * @Override
 *           public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
 *           int anoDeCriacao = Integer.compare(lf1.anoDeCriacao,
 *           lf2.anoDeCriacao);
 *           if (anoDeCriacao != 0) return anoDeCriacao;
 *           return lf1.nome.compareToIgnoreCase(lf2.nome);
 *           }
 *           }
 * 
 *           class ComparatorNomeAnoDeCriacaoIde implements
 *           Comparator<LinguagemFavorita>{
 * 
 * @Override
 *           public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
 *           int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
 *           int anoDeCriacao = Integer.compare(lf1.anoDeCriacao,
 *           lf2.anoDeCriacao);
 *           if (nome != 0) return nome;
 *           if (anoDeCriacao != 0) return anoDeCriacao;
 *           return lf1.ide.compareToIgnoreCase(lf2.ide);
 *           }
 *           }
 */