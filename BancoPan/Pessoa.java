import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDateTime nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public long getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean maiorDeIdade() {
        return getIdade() >= 18;
    }
}