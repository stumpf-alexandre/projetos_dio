package com.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfterBeforeTest {
    @BeforeAll // Executa uma vez no inicio da execução, inicialização da conexão no BD
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach // Pode ser executada mais vezes para cada teste executado, insere dados no BD
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach // Pode ser executada mais vezes para cada teste executado, remove dados no BD
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test // Fez os testes nos dados do BD
    void validaDadosDeRetorno() {
        Assertions.assertTrue(true);
        System.out.println("Executou teste de validação dos dados de retorno");
    }

    @Test // Fez os testes nos dados do BD
    void validaDadosDeRetorno2() {
        Assertions.assertNull(null);
        System.out.println("Executou novo teste");
    }

    @AfterAll // Executa uma vez no final da execução, finaliza a conexão no BD
    static void finalizaConexao() {
        BancoDeDados.finalizarConexao();
    }
}