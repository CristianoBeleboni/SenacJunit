package com.company;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        int resultado = Calculadora.soma(2,2);
        Assertion.assertEquals(4,resultado);
    }

    @org.junit.jupiter.api.Test
    void subtracao() {
        int resultado = Calculadora.subtracao(3,2);
        Assertion.assertEquals(1,resultado);
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
        int resultado = Calculadora.multiplicacao(2,2);
        Assertion.assertEquals(4,resultado);
    }

    @org.junit.jupiter.api.Test
    void divisao() {
        int resultado = Calculadora.soma(10,2);
        Assertion.assertEquals(5,resultado);
    }
}