package com.company;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        int resultado = Calculadora.soma(2,2);
        Assertions.assertEquals(4,resultado);


    }

    @org.junit.jupiter.api.Test
    void subtracao() {
        int resultado = Calculadora.subtracao(3,2);
        Assertions.assertEquals(1,resultado);
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
        int resultado = Calculadora.multiplicacao(2,2);
        Assertions.assertEquals(4,resultado);
    }

    @org.junit.jupiter.api.Test
    void divisao() {
        int resultado = Calculadora.divisao(10,2);
        Assertions.assertEquals(5,resultado);
    }
}