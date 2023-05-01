package br.com.dio.desafio;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        dev.progredir();
        String menssagem = "Conteúdo inscrito :";
        System.out.println(menssagem + dev.getConteudosInscritos());
        dev.progredir();
        String menssagem2 = "Conteúdo concluido :";
        System.out.println(menssagem2 + dev.getConteudosConcluidos());
        double xp = dev.calcularTotalXp();
        String menssagem3 = "XP :";
        System.out.println(menssagem3 + xp);

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        System.out.println(menssagem + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println(menssagem2 + dev.getConteudosConcluidos());
        xp = dev2.calcularTotalXp();
        System.out.println(menssagem3 + xp);
    }
}