package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>() {
            {
                add(new Gato("Jon", 12, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 18, "amarelo"));
            }
        };

        // classe anonima, não tem nome e é declarada e instanciada em uma única
        // instrução
        meusGatos.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        });

        // lambda
        // meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));

        // reference method
        // meusGatos.sort(Comparator.comparing(Gato::getNome));
    }
}

class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
}
