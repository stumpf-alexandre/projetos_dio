package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    // Get e Set
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Constructor
    public Mentoria() {
    }

    public Mentoria(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo = '" + getTitulo() + '\'' +
                ", descricao = '" + getDescricao() + '\'' +
                ", data = " + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
