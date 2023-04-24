package com.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test // É primordial para testar
    void calcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0)); // cria um cenário
        Assertions.assertEquals(23, jessica.getIdade()); // Executa as validações
    }

    @Test // É primordial para testar
    void retornaMaiorDeIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jésica", LocalDateTime.of(2000, 1, 1, 4, 0, 0)); // cria um cenário
        Assertions.assertTrue(jessica.maiorDeIdade()); // Executa as validações

        Pessoa joao = new Pessoa("João", LocalDateTime.now()); // cria um cenário
        Assertions.assertFalse(joao.maiorDeIdade()); // Executa as validações
    }
}