package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "als") // Não precissa fazer um assunption
    void validarAlgo2() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgo3() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS) // Executa se for um SO windows
    void validarAlgo4() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({ OS.WINDOWS, OS.MAC }) // Executa em um array de SO
    void validarAlgo5() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17) // Executa somente no java 17
    void validarAlgo6() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17) // Executa somente entre o java 11 até o java 17
    void validarAlgo7() {
        Assertions.assertEquals(10, 5 + 5);
    }
}