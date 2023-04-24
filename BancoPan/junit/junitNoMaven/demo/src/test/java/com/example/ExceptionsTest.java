package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioExcecaoNaTransferencia() { // Validando uma exception
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }

    // ou

    @Test
    void validarCenarioExcecaoNaTransferencia2() { // Não validando uma exception
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas2 = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas2.transfere(contaOrigem, contaDestino, 20));
    }
}