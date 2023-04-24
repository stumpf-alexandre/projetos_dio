package com.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//importação statica
/**
 * import static org.junit.jupiter.api.Assertions.assertArrayEquals;
 * import static org.junit.jupiter.api.Assertions.assertNull;
 * import static org.junit.jupiter.api.Assertions.assertNotNull;
 * chama individualmente cada assert
 * 
 * ou
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * chama todos os assert
 * 
 * ai voce deixa de escrever o Assertions na execução da validação
 */

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    @Test
    void validarLancamentos() { // Asserção de arrays
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { -1, 5, 2, 3, 10 };

        // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa); // Verifica se pessoa está nula

        pessoa = new Pessoa("Luciano", LocalDateTime.now());
        Assertions.assertNotNull(pessoa); // Verifica se pessoa não está nula
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);
    }
}