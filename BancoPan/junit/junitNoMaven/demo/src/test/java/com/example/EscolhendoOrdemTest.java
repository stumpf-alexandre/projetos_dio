package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Executa pela numeração do order

//ou

//@TestMethodOrder(MethodOrderer.MethodName.class) // Executa pela ordem alfabética do teste

//ou

//@TestMethodOrder(MethodOrderer.Random.class) // Executa em ordem aleatória os testes

//ou

@TestMethodOrder(MethodOrderer.DisplayName.class) // Executa pela ordem alfabética do display name
public class EscolhendoOrdemTest {
    // @Order(4) // indica qual a ordem de execução dos testes
    @DisplayName("C")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true, "Teste A");
    }

    // @Order(1) // indica qual a ordem de execução dos testes
    @DisplayName("D")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true, "Teste B");
    }

    // @Order(3) // indica qual a ordem de execução dos testes
    @DisplayName("B")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true, "Teste C");
    }

    // @Order(2) // indica qual a ordem de execução dos testes
    @DisplayName("A")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true, "Teste D");
    }
}