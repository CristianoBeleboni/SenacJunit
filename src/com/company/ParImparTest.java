package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    @Test
    void valida() {
        boolean validadacao = ParImpar.validaPar(2);
        Assertions.assertTrue(validadacao,"Par");
    }


    @Test
    void testValidaPar() {
        boolean validadacao = ParImpar.validaImpar(3);
        Assertions.assertTrue(validadacao,"Par");
    }
}