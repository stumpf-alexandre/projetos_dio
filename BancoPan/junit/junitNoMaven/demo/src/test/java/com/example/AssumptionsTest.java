package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgos() {
        Assumptions.assumeTrue("als".equals(System.getenv("USER"))); // verifica se o nome do usuario que eu estou
                                                                     // passando é o mesmo que está logado no PC
        Assertions.assertEquals(10, 5 + 5);

        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
    }
}