package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PossitvoNegativoTest {

    @Test
    void avaliaPossitivo() {
        String resultado = PossitvoNegativo.avalia(1.0);
        Assertions.assertEquals("Possitivo",resultado);
    }
    @Test
    void avaliaNegativo() {
        String resultado = PossitvoNegativo.avalia(-1.0);
        Assertions.assertEquals("negativo",resultado);
    } @Test
    void avaliaZero() {
        String resultado = PossitvoNegativo.avalia(1.0);
        Assertions.assertEquals("Zero",resultado);
    }
}